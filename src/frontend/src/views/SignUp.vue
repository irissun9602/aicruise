<template>
  <div class="sign-up">
    <h3>Let's create a new account !</h3>
    <input type="text" v-model="email" placeholder="Email"><br>
    <input type="password" v-model="password" placeholder="Password"><br>
    <button @click="signUp">Sign Up</button>
  </div>
</template>

<script>
import firebase from "firebase";

export default {
  name: 'SignUp',
  data() {
    return {
      email: '',
      password: ''
    }
  },
  methods: {
    signUp(){
      firebase.auth()
          .createUserWithEmailAndPassword(this.email, this.password)
          //.then((user)=>alert('your accont has been created!'))
          .catch((error)=>alert('Ooops. '+error.message));
    }
  }
}
</script>

<style scoped>
.sign-up { margin-top: 40px; }
input { margin: 10px 0; width: 200px; padding: 5px; }
button { margin-top: 10px; width: 100px; cursor: pointer; }
p { margin-top: 20px; }
</style>
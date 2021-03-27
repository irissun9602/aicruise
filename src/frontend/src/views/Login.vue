<template>
  <div class="login">
    <h3>Sign In</h3>
    <input type="text" v-model="email" placeholder="Email">
    <input type="password" v-model="password" placeholder="Password"><br>
    <button>Connection</button>
  </div>
</template>

<script> import firesbase from "firebase";

export default {
  name: 'login',
  data() {
    return {
      email: '',
      password: ''
    };
  },
  methods: {
    login(){
      firesbase.auth()
          .signInWithEmailAndPassword(this.email, this.password)
          .catch((error)=> alert('Oops. ' +error.message))
    }
  }
}
</script>

<style scoped> /* "scoped" attribute limit the CSS to this component only */
.login { margin-top: 40px; }
input { margin: 10px 0; width: 200px; padding: 5px; }
button { margin-top: 20px; width: 100px; cursor: pointer; padding: 5px; }
</style>
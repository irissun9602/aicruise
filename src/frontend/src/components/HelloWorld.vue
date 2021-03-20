<template>
  <div class ="hello">
    <h1>{{ msg }}}</h1>
    <table>
      <tr v-for="p in user" v-bind:key="p.id">
        <td>{{ p.id }}</td>
        <td>{{ p.username }}</td>
        <td>{{ p.password }}</td>
      </tr>
    </table>
    <button type="button" v-on:click="getUser()">조회</button>
    <button type="button" v-on:click="clearUser()">지우기</button>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  name: "HelloWorld",
  props:{
    msg: String
  },
  data(){
    return{
      user: []
    }
  },
  methods: {
    getUser() {
      const url ='/api/user/1';
      return axios.get(url)
          .then(response => this.user =response.data);
    },
    clearUser() {
      this.user = [];
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
div{ text-align:center;}
table{ width: 400px; border-collapse: collapse; margin: auto;}
td {border :1px solid gray;}
button {margin: 10px;}
</style>

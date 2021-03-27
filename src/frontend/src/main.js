import Vue from 'vue'
import App from './App.vue'
import router from './router'
import firebase from "firebase";


const config ={

    apiKey: "AIzaSyCApdFV9Lt0dCn2cvS4RwLY3TdecyQ5O6U",
    authDomain: "vueserver-50cd7.firebaseapp.com",
    projectId: "vueserver-50cd7",
    storageBucket: "vueserver-50cd7.appspot.com",
    messagingSenderId: "841319679875",
    appId: "1:841319679875:web:6223fae7aed84730c118b6",
    measurementId: "G-2K0YB0FZPL"
};
// Initialize Firebase
firebase.initializeApp(config);

new Vue({
    router,
    render: h => h(App)
}).$mount('#app')

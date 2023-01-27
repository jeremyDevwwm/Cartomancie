<script setup>
import {onMounted, ref} from 'vue'
import "./components/ArticlesModifier.vue"
import ArticlesModifier from "@/components/ArticlesModifier.vue";
const users = ref([]);

onMounted(() => {
  fetch("http://localhost:8080/api/allusers")
  .then((Response) => Response.json())
  .then((data)=> {users.value=data})
});
</script>

<template>
  <h1 v-for="user in users">{{user.firstname}}</h1>
  <router-link to="/api/PzHwc83jKTz998$263/displayModifyArticles">Voir articles</router-link>
  <router-view>
    <ArticlesModifier/>
  </router-view>
</template>
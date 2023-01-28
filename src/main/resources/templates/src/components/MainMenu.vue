<template>
  <header>
    <!-- Logo ici -->
    <a class="logo" href="MainPage.vue"><img></a>
    <div class="menu">
      <ul v-for="article in articles">
        <li><router-link to="{{article.title.replace(/\s+/g, '')}}">{{article.title}}</router-link></li>

      </ul>
    </div>
  </header>
</template>

<script setup>
import {onMounted, ref} from 'vue'

const articles = ref([]);

onMounted(() => {
  fetch("http://localhost:8080/api/mainPage")
      .then((Response) => Response.json())
      .then((data)=> {articles.value = data})
});

</script>

<style scoped>

</style>
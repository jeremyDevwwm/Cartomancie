<template>
<main class="mainPageContent" >
  <div v-for="article in articles" v-bind:class="article.title.replace(/\s+/g, '')">
    <h2>{{article.title}}</h2>
    <p>{{article.content}}</p>
    <p>{{article.authorName}}</p>
  </div>
</main>
</template>

<script setup>
import {onMounted, ref} from 'vue'

const articles = ref([]);

onMounted(() => {
  fetch("http://localhost:8080/api/mainPage")
      .then((Response) => Response.json())
      .then((data)=> {articles.value=data})
});
</script>

<style scoped>

</style>
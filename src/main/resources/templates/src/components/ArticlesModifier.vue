<template>
  <form action="/api/PzHwc83jKTz998$263/modifyArticles" method="post">

    <div v-for="article in articles">
      <p>{{ article.title }} :</p>
      <textarea v-model:ref="articles">{{ article.content }}</textarea>
      <p>Auteur : </p>
      <input v-model:ref="articles" value="{{ article.authorName }}" id="">
    </div>
    <input type="submit" value = "Modifier">
  </form>
</template>

<script setup>
import {onMounted, ref} from 'vue'
const articles = ref([]);

onMounted(() => {
  fetch("http://localhost:8080/api/PzHwc83jKTz998$263/displayModifyArticles")
      .then((Response) => Response.json())
      .then((data)=> {articles.value=data; console.log(articles.value)});

});

</script>

<style scoped>

</style>
<template>


    <div v-for="article in articles">
      <form action="/api/PzHwc83jKTz998$263/modifyArticle" method="post">
      <p>{{ article.title }} :</p>
      <textarea>{{ article.content }}</textarea>
      <p>Auteur : </p>
      <input v-model="article.authorName">
        <input type="submit" value = "Modifier">
      </form>
    </div>


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
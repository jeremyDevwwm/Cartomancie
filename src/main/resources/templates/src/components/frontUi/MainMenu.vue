<template>
  <header>
    <!-- Logo ici -->
    <a class="logo" href="MainPage.vue"></a>
    <div class="menu">
      <ul>
        <li><router-link to="/api/Biographie">Biographie</router-link></li>
        <li><router-link to="/api/Services">Mes Services</router-link></li>
        <li><router-link to="/api/Tarifs">Mes Tarifs</router-link></li>
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
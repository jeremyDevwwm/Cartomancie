<template>
<h1>Bonjour {{adminName.firstname}}</h1>
  <p>Que souhaitez vous faire ?</p>
  <ul>
    <li><RouterLink to="/api/PzHwc83jKTz998$263/displayModifyArticles">Modifier un article</RouterLink></li>
    <li>Modifier mes réseaux sociaux</li>
    <li>Modifier mes informations</li>
  </ul>
</template>

<script setup>
import { onMounted, ref } from "vue";
import ArticlesModifier from "@/components/adminUi/ArticlesModifier.vue";

const adminName = ref({});

onMounted(() => {
  fetch("http://localhost:8080/api/PzHwc83jKTz998$263/adminMain")
      .then(Response => Response.json())
      .then(data=> adminName.value = data)

});


</script>

<style scoped>

</style>
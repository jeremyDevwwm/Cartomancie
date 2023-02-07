<template>
<div>
  <h1>Qui suis-je ?</h1>
  <p>{{biography.content}}</p>
  <i>{{biography.authorName}}</i>
</div>
</template>

<script setup>
import {onMounted, ref} from 'vue'

const biography = ref([]);

onMounted(() => {
  fetch("http://localhost:8080/api/Biographie")
      .then((Response) => Response.json())
      .then((data)=> {biography.value = data})
});

</script>

<style scoped>

</style>
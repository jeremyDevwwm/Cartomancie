<template>
<div>
  <h1>Mes Services</h1>
  <p>{{myServices.content}}</p>
  <i>{{myServices.authorName}}</i>
</div>
</template>

<script setup>
import {onMounted, ref} from 'vue'

const myServices = ref([]);

onMounted(() => {
  fetch("http://localhost:8080/api/Services")
      .then((Response) => Response.json())
      .then((data)=> {myServices.value = data})
});
</script>

<style scoped>

</style>
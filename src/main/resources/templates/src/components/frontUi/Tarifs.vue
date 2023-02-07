<template>
<div>
  <table>
    <tr>
      <td>{{tarifs.title}}</td>
      <td>{{tarifs.content}}</td>
    </tr>
  </table>
</div>
</template>

<script setup>
import {onMounted, ref} from 'vue'

const tarifs = ref([]);

onMounted(() => {
  fetch("http://localhost:8080/api/Tarifs")
      .then((Response) => Response.json())
      .then((data)=> {tarifs.value = data})
});
</script>

<style scoped>

</style>
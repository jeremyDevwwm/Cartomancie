<template>
  <footer>
    <ul v-for="socialMediaLink in socialMediaLinks">
      <li>
        <a :href="socialMediaLink.networkURL">{{socialMediaLink.networkName}}</a>
      </li>
    </ul>
  </footer>
</template>

<script setup>
import {onMounted, ref} from "vue";

const socialMediaLinks = ref({});

onMounted(()=> {
  fetch("http://localhost:8080/api/footer")
      .then((response)=> response.json())
      .then((data)=> socialMediaLinks.value = data)
});
</script>

<style scoped>

</style>
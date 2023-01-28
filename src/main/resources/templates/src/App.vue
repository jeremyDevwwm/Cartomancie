<script setup>
import "./components/MainPage.vue";
import "./components/MainMenu.vue";
import MainMenu from "@/components/MainMenu.vue";
import MainPage from "@/components/MainPage.vue";
</script>

<template>
<RouterLink to="/api/mainPage">Logo</RouterLink>
  <RouterView>
    <MainMenu/>
    <MainPage/>
  </RouterView>
</template>
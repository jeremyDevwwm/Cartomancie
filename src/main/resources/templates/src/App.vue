<script setup>
import "./components/frontUi/MainPage.vue";
import "./components/frontUi/MainMenu.vue";
import "./components/frontUi/Biographie.vue";
import "./components/frontUi/Services.vue";
import MainMenu from "@/components/frontUi/MainMenu.vue";
import MainPage from "@/components/frontUi/MainPage.vue";
import Biographie from "@/components/frontUi/Biographie.vue";
import Services from "@/components/frontUi/Services.vue";
import Tarifs from "@/components/frontUi/Tarifs.vue";
import AdminMain from "@/components/adminUi/adminMain.vue";
import ArticlesModifier from "@/components/adminUi/ArticlesModifier.vue";
import Footer from "@/components/frontUi/Footer.vue";

const differentPaths = {
  main : "/api/mainPage",
  bio : "/api/Biographie",
  services : "/api/Services",
  tarifs : "/api/Tarifs",
  adminMain : "/api/PzHwc83jKTz998$263/adminMain",
  adminModify : "/api/PzHwc83jKTz998$263/displayModifyArticles"
}

function comparePath(urlPath, constPath){
  return urlPath ==  constPath;
}



</script>

<template>
<RouterLink to="/api/mainPage">Logo</RouterLink>
  <RouterView v-if="comparePath(this.$route.path, differentPaths.main)">
    <MainMenu/>
    <div class="mainPage">
      <MainPage/>
      <Footer/>
    </div>
  </RouterView>
  <RouterView v-else-if="comparePath(this.$route.path, differentPaths.bio)">
    <MainMenu/>
    <div class="mainPage">
      <Biographie/>
      <Footer/>
    </div>
  </RouterView>
  <RouterView v-else-if="comparePath(this.$route.path, differentPaths.services)">
    <MainMenu/>
    <div class="mainPage">
      <Services/>
      <Footer/>
    </div>
  </RouterView>
  <RouterView v-else-if="comparePath(this.$route.path, differentPaths.tarifs)">
    <MainMenu/>
    <div class="mainPage">
      <Tarifs/>
      <Footer/>
    </div>
  </RouterView>
  <RouterView v-else-if="comparePath(this.$route.path, differentPaths.adminMain)">
    <AdminMain/>
  </RouterView>
  <Router-view v-else-if="comparePath(this.$route.path, differentPaths.adminModify)">
    <AdminMain/>
    <ArticlesModifier/>
  </Router-view>

</template>

<style scoped>
.mainPage{
  display: flex;
  flex-direction: column;
}

</style>
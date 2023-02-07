import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      redirect : '/api/mainPage'
    },
    {
      path : '/api/PzHwc83jKTz998$263/',
      redirect : '/api/PzHwc83jKTz998$263/adminMain'
    },
    {
      path : '/api/PzHwc83jKTz998$263/adminMain',
      name : 'admin_main',
      component : () => import('../components/adminUi/adminMain.vue')
    },
    {
      path : '/api/PzHwc83jKTz998$263/displayModifyArticles',
      name : 'modify_article',
      component : () => import("../components/adminUi/ArticlesModifier.vue")
    },
    {
      path : '/api/mainPage',
      name : 'main_page',
      component : () => import('../components/frontUi/MainPage.vue')
    },
    {
      path : '/api/Biographie',
      name : 'Biographie',
      component : ()=> import('../components/frontUi/Biographie.vue')
    },
    {
      path : '/api/Services',
      name : 'Services',
      component : () => import('../components/frontUi/Services.vue')
    },
    {
      path : '/api/Tarifs',
      name : 'Tarifs',
      component : () => import('../components/frontUi/Tarifs.vue')
    }
  ]
})

export default router

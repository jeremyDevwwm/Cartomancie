import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    },
    {
      path : '/api/PzHwc83jKTz998$263/displayModifyArticles',
      name : 'modify article',
      component : () => import("../components/ArticlesModifier.vue")
    },
    {
      path : '/api/mainPage',
      name : 'main page',
      component : () => import('../components/MainPage.vue')
    }
  ]
})

export default router

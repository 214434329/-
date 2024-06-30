import Vue from 'vue'
import VueRouter from 'vue-router'
import BlogIndex from "@/views/BlogIndex.vue";
import BlogBody from "@/views/BlogBody.vue";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'BlogIndex',
    component: BlogIndex
  },
  {
    path: '/blog',
    name: 'BlogBody',
    component: BlogBody
  }
]

const router = new VueRouter({
  routes
})

export default router

<template>
  <div>
    <BlogHead/>
    <BlogList/>
  </div>
</template>

<script>
import BlogHead from "@/components/BlogHead.vue";
import BlogList from "@/components/BlogList.vue";
export default {
  name: 'blogIndex',
  components: {
    BlogHead,
    BlogList,
  }
}
</script>

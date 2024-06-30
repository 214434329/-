<template>
  <div>
    <BlogHead/>
    <BlogBody/>
    <BlogComment/>
  </div>
</template>

<script>
import BlogHead from "@/components/BlogHead.vue";
import BlogBody from "@/components/BlogBody.vue";
import BlogComment from "@/components/BlogComment.vue";
export default {
  name: 'blogIndex',
  components: {
    BlogHead,
    BlogBody,
    BlogComment,
  }
}
</script>

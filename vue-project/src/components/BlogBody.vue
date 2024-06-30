<template>
  <div class="blog-detail">
    <div class="blog-title">
      {{ this.$store.state.blogDetailed.title }}
    </div>
    <div class="blog-body">
      {{ this.$store.state.blogDetailed.body }}
    </div>
  </div>
</template>

<script>
export default {
  mounted() {
    console.log(this.$store.state.blogDetailed);
  }
};
</script>

<style scoped>
.blog-detail {
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
  background-color: #fff;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.blog-title {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 10px;
}

.blog-body {
  font-size: 16px;
  line-height: 1.6;
}

</style>
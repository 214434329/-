<template>
  <div class="container">
    <div class="blogList">
      <div v-for="(bList,index) in blogList" :key="index" class="blogItem">
        <router-link to="/blog">
          <h1 @click="upBlog(index)" class="blogTitle">{{ bList.title }}</h1>
        </router-link>
      </div>
      <hr/>
    </div>
<!--    <div class="waitDevelopment">-->

<!--    </div>-->
  </div>

</template>

<script>
import request from "@/utils/request";

export default {
  data(){
    return{
      blogList:[],
    }
  },
  methods:{
    selectBlogList(){
      request.get('/blog/list')
      .then(res=>{
        this.blogList=res.data;
      })
    },
    upBlog(index){
      this.$store.commit('setBlogDetailed',this.blogList[index]);
    }
  },
  mounted() {
    this.selectBlogList()
  }

}
</script>

<style>
.container {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  width: 80%;
  margin: 0 auto;
}
.blogList {
  border: 1px solid #f0f0f0;
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  width: 50%;
  margin-right: 20px;
}

.blogItem {
  margin-bottom: 20px;
  text-align: center;
}

.blogTitle {
  margin: 0;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}
.waitDevelopment {
  width: 30%;
  padding: 10px;
  border: 1px solid #ccc;
}
</style>
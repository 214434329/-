<template>
  <div>
    <div class="commentTitle">
      评论：
    </div>
    <div class="commentList"  v-for="(comment,index) in commentList" :key="index">
      <div class="commentContent">
        {{ comment.user}}:
      </div>
      <div>
          &nbsp;&nbsp;&nbsp;{{comment.comment}}
      </div>
    </div>
    <div class="commentText">
      <input type="text"  v-model="commentAddAll.comment" />
      <button @click="commentUpLoad">提交</button>
    </div>
  </div>

</template>

<script>
import request from "@/utils/request";

export default {
  data(){
    return{

      commentList:[],
      commentAddAll:{
        bid:this.$store.state.blogDetailed.id,
        user:this.$store.state.username,
        comment:'',
      }
    }
  },
  methods:{
    selectComment(){
      request.post('/comment/list', this.$store.state.blogDetailed)
      .then(res=>{
        this.commentList=res.data;
      })
    },
    commentAdd(){
      request.post('/comment/add',this.commentAddAll)
    },
    commentUpLoad(){
      if (this.$store.state.login===true){
        this.commentAdd()
        this.selectComment();
        location.reload()
        console.log(this.commentList)
      }else{
        alert("请先登录")
      }
    }
  },

  mounted() {
    this.selectComment();
    // console.log(this.commentList[0])
  }
}
</script>


<style>

</style>

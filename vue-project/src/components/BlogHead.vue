<template>
  <div class="blogHead">
    <button class="blogButton" @click="goBlogIndex">首页</button>
    <button v-if="!this.$store.state.login" class="blogButton" @click="showLoginModal">登录</button>
    <button v-if="this.$store.state.login" class="blogButton" @click="exit">退出</button>
    <!-- 登录弹窗 -->
    <div class="loginModal" v-if="showModal">
      <div class="modalContent">
        <h2>登录</h2>
        <form @submit.prevent="handleLogin">
          <label for="username">用户名:</label>
          <input type="text" id="username" v-model="username" required>
          <label for="password">密码:</label>
          <input type="password" id="password" v-model="password" required>
          <button >登录</button>
          <button @click="unShowLoginModal">取消</button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
import request from "@/utils/request";

export default {
  data() {
    return {
      showModal: false,
      login:'',
      username: '',
      password: '',
      loginData:[],
    };
  },
  methods: {
    showLoginModal() {
      this.showModal = true;
    },
    unShowLoginModal() {
      this.showModal = false;
    },
    handleLogin() {
      console.log('Username:', this.username);
      console.log('Password:', this.password);
      const user ={
        username: this.username,
        password: this.password
      };
      request.post('/login', user)
      .then(res => {
        this.loginData=res.data;
        if (this.loginData ==="success"){
          this.login=true
          alert("登录成功")
          this.$store.commit('setUsername',this.username);
          this.$store.commit('setLogin',this.login);
          location.reload()
        }else {
          this.login=false;
          alert("登录失败")
          this.$store.commit('setLogin',this.login);
        }
      })

      this.showModal = false;

    },
    exit() {
      this.login=false;
      this.$store.commit('setUsername','');
      this.$store.commit('setLogin',this.login);
      alert("退出成功")
    },
    goBlogIndex(){
      if (this.$router.currentRoute.path !== '/'){
        this.$router.push('/');
      }



    }
  }
};
</script>

<style>
.blogHead {
  display: flex;
  justify-content: flex-end;
  background-color: #f0f0f0;
  padding: 10px;
}

.blogButton {
  padding: 8px 16px;
  font-size: 16px;
  margin-left: 10px;
  border: none;
  background-color: #007bff;
  color: #fff;
  cursor: pointer;
}

.blogButton:first-child {
  margin-left: 0;
}

.blogButton:hover {
  opacity: 0.8;
}

/* 登录弹窗样式 */
.loginModal {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  display: flex;
  justify-content: center;
  align-items: center;
}

.modalContent {
  background-color: #fff;
  padding: 20px;
  border-radius: 5px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  text-align: center;
}

.modalContent h2 {
  margin-bottom: 10px;
}

.modalContent form {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.modalContent label {
  margin-top: 10px;
}

.modalContent input {
  padding: 8px;
  margin-top: 5px;
  width: 200px;
  box-sizing: border-box;
}

.modalContent button {
  margin-top: 10px;
  padding: 8px 16px;
  background-color: #007bff;
  color: #fff;
  border: none;
  cursor: pointer;
}

.modalContent button:hover {
  opacity: 0.8;
}
</style>
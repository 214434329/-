import Vue from 'vue'
import Vuex from 'vuex'
import createPersistedState from 'vuex-persistedstate'
Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    username:'',
    login:'',
    blogDetailed:[],
  },
  mutations: {
    setUsername (state, username) {
      state.username = username
    },
    setLogin (state, login) {
      state.login = login
    },
    setBlogDetailed (state, blogDetailed) {
      state.blogDetailed = blogDetailed
    }
  },

  plugins: [createPersistedState({})]
})

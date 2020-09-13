import Vue from 'vue'
import Vuex from 'vuex'
import { moduleType } from './modules/admin/types'
import adminModule from './modules/admin'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
  },
  mutations: {
  },
  actions: {
  },
  modules: {
    [moduleType.MODULE_ADMIN]: adminModule
  }
})

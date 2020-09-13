import Vue from 'vue'
import App from './App.vue'
import store from './store'
import router from './router'
import Notifications from 'vue-notification'
import { BaseComponentsPlugin } from './components/base'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import './styles/common.scss'

Vue.use(Notifications)
Vue.use(BaseComponentsPlugin)
Vue.use(BootstrapVue)
Vue.use(IconsPlugin)

Vue.config.productionTip = false

new Vue({
  store,
  router,
  render: h => h(App)
}).$mount('#app')

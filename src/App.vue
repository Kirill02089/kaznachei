<template>
  <div id="app">
    <TheHeader v-if="hasNav" />

    <main>
      <router-view></router-view>
    </main>

    <TheFooter  v-if="hasNav" class="d-none" />

    <the-modal-form-registration></the-modal-form-registration>
    <!-- <the-modal-form-login></the-modal-form-login> -->
    <the-modal-form-reset-password></the-modal-form-reset-password>
  </div>
</template>

<script>
import TheHeader from './components/TheHeader'
import TheFooter from './components/TheFooter'
import TheModalFormRegistration from './components/modals/TheModalFormRegistration'
// import TheModalFormLogin from './components/modals/TheModalFormLogin'
import TheModalFormResetPassword from './components/modals/TheModalFormResetPassword'

export default {
  name: 'App',
  components: {
    TheHeader,
    TheFooter,
    TheModalFormRegistration,
    // TheModalFormLogin,
    TheModalFormResetPassword
  },

  computed: {
    hasNav () {
      return this.$route.path !== '/login'
    }
  }
}
</script>

<style lang="scss">
</style>

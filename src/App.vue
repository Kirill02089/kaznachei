<template>
  <div id="app">
    <TheHeader v-if="hasNav" />

    <main>
      <router-view></router-view>
    </main>

    <TheFooter  v-if="hasNav" class="d-none" />

    <the-modal-form-registration></the-modal-form-registration>
    <the-modal-form-reset-password></the-modal-form-reset-password>
    <the-modal-check-email></the-modal-check-email>
    <the-modal-form-report></the-modal-form-report>
  </div>
</template>

<script>
import TheHeader from './components/TheHeader'
import TheFooter from './components/TheFooter'
import TheModalFormRegistration from './components/modals/TheModalFormRegistration'
import TheModalFormResetPassword from './components/modals/TheModalFormResetPassword'
import TheModalCheckEmail from './components/modals/TheModalCheckEmail'
import TheModalFormReport from './components/modals/TheModalFormReport'

export default {
  name: 'App',
  components: {
    TheHeader,
    TheFooter,
    TheModalFormRegistration,
    TheModalFormReport,
    TheModalCheckEmail,
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

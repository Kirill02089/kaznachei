<template>
  <div id="app">
    <TheHeader />

    <main>
      <router-view></router-view>
    </main>

    <TheFooter class="d-none" />

    <the-modal-form-registration></the-modal-form-registration>
    <the-modal-form-login></the-modal-form-login>
    <the-modal-form-reset-password></the-modal-form-reset-password>
    <the-modal-check-email></the-modal-check-email>
  </div>
</template>

<script>
import TheHeader from './components/TheHeader'
import TheFooter from './components/TheFooter'
import TheModalFormRegistration from './components/modals/TheModalFormRegistration'
import TheModalFormLogin from './components/modals/TheModalFormLogin'
import TheModalFormResetPassword from './components/modals/TheModalFormResetPassword'
import TheModalCheckEmail from './components/modals/TheModalCheckEmail'

export default {
  name: 'App',
  components: {
    TheHeader,
    TheFooter,
    TheModalFormRegistration,
    TheModalFormLogin,
    TheModalFormResetPassword,
    TheModalCheckEmail
  }
}
</script>

<style lang="scss">
</style>

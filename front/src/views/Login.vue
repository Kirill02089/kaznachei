<template>
    <the-main-layout>
       <TheBackground />
       <the-modal-form-login></the-modal-form-login>
    </the-main-layout>
</template>

<script>
import TheMainLayout from '../components/layouts/TheMainLayout'
import { MODAL_TYPES } from '../components/modals'
import TheModalFormLogin from '../components/modals/TheModalFormLogin'
import TheBackground from '../components/TheBackground'

export default {
  name: 'Home',

  components: {
    TheMainLayout,
    TheModalFormLogin,
    TheBackground
  },

  mounted () {
    this.$root.$emit('bv::show::modal', MODAL_TYPES.LOGIN)
  }
}
</script>

<style lang="sass" scoped>
</style>

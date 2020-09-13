<template>
  <base-modal-wrapper
    :id="currentModalId"
    hide-close-icon
  >
    <form-login
      @to-registration="toRegistration"
      @to-reset-password="toResetPassword"
      @submit="onSubmit"
    ></form-login>
  </base-modal-wrapper>
</template>

<script>
import BaseModalMixin from '@/mixins/BaseModalMixin.js'
import BaseModalWrapper from '../base/BaseModalWrapper'
import FormLogin from '../forms/FormLogin'
import { MODAL_TYPES } from '.'

export default {
  name: 'TheModalFormLogin',

  mixins: [BaseModalMixin],

  computed: {
    currentModalId () {
      return MODAL_TYPES.LOGIN
    }
  },

  components: {
    FormLogin,
    BaseModalWrapper
  },

  methods: {
    toRegistration () {
      this.BaseModalHide()
      this.$root.$emit('bv::show::modal', MODAL_TYPES.REGISTRATION)
    },

    toResetPassword () {
      this.BaseModalHide()
      this.$root.$emit('bv::show::modal', MODAL_TYPES.RESET_PASSWORD)
    },

    onSubmit (data) {
      this.BaseModalHide()
      this.$store.dispatch('ADMIN/LOGIN', data)
      this.$router.push('/dashboard').catch(() => {})
    }
  }
}
</script>

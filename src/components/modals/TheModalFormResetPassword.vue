<template>
  <base-modal-wrapper
    :id="currentModalId"
    hide-close-icon
  >
    <form-reset-password @submit="onSubmit"></form-reset-password>
  </base-modal-wrapper>
</template>

<script>
import BaseModalMixin from '@/mixins/BaseModalMixin.js'
import BaseModalWrapper from '../base/BaseModalWrapper'
import FormResetPassword from '../forms/FormResetPassword'
import { MODAL_TYPES } from '.'

export default {
  name: 'TheFormRegistrationModal',

  mixins: [BaseModalMixin],

  computed: {
    currentModalId () {
      return MODAL_TYPES.RESET_PASSWORD
    }
  },

  components: {
    BaseModalWrapper,
    FormResetPassword
  },

  methods: {
    onSubmit () {
      this.BaseModalHide()
      this.$root.$emit('bv::show::modal', MODAL_TYPES.CHECK_EMAIL)
    }
  }
}
</script>

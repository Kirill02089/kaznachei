<template>
  <base-modal-wrapper
    :id="currentModalId"
    hide-close-icon
  >
    <form-registration @to-login="toLogin"></form-registration>
  </base-modal-wrapper>
</template>

<script>
import BaseModalMixin from '@/mixins/BaseModalMixin.js'
import BaseModalWrapper from '../base/BaseModalWrapper'
import FormRegistration from '../forms/FormRegistration'
import { MODAL_TYPES } from '.'

export default {
  name: 'TheModalFormRegistration',

  mixins: [BaseModalMixin],

  computed: {
    currentModalId () {
      return MODAL_TYPES.REGISTRATION
    }
  },

  components: {
    FormRegistration,
    BaseModalWrapper
  },

  methods: {
    toLogin () {
      this.BaseModalHide()
      this.$root.$emit('bv::show::modal', MODAL_TYPES.LOGIN)
    }
  }
}
</script>

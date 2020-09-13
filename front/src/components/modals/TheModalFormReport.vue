<template>
  <base-modal-wrapper
    :id="currentModalId"
  >
    <form-report @submit="onSubmit"></form-report>
  </base-modal-wrapper>
</template>

<script>
import BaseModalMixin from '@/mixins/BaseModalMixin.js'
import BaseModalWrapper from '../base/BaseModalWrapper'
import FormReport from '../forms/FormReport'
import { MODAL_TYPES } from '.'

export default {
  name: 'TheModalFormReport',

  mixins: [BaseModalMixin],

  computed: {
    currentModalId () {
      return MODAL_TYPES.REPORT
    }
  },

  components: {
    BaseModalWrapper,
    FormReport
  },

  methods: {
    onSubmit () {
      this.BaseModalHide()
    }
  }
}
</script>

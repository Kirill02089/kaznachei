<template>
  <base-modal-wrapper
    :id="currentModalId"
    hide-close-icon
  >
    <div>
      <p class="my-4">Для полной регистрации пройдите по ссылке в письме на вашей электронной почте</p>

      <b-button
        class="d-block mx-auto my-3 px-5"
        variant="success"
        @click="BaseModalHide"
      >OK</b-button>
    </div>
  </base-modal-wrapper>
</template>

<script>
import BaseModalMixin from '@/mixins/BaseModalMixin.js'
import BaseModalWrapper from '../base/BaseModalWrapper'
import { MODAL_TYPES } from '.'

export default {
  name: 'TheFormRegistrationModal',

  mixins: [BaseModalMixin],

  computed: {
    currentModalId () {
      return MODAL_TYPES.CHECK_EMAIL
    }
  },

  components: {
    BaseModalWrapper
  }
}
</script>

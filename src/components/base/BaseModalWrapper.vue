<template>
  <b-modal
    ref="modal"
    centered
    hide-header
    hide-footer
    size="lg"
    :id="id"
    :no-close-on-backdrop="hideCloseIcon"
  >
    <b-icon
      v-if="!hideCloseIcon"
      icon="x"
      scale="1.5"
      class="close-icon"
      @click="hide"
    ></b-icon>

    <b-row>
      <b-col cols="12" lg="8" offset-lg="2">
        <slot></slot>
      </b-col>
    </b-row>
  </b-modal>
</template>

<script>
export default {
  name: 'TheBaseModalLayout',

  props: {
    id: {
      type: String,
      default: ''
    },

    hideCloseIcon: {
      type: Boolean,
      default: false
    }
  },

  methods: {
    // TODO: remove $parent
    hide () {
      try {
        this.$parent.BaseModalHide()
      } catch (e) {}
    }
  }
}
</script>

<style scoped lang="scss">
.close-icon {
  position: absolute;
  right: 1rem;
  top: 1rem;
  cursor: pointer;
}
</style>

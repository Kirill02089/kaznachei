const SimpleModal = {
  toggle: () => {},
  show: () => {},
  hide: () => {}
}

export default {
  methods: {
    data () {
      return {
        BaseModalRef: null
      }
    },

    getCurrentModal () {
      return (this.BaseModalRef && this.BaseModalRef) || SimpleModal
    },

    BaseModalToggle () {
      this.getCurrentModal().toggle()
    },

    BaseModalShow () {
      this.getCurrentModal().show()
    },

    BaseModalHide () {
      this.getCurrentModal().hide()
    }
  },

  // TODO: remove $children
  mounted () {
    try {
      // First child of parent component must be TheBaseModalLayout
      this.BaseModalRef = this.$children[0].$children[0]
    } catch (e) {}
  }
}

<template>
  <b-navbar
    variant="secondary"
    toggleable="lg"
    class="p-0 navbar"
  >

    <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

    <b-collapse
      id="nav-collapse"
      class="pr-2"
      is-nav>

      <b-navbar-nav class="ml-auto">
        <b-button class="text-weight-normal mr-3" variant="info"><b-icon icon="person-fill"></b-icon> {{ userText }}</b-button>
        <b-button class="text-weight-normal " variant="info" @click.prevent="logout"><b-icon icon="power" aria-hidden="true"></b-icon> Logout</b-button>
      </b-navbar-nav>
    </b-collapse>
  </b-navbar>
</template>

<script>
import { MODAL_TYPES } from './modals'

export default {
  name: 'TheHeader',

  computed: {
    isAdmin () {
      return this.$store.getters['ADMIN/IS_ADMIN']
    },

    isUser () {
      return this.$store.getters['ADMIN/IS_USER']
    },

    userText () {
      return this.isAdmin ? 'Админ' : 'Пользователь'
    }
  },

  methods: {
    showRegistrationFormModal () {
      this.$root.$emit('bv::show::modal', MODAL_TYPES.REGISTRATION)
    },

    showLoginFormModal () {
      this.$root.$emit('bv::show::modal', MODAL_TYPES.LOGIN)
    },

    logout () {
      this.$router.push('/login')
    }
  }
}
</script>
<style lang="scss" scoped>
.navbar {
 height: 90px;
}
</style>

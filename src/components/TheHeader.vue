<template>
  <b-navbar
    variant="secondary"
    toggleable="lg"
    class="p-0"
  >
    <b-navbar-brand
      href="/"
      class="bg-dark text-white header-logo d-flex justify-content-center align-items-center"
    >Dagent.ru</b-navbar-brand>

    <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

    <b-collapse
      id="nav-collapse"
      class="pr-2"
      is-nav>
      <b-navbar-nav class="ml-auto">
        <b-nav-item class="px-3" to="/">Главная</b-nav-item>
        <b-nav-item class="px-3" to="/about">О нас</b-nav-item>
        <b-nav-item class="px-3" to="/introduction">Как работает сайт</b-nav-item>
      </b-navbar-nav>

      <b-navbar-nav class="ml-auto">
        <b-nav-item @click.prevent="showLoginFormModal">Вход</b-nav-item>
        <b-nav-item @click.prevent="showRegistrationFormModal">Регистрация</b-nav-item>
      </b-navbar-nav>
    </b-collapse>
  </b-navbar>
</template>

<script>
import { MODAL_TYPES } from './modals'

export default {
  name: 'TheHeader',

  methods: {
    showRegistrationFormModal () {
      this.$root.$emit('bv::show::modal', MODAL_TYPES.REGISTRATION)
    },

    showLoginFormModal () {
      this.$root.$emit('bv::show::modal', MODAL_TYPES.LOGIN)
    }
  }
}
</script>
<style lang="scss" scoped>
.header {
  &-logo {
    min-width: 220px;
    min-height: 70px;
  }
}
</style>

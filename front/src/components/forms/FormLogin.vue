<template>
    <div>
      <b-form @submit="onSubmit">
        <h3 class="text-center text-dark mt-3">Вход</h3>

        <b-form-group
          id="input-group-1"
        >
          <b-form-input
            id="input-1"
            v-model="form.email"
            type="text"
            required
            placeholder="Введите логин"
            class="mt-4"
          ></b-form-input>

          <b-form-input
            id="input-2"
            v-model="form.password"
            required
            placeholder="Введите пароль"
            class="mt-4"
          ></b-form-input>

          <b-form-checkbox
            v-model="form.saveMe"
            class="mt-4 text-center"
          >
            Запомнить меня на этом устройстве
          </b-form-checkbox>
        </b-form-group>

        <b-button
          class="w-75 text-center d-block mx-auto mt-4"
          type="submit"
          variant="success"
        >Войти</b-button>

        <a
          href=""
          class="d-block text-center mt-4"
          @click.prevent="$emit('to-reset-password')"
        >Я забыл пароль</a>
        <a
          href=""
          class="d-block text-center mt-0 mb-3"
          @click.prevent="$emit('to-registration')"
        >Зарегистрироваться</a>
      </b-form>
  </div>
</template>

<script>
/**
 *  Events:
 *  @submit - { email: string, password: string }
 *  @to-registration
 *  @to-reset-password
 */
export default {
  name: 'FormLogin',
  data () {
    return {
      form: {
        email: '',
        password: '',
        saveMe: false
      }
    }
  },
  methods: {
    onSubmit (evt) {
      evt.preventDefault()
      this.$emit('submit', this.form)
    }
  }
}
</script>

<style lang="sass" scoped>
</style>

<template>
    <div>
      <b-form @submit="onSubmit">
        <h3 class="text-center text-dark mt-3">ФОРМА РЕПОРТА ПРАВИТЬ ТУТ</h3>

        <p class="mt-4 mb-0">Пожалуйста, введите свой адрес электронной почты. Вы получите ссылку для восстановления пароля. </p>

        <b-form-group
          id="input-group-1"
        >
          <b-form-input
            id="input-1"
            v-model="form.email"
            type="email"
            required
            placeholder="Электронная почта"
            class="mt-4"
          ></b-form-input>
        </b-form-group>

        <b-button
          class="text-center d-block mx-auto mt-4 mb-3"
          type="submit"
          variant="success"
        >Отправить</b-button>
      </b-form>
  </div>
</template>

<script>
/**
 *  Events:
 *  @submit - { email: string }
 *  @to-login
 */
export default {
  name: 'FormReport',
  data () {
    return {
      form: {
        email: ''
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

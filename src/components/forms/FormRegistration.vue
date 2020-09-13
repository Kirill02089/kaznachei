<template>
    <div>
      <b-form @submit="onSubmit">
        <p class="text-center text-dark mt-4">Регистрация даст вам возможность выкупать свои долги с большим дисконтом</p>

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

          <b-form-input
            id="input-2"
            v-model="form.password"
            required
            placeholder="Придумайте пароль"
            class="mt-4"
          ></b-form-input>

          <b-form-input
            id="input-2"
            v-model="form.nextpassword"
            required
            placeholder="Повторите пароль"
            class="mt-4"
          ></b-form-input>

          <b-form-checkbox
            v-model="form.agry"
            class="mt-4 text-center"
          >
            Я даю своё согласие на обработку личных данных
          </b-form-checkbox>
        </b-form-group>

        <b-button
          class="text-center d-block mx-auto mt-4"
          type="submit"
          variant="success"
        >Зарегистрироваться</b-button>

        <a
          href=""
          class="d-block text-center mt-4 mb-3"
          @click.prevent="$emit('to-login')"
        >У меня уже есть аккаунт</a>
      </b-form>
  </div>
</template>

<script>
/**
 *  Events:
 *  @submit - { email: string, password: string, nextpassword: string }
 *  @to-login
 */
export default {
  name: 'FormLogin',
  data () {
    return {
      form: {
        email: '',
        password: '',
        nextpassword: '',
        agry: false
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

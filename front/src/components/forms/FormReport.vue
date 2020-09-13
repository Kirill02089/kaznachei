<template>
    <div>
      <div>
        <b-tabs content-class="mt-3" fill>
          <b-tab title="Остатки на счетах" active>
            <b-form @submit="onSubmit">
              <h3 class="text-center text-dark mt-3">КОНТРАГЕНТЫ/ОСТАТКИ НА СЧЕТАХ</h3>
              <b-form-group
                id="input-group-1"
              >
                <label for="input-with-list" class="mt-2">Выберите вашу организацию</label>
                <b-form-input list="input-list" id="input-with-list" ></b-form-input>
                <b-form-datalist id="input-list" :options="orgs"></b-form-datalist>
                <label class="mt-3" for="input-with-list1">Выберите Банк</label>
                <b-form-input list="input-list1" id="input-with-list1"></b-form-input>
                <b-form-datalist id="input-list1" :options="banks"></b-form-datalist>
                <label class="mt-3" for="input-with-list2">Валюта</label>
                <b-form-input list="input-list2" id="input-with-list2"></b-form-input>
                <b-form-datalist id="input-list2" :options="currency"></b-form-datalist>
                <label class="mt-3" for="input-1">Остаток на счете</label>
                  <b-form-input
                  id="input-1"
                  type="email"
                  required
                  placeholder="Остаток на счете"
                ></b-form-input>
                <b-form-textarea
                  id="textarea"
                  v-model="text"
                  placeholder="Комментарий..."
                  rows="3"
                  max-rows="6"
                  class="mt-4"
                ></b-form-textarea>
              </b-form-group>

              <b-button
                class="text-center d-block mx-auto mt-4 mb-3"
                type="submit"
                variant="success"
              >Отправить</b-button>
            </b-form>
          </b-tab>
          <b-tab title="Размещенные">
            <b-form @submit="onSubmit">
              <h3 class="text-center text-dark mt-3">РАЗМЕЩЕННЫЕ И ПРИВЛЕЧЕННЫЕ СРЕДСТВА</h3>
              <b-form-group
                id="input-group-1"
              >
                <label class="mt-2" for="input-with-list3">Выберите вашу организацию</label>
                <b-form-input list="input-list3" id="input-with-list3"></b-form-input>
                <b-form-datalist id="input-list3" :options="orgs"></b-form-datalist>
                <label class="mt-3" for="input-with-list4">Справочник финансовых сделок</label>
                <b-form-input list="input-list4" id="input-with-list4"></b-form-input>
                <b-form-datalist id="input-list4" :options="Financial"></b-form-datalist>
                <label class="mt-3" for="input-with-list5">Валюта</label>
                <b-form-input list="input-list5" id="input-with-list5"></b-form-input>
                <b-form-datalist id="input-list5" :options="currency"></b-form-datalist>
                <b-form-input
                  id="input-1"
                  type="text"
                  required
                  placeholder="Сумма"
                  class="mt-4"
                ></b-form-input>
              </b-form-group>

              <b-button
                class="text-center d-block mx-auto mt-4 mb-3"
                type="submit"
                variant="success"
              >Отправить</b-button>
            </b-form>
          </b-tab>
        </b-tabs>
      </div>
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
      orgs: ['ООО "Белый конь"', 'ООО "АгроНефть"', 'ООО "Электро"', 'ООО "Мол"', 'ООО "Норильск"'],
      banks: ['ДомРФ', 'СКБ', 'Сбербанк', 'ВТБ', 'Тинькофф'],
      currency: ['RUR', 'USD', 'JEN', 'EUR', 'KND'],
      Financial: ['1111', '2222', '3333', '4444', '5555'],
      text: null
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

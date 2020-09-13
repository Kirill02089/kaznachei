<template>
    <the-main-layout>
      <b-row cols class="h-100">
        <b-col cols="2" class="bg-primary">
          <div>
            <h3>Справочники</h3>
          </div>
        </b-col>

        <b-col cols="10">
           <base-table
                :fields="fields"
                :items="items"
                bordered
                class="mb-0"
            ></base-table>
        </b-col>
      </b-row>
    </the-main-layout>
</template>

<script>
import TheMainLayout from '../components/layouts/TheMainLayout'

export default {
  name: 'Dashboard',

  components: {
    TheMainLayout
  },

  computed: {
    fields () {
      return [
        { key: 'id', label: '' },
        { key: 'inn_kr', label: 'ИНН кредитора' },
        { key: 'inn_dl', label: 'ИНН должника' },
        { key: 'dolg', label: 'Сумма долга' },
        { key: 'discount', label: 'Сумма дисконта' }
      ]
    },
    items () {
      return [
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' },
        { id: '№100', inn_kr: '12345*******', inn_dl: '98765*******', dolg: 'долг 100 000 р', discount: 'выкуплю за 50 000 р' }
      ]
    }
  }
}
</script>

<style lang="sass" scoped>
</style>

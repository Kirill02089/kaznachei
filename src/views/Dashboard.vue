<template>
    <the-main-layout>
      <b-row cols class="h-100">
        <b-col cols="2" class="bg-primary">
          <div>
            <h3>Справочники</h3>
          </div>
        </b-col>

        <b-col cols="10">

          <b-button @click="showReportForm">Создать</b-button>
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
import { MODAL_TYPES } from '../components/modals'

export default {
  name: 'Dashboard',

  components: {
    TheMainLayout
  },

  computed: {
    fields () {
      return [
        { key: 'id', label: '' },
        { key: 'inn', label: 'ИНН' },
        { key: 'kpp', label: 'КПП' },
        { key: 'nameOrg', label: 'Наименование организации' },
        { key: 'filial', label: 'ГО/ФЛ' },
        { key: 'bic', label: 'БИК банка' },
        { key: 'nameBank', label: 'Наименование банка' },
        { key: 'currencyBalance', label: 'Валюта' },
        { key: 'balance', label: 'Сумма в валюте счета' },
        { key: 'contractType', label: 'ВИД договора' },
        { key: 'contractDate', label: 'Дата заключения договора' },
        { key: 'startDate', label: 'Дата начала действия договора' },
        { key: 'endDate', label: 'Дата окончания договора' },
        { key: 'percentRate', label: 'Расчетная ставка годовых, %' },
        { key: 'currencyAmount', label: 'Валюта' },
        { key: 'amount', label: 'Сумма' }
      ]
    },
    items () {
      return [
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' }

      ]
    }
  },

  methods: {
    showReportForm () {
      this.$root.$emit('bv::show::modal', MODAL_TYPES.REPORT)
    }
  }
}
</script>

<style lang="sass" scoped>
</style>

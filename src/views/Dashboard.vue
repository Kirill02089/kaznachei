<template>
    <the-main-layout>
      <b-row cols>
        <b-col cols="2">
          <div class="mt-3">
             <b-card header="Справочники">
              <b-list-group flush>
                <b-list-group-item button class="d-flex justify-content-between align-items-center">
                  Курсы валют
                  <!-- <b-badge variant="primary" pill>14</b-badge> -->
                </b-list-group-item>

                <b-list-group-item button class="d-flex justify-content-between align-items-center">
                  Кредитные организации
                  <!-- <b-badge variant="primary" pill>2</b-badge> -->
                </b-list-group-item>
              </b-list-group>
            </b-card>
          </div>
        </b-col>

        <b-col cols="10">
          <b-row class="align-items-center pl-0 pt-3">
            <b-col><h4 class="">Отчёты</h4></b-col>
            <b-col><b-button @click="showReportForm">Создать</b-button></b-col>
          </b-row>

          <b-row>
            <b-table class="ml-2 mt-3 dashboard-table text-center" :items="items" :fields="fields" striped small bordered sticky-header="800px" responsive="sm">
              <template v-slot:cell(show_details)="row">
                <b-button variant="dark" size="sm" @click="row.toggleDetails" class="mr-2">
                  <b-icon id="tooltip-target-1" :icon="row.detailsShowing ? 'chevron-bar-contract' : 'chevron-bar-expand'" variant="white"></b-icon>
                  <b-tooltip target="tooltip-target-1" triggers="hover">
                    Нажмите, чтобы показать/скрыть дополнительную информацию
                  </b-tooltip>
                </b-button>
              </template>

              <template v-slot:row-details="row">
                <b-card>
                  <b-row class="mb-2">
                    <b-col class="text-sm-right"><b>Валюта:</b></b-col>
                    <b-col class="text-sm-left">{{ row.item.currencyBalance }}</b-col>
                  </b-row>

                  <b-row class="mb-2">
                    <b-col class="text-sm-right"><b>Сумма в валюте счета:</b></b-col>
                    <b-col class="text-sm-left">{{ row.item.balance }}</b-col>
                  </b-row>

                  <b-row class="mb-2">
                    <b-col class="text-sm-right"><b>ВИД договора:</b></b-col>
                    <b-col class="text-sm-left">{{ row.item.contractType }}</b-col>
                  </b-row>

                  <b-row class="mb-2">
                    <b-col class="text-sm-right"><b>Дата заключения договора:</b></b-col>
                    <b-col class="text-sm-left">{{ row.item.contractDate }}</b-col>
                  </b-row>

                  <b-row class="mb-2">
                    <b-col class="text-sm-right"><b>Дата начала действия договора:</b></b-col>
                    <b-col class="text-sm-left">{{ row.item.startDate }}</b-col>
                  </b-row>

                  <b-row class="mb-2">
                    <b-col class="text-sm-right"><b>Дата окончания договора:</b></b-col>
                    <b-col class="text-sm-left">{{ row.item.endDate }}</b-col>
                  </b-row>

                  <!-- <b-button size="sm" @click="row.toggleDetails">Hide Details</b-button> -->
                </b-card>
              </template>
            </b-table>

          </b-row>
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
        // { key: 'currencyBalance', label: 'Валюта' },
        // { key: 'balance', label: 'Сумма в валюте счета' },
        // { key: 'contractType', label: 'ВИД договора' },
        // { key: 'contractDate', label: 'Дата заключения договора' },
        // { key: 'startDate', label: 'Дата начала действия договора' },
        // { key: 'endDate', label: 'Дата окончания договора' },
        { key: 'percentRate', label: 'Расчетная ставка годовых, %' },
        { key: 'currencyAmount', label: 'Валюта' },
        { key: 'amount', label: 'Сумма' },
        { key: 'show_details', label: 'Подробнее' }
      ]
    },
    items () {
      return [
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
        { id: '1234567890', inn: '1234567890', kpp: '12345679', nameOrg: 'АО "Организация Росатома"', filial: 'ГО', bic: '42202837', nameBank: 'Банк ВТБ (ПАО)', currencyBalance: 'RUR', balance: '20000', contractType: 'Депозит', contractDate: '01.01.2020', startDate: '01.02.2020', endDate: '01.02.2020', percentRate: '5,65', currencyAmount: 'RUR', amount: '10000' },
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

<style lang="scss" scoped>
.dashboard-table {
  font-size: 14px;
  border: 1px solid;

  .btn {
    font-size: 16px;
  }
}
</style>

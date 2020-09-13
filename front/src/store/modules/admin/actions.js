import {
  actionTypes,
  mutationTypes
} from './types'

import api from '@/api'

console.log('APIS', api)

export default {
  async [actionTypes.ACTION_LOGIN] ({ commit }, userData) {
    const user = await api.login(userData)

    commit(mutationTypes.MUTATION_SET_USER, user)
  },
  [actionTypes.ACTION_LOGOUT] ({ commit }, userData) {
    commit(mutationTypes.MUTATION_SET_USER, {})
  }
}

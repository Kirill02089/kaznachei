import {
  mutationTypes
} from './types'

export default {
  [mutationTypes.MUTATION_SET_USER]: (state, user) => {
    state.user = user
  }
}

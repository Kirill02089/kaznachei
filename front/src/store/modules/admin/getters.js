import {
  getterTypes
} from './types'

export default {
  [getterTypes.GETTER_IS_ADMIN]: (state) => state.user && state.user.role === 'admin',
  [getterTypes.GETTER_IS_USER]: (state) => state.user && state.user.role === 'user',
  [getterTypes.GETTER_HAS_USER]: (state) => state.user && state.user.role
}

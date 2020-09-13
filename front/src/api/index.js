export default {
  login: ({ email, password }) => {
    return new Promise((resolve) => {
      const user = { role: 'user' }
      if (email === 'admin') {
        user.role = 'admin'
      }

      setTimeout(() => {
        resolve(user)
      }, 300)
    })
  }
}

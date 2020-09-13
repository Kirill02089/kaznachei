const BaseComponents = {
  BaseTable: () => import('./BaseTable.vue')
}

const BaseComponentsPlugin = {
  install: (Vue) => {
    Object.keys(BaseComponents).forEach(componentName => {
      Vue.component(componentName, BaseComponents[componentName])
    })
  }
}

export {
  BaseComponentsPlugin,
  BaseComponents
}

<template>
    <div class="TheBackground"></div>
</template>

<script>
export default {
  name: 'TheBackground'
}
</script>

<style lang="scss" scoped>
.TheBackground {
  width: 100vw;
  height: 100vh;
  background: url('~@/assets/background.png');
  background-size: cover;
  filter: blur(12px);
  position: absolute;
  top: 0;
  left: 0;
}
</style>

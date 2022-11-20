<template>
  <div>
    <bg></bg>

    <div class="topbox1">
      Profile
    </div>

    <div>
      <div class="boxinbo"></div>
      
  </div>
</div>
</template>
<style scoped>
.topbox1 {
  position: absolute;
  width: 1164px;
  height: 66px;
  left: 148px;
  top: 147px;

  background: #924d3c;
  border-radius: 20px;

  text-align: center;
  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 40px;
  line-height: 48px;

  color: #ffffff;
}
.boxinbo {
  position: absolute;
  width: 1163px;
  height: 748px;
  left: 149px;
  top: 225px;

  background: #a37564;
  border-radius: 20px;
}
</style>
<script>
import bg from "../components/backgroud.vue";
import { mdiBasketPlusOutline } from '@mdi/js';
import { mdiAccount } from '@mdi/js'
export default {
  components: {
    bg,
  },
  
  }
</script>
<script>
import bg from "../components/backgroud.vue";
export default {
  components: {
    bg,
  },
};
</script>
<template>
  <div>
    <bg></bg>
    <div>
      <div class="bgno"></div>
      <div class="tttt">Bill Payment</div>
    </div>

    <div class="fBlocks"></div>
    <div class="sBlocks"></div>

    <v-btn class="pay">Submit</v-btn>
  </div>
</template>

<style scoped>
.tttt {
  position: absolute;
  width: 200px;
  height: 60px;
  left: 650px;
  top: 157px;
  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 35px;
  line-height: 30px;

  color: #ffffff;
}
.bgno {
  position: absolute;
  width: 283px;
  height: 89px;
  left: 587px;
  top: 126px;

  background: #924d3c;
  border-radius: 30px;
}
.fBlocks {
  position: absolute;
  width: 1211px;
  height: 739px;
  left: 124px;
  top: 249px;

  background: #924d3c;
  border-radius: 20px;
}
.sBlocks {
  position: absolute;
  width: 1163px;
  height: 672px;
  left: 149px;
  top: 282px;

  background: #a37564;
  border-radius: 20px;
}
.pay {
  position: absolute;
  width: 180px;
  height: 672px;
  left: 650px;
  top: 900px;
  border-radius: 20px ;
  background-color: rgba(146, 77, 60, 0.7) !important;
}
</style>>
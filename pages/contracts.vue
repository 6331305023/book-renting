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
      <div class="tttt">Contract Us</div>
    </div>

    <div class="fBlocks"></div>
    <div class="sBlocks"></div>
    <div>
      <div class="bo1">ติดต่อเรา</div>
      <div class="bo2"></div>
      <div class="bo3">
        <v-btn class="edit" fab text small @click="prev">
          <v-icon large>mdi-phone-outline</v-icon>
        </v-btn>
      </div>
      <div class="bo4"></div>
      <div class="bo5">
        <v-btn class="edit" fab text small @click="prev">
          <v-icon large>mdi-email-outline</v-icon>
        </v-btn>
      </div>
      <div class="bo6"></div>
      <div class="bo7">
        <v-btn class="edit" fab text small @click="prev">
          <v-icon large>mdi-map-marker-check-outline</v-icon>
        </v-btn>
      </div>
      <div class="bo8"></div>
    </div>
    <div class="thx">- ขอบพระคุณที่ทำการเช่ากับเรา -</div>
  </div>
</template>

<style scoped>
.thx {
  position: absolute;
  width: 300px;
  height: 27px;
  left: 590px;
  top: 811px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 22px;
  line-height: 27px;
  /* identical to box height */

  color: #ffffff;
}
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
  border-radius: 20px;
  background-color: rgba(146, 77, 60, 0.7) !important;
}
.bo1 {
  position: absolute;
  width: 163px;
  height: 80px;
  left: 230px;
  top: 266px;

  background: #c1a6a6;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 23px;
  line-height: 28px;
  text-align: center;
  color: #ffffff;
}
.bo2 {
  position: absolute;
  width: 853px;
  height: 80px;
  left: 393px;
  top: 266px;

  background: #b59d9d;
}
.bo3 {
  position: absolute;
  width: 163px;
  height: 80px;
  left: 230px;
  top: 346px;

  background: #b59d9d;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 23px;
  line-height: 28px;
  text-align: center;
  color: #ffffff;
}
.bo4 {
  position: absolute;
  width: 853px;
  height: 80px;
  left: 393px;
  top: 346px;

  background: #c1a6a6;
}
.bo5 {
  position: absolute;
  width: 163px;
  height: 80px;
  left: 230px;
  top: 426px;

  background: #c1a6a6;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 23px;
  line-height: 28px;
  text-align: center;
  color: #ffffff;
}
.bo6 {
  position: absolute;
  width: 853px;
  height: 80px;
  left: 393px;
  top: 426px;

  background: #b59d9d;
}
.bo7 {
  position: absolute;
  width: 163px;
  height: 80px;
  left: 230px;
  top: 507px;

  background: #b59d9d;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 23px;
  line-height: 28px;
  text-align: center;
  margin-bottom: auto;
  color: #ffffff;
}
.bo8 {
  position: absolute;
  width: 853px;
  height: 80px;
  left: 393px;
  top: 507px;

  background: #c1a6a6;
}
</style>>
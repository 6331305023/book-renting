<script>
import bg from "../components/backgroud.vue";
import bib from "../components/boxinboxx.vue";
export default {
  components: {
    bg,
    bib,
  },
};
</script>
<template>
  <div>
<bg></bg>
    
   <div>
    <bib></bib>
    <div class="tt">   
    Profile
    </div>
   </div>
   <div>    
    <div class="b1">E-mail</div>
    <div class="b2"></div>
    <div class="b3">Username</div>
    <div class="b4"></div>
    <div class="b5">Address</div>
    <div class="b6"></div>
    <div class="b7">Phone</div>
    <div class="b8"></div>
   <v-btn class="edit" fab text small @click="prev">
    <v-icon large>mdi-pencil-outline</v-icon> EDIT
  </v-btn>
  </div>
  
  </div>
</template>

<style scoped>
.edit{
  left: 700px;
  top: 630px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 30px;
}
.tt {
  position: absolute;
  width: 200px;
  height: 85px;
  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 40px;
  line-height: 48px;
  top: 155px;
  left: 670px;
  color: #ffffff;
}
.b1 {
  position: absolute;
  width: 163px;
  height: 80px;
  left: 230px;
  top: 266px;

  background: rgba(146, 77, 60, 0.7);

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 23px;
  line-height: 28px;
  text-align: center;
  color: #ffffff;
}
.b2 {
  position: absolute;
  width: 853px;
  height: 80px;
  left: 393px;
  top: 266px;

  background: #ba8c7b;
}
.b3 {
  position: absolute;
  width: 163px;
  height: 80px;
  left: 230px;
  top: 346px;

  background: #ba8c7b;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 23px;
  line-height: 28px;
  text-align: center;
  color: #ffffff;
}
.b4 {
  position: absolute;
  width: 853px;
  height: 80px;
  left: 393px;
  top: 346px;

  background: #924d3c;
}
.b5 {
  position: absolute;
  width: 163px;
  height: 80px;
  left: 230px;
  top: 426px;

  background: rgba(146, 77, 60, 0.7);

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 23px;
  line-height: 28px;
  text-align: center;
  color: #ffffff;
}
.b6 {
  position: absolute;
  width: 853px;
  height: 80px;
  left: 393px;
  top: 426px;

  background: #ba8c7b;
}
.b7 {
  position: absolute;
  width: 163px;
  height: 80px;
  left: 230px;
  top: 507px;

  background: #ba8c7b;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 23px;
  line-height: 28px;
  text-align: center;
  margin-bottom: auto;
  color: #ffffff;
}
.b8 {
  position: absolute;
  width: 853px;
  height: 80px;
  left: 393px;
  top: 507px;

  background: #924d3c;
}
</style>
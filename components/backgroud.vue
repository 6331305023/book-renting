<template>
  <div>
    <div
    @mouseover="hover = true"
    @mouseleave="hover = false"
  />
    <div class="bg"></div>
    <div class="topbar"></div>  
    <div class="logo" style="90px">
      <img src="https://cdn.discordapp.com/attachments/985590447684591626/1046113630774636675/bkrt-removebg-preview__1___1_-removebg-preview_1.png">
    </div>
    <div class="rc" @click="gorent">Rental conditions</div>
    <div class="pm" @click="goPm">Payment</div>
    <div class="ct" @click="goCont">Contract Us</div>
    <div>
      <v-col cols="30" sm="6" md="3" class="search" >
        <v-text-field label="Search Here" outlined></v-text-field>
      </v-col>
    </div>
    <v-btn fab text small @click="prev">
      <v-icon medium>mdi-chevron-left</v-icon>
    </v-btn>
    <v-btn class="mg" fab text small @click="prev">
      <v-icon large>mdi-magnify</v-icon>
    </v-btn>
    <v-btn class="ac" fab text small @click="prev">
      <v-icon large>mdi-account-circle-outline</v-icon>
    </v-btn>
    <v-btn class="bell" fab text small @click="prev">
      <v-icon large>mdi-bell-alert-outline</v-icon>
    </v-btn>
    <v-btn class="cart" fab text small @click="prev">
      <v-icon large>mdi-cart-outline</v-icon>
    </v-btn>
  </div>
</template>

<style scoped>
.topbar {
  position: absolute;
  width: 100%;
  height: 103px;
  left: 0px;
  top: 0px;

  background: #924D3C;;
}
.bg {
  position: absolute;
  align-items: center;
  width: 100%;
  height: 1000px;
  left: 0px;
  top: 0px;
  background: #ba8c7b;
}

.rent {
  position: absolute;
  width: 127px;
  height: 30px;
  left: 28px;
  top: 44px;

  text-align: center;
  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 25px;
  line-height: 30px;

  color: #000000;

  background: #eee7e7;
  border-radius: 20px;
}
.rc {
  position: absolute;
  width: 204px;
  height: 30px;
  left: 202px;
  top: 44px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 25px;
  line-height: 30px;
  
  color: #ffffff;
}
.rc:hover {
  border-radius: 10px;
  background: green;
}
.pm {
  position: absolute;
  width: 104px;
  height: 30px;
  left: 445px;
  top: 44px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 25px;
  line-height: 30px;

  color: #ffffff;
}
.pm:hover {
  border-radius: 10px;
  background: green;
}
.ct {
  position: absolute;
  width: 129px;
  height: 30px;
  left: 597px;
  top: 44px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 25px;
  line-height: 30px;

  color: #ffffff;
}
.ct:hover {
  border-radius: 10px;
  background: green;
}
.search {
  position: absolute;
  width: 484px;
  height: 36px;
  left: 774px;
  top: 20px;
}
.logo{
  position: absolute;
  
  left: 40px;
  top: 20px;
}
.mg{
  right: -1055px;
  top: 40px;
}
.ac{
  right: -1070px;
  top: 40px;
}
.bell{
  right: -1080px;
  top: 40px;
}
.cart{
  right: -1090px;
  top: 40px;
}

</style>

<script>
export default {
  data() {
    return {
      hover: false,
    };
  },

 methods: {
    prev(){
      this.$router.push('./homepage');
    },
    gorent(){
      this.$router.push('./rentalCon');
    },
    goPm(){
      this.$router.push('./payment');
    },
    goCont(){
      this.$router.push('./contract');
    },
  },

}


</script>

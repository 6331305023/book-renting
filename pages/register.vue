<template>
  <div>
    <bg></bg>

    <div class="topbox">
      Register
    </div>

    <div>
      <div class="boinbo"></div>
      <div>
        <input class="name" type="text" placeholder="UserName" v-model="user.name"/>
      </div>
      <div>
        <input class="email" type="text" placeholder="E-mail" v-model="user.username"/>
      </div>
      <div>  
        <input class="pass" type="password" placeholder="Password" v-model="user.password"/>
      </div>
      <v-btn class="si" color="#924D3C">Sign In</v-btn>
    </div>
  </div>
</template>

<style scoped>
.topbox {
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
.boinbo {
  position: absolute;
  width: 1163px;
  height: 748px;
  left: 149px;
  top: 212px;

  background: #a37564;
  border-radius: 20px;
}
.name{
  position: absolute;
width: 595px;
height: 87px;
left: 437px;
top: 307px;

background: rgba(146, 77, 60, 0.7);
border-radius: 20px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 50px;
line-height: 30px;

color: #FFFFFF;
}
.email{
  position: absolute;
width: 595px;
height: 87px;
left: 437px;
top: 437px;

background: rgba(146, 77, 60, 0.7);
border-radius: 20px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 50px;
line-height: 30px;

color: #ffffff;
}
.pass{
  position: absolute;
  width: 595px;
  height: 87px;
  left: 435px;
  top: 572px;
  
  background: rgba(146, 77, 60, 0.7);
  border-radius: 20px;

  font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 50px;
line-height: 30px;

color: #ffffff;
}
.si{
  position: absolute;
width: 205px;
height: 68px;
left: 632px;
top: 712px;

background: #924D3C;
border-radius: 10px;
}
</style>

<script>
import bg from "../components/backgroud.vue";
export default {
  components: {
    bg,
  },
  data: () => ({
    user: {
      name: "",
      username: "",
      password: "",      
    },
  }),
};
</script>

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
      <div class="ttt">Payment</div>
    </div>

    <div class="fBlock"></div>
    <div class="sBlock"></div>
    <div class="box1">SCB</div>
    <div class="box2">
        <div class="no">1111-1-11111-1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;นาย หกหกดหกด</div>
    </div>
    <div class="det">เมื่อโอนเงินแล้วโปรดแจ้งทางร้านค้า ผ่าน contact us ถึง rent@booklolololoe.com อ้างถึง order<br></br>
        โปรดแจ้งรายละเอียดการโอนเงินด้วย<br></br>
        · ธนาคาร / สาขา<br></br>
        · วันที่ เวลา ที่โอน<br></br>
        · จำนวนเงิน<br></br>
        · ชื่อ นามสกุล ของท่าน<br></br>
        · หมายเลขโทร ติดต่อกลับ<br></br>
        เมื่อทางร้านตรวจสอบความถูกต้องแล้วจะดำเนินการส่งของให้ในวันถัดไป แต่ของดวันเสาร์ อาทิตย์และวันหยุดราชการ กรณีต้องการเปลี่ยนแปลงรายการ หรือยกเลิก ขอให้แจ้งภายใน 3 วัน และต้องก่อนโอนเงิน</div>
    
  </div>
</template>

<style scoped>
.ttt {
  position: absolute;
  width: 137px;
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
  width: 250px;
  height: 89px;
  left: 587px;
  top: 126px;

  background: #924d3c;
  border-radius: 30px;
}
.fBlock {
  position: absolute;
  width: 1211px;
  height: 739px;
  left: 124px;
  top: 249px;

  background: #924d3c;
  border-radius: 20px;
}
.sBlock {
  position: absolute;
  width: 1163px;
  height: 672px;
  left: 149px;
  top: 282px;

  background: #a37564;
  border-radius: 20px;
}
.det{
    position: absolute;
width: 1102px;
height: 300px;
left: 200px;
top: 440px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 20px;
line-height: 30px;

color: #FFFFFF;

}
.box1 {
    position: absolute;
    width: 163px;
    height: 80px;
    left: 230px;
    top: 333px;
  
    background: #c1a6a6;
  
    font-family: "Inter";
    font-style: normal;
    font-weight: 400;
    font-size: 23px;
    line-height: 28px;
    text-align: center;
    color: #ffffff;
  }
  .box2 {
    position: absolute;
    width: 853px;
    height: 80px;
    left: 393px;
    top: 333px;
  
    background: #b59d9d;
    font-family: "Inter";
    font-style: normal;
    font-weight: 400;
    font-size: 23px;
    line-height: 28px;
    text-align: center;
    color: #ffffff;
}
</style>>
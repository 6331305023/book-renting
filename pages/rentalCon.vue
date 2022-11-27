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
      <div class="ttttt">Rental Condition</div>
    </div>


    <div class="fBlockss"></div>
    <div class="sBlockss">
<div class="textcon">เงื่อนไขการยืม<br></br>
    สมัครสมาชิก(ฟรี) > เลือกสินค้า > รอ mail ยืนยันจากทางร้าน > ชำระเงิน > แจ้งการชำระเงิน > รับสินค้า > คืนหนังสือ<br></br>
    - ค่าเช่าเล่มละ 20-100 บาท
    - ส่งฟรี! FLASH หรือ J&T (พื้นที่ห่างไกล +เพิ่ม 50 บาท)
    - ค่ามัดจำ 50 บาท
    - 1 เล่ม อ่านได้ 15 วัน
    เริ่มนับหลังวันที่ได้รับหนังสือเป็นวันแรก-วันที่ลูกค้าส่งคืน เช่น เช่าหนังสือ 2 เล่มแบบปกติ ได้รับหนังสือวันที่ 1 ลูกค้าต้องส่งคืนภายในวันที่ 16 ค่ะ<br></br>
    
    เลยกำหนดคืน +ค่าเช่าเพิ่มวันละ 20 บาท/เล่ม/วัน
    โดยจะคิดค่าเช่าเพิ่มหลังได้รับแจ้งส่งคืนหรือได้รับหนังสือคืนแล้ว<br></br>
    
    - หนังสือเปียกน้ำ, ฉีกขาด, ชำรุดจนนำมาปล่อยเช่าต่อไม่ได้ จะมีค่าปรับ50%-ราคาปก
      หนังสือหายปรับ50%-ราคาปก
      เล่มพิเศษหายปรับเท่าราคาปกเล่มหลัก (เพราะส่วนใหญ่หาซื้อยากหาซื้อไม่ได้แล้ว)<br></br>
    **ส่งคืนแบบไหนก็ได้ตามสะดวก **ห่อกันกระแทกให้เรียบร้อย ต้องมีเลขแทรคให้ติดตามได้การส่งคืนหนังสือ</div></div>
  </div>
</template>

<style scoped>
.ttttt {
  position: absolute;
  width: 320px;
  height: 60px;
  left: 610px;
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
.fBlockss {
  position: absolute;
  width: 1211px;
  height: 739px;
  left: 124px;
  top: 249px;

  background: #924d3c;
  border-radius: 20px;
}
.sBlockss {
  position: absolute;
  width: 1163px;
  height: 672px;
  left: 149px;
  top: 282px;

  background: #a37564;
  border-radius: 20px;
}
.textcon{
    position: absolute;
width: 1109px;
height: 602px;
left: 40px;
top: 100px;

    font-family: 'Inter';
    font-style: normal;
    font-weight: 400;
    font-size: 22px;
    line-height: 27px;
    
    color: #FFFFFF;
}
</style>>
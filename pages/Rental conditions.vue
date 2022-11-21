<template>
  <div>
    <bg></bg>

    <div class="topbox1">
      Rental conditions
    </div>
    
    <div>
      <div class="boxinbo"></div>
  </div>
    <div>
    <div class="boxchat">
    <h2><center>Rental</center></h2>
    <h3>สมัครสมาชิก (ฟรี) > เลือกสินค้า > รอ mail ยืนยันจากทางร้าน > ชำระเงิน > แจ้งการชำระเงิน > รับสินค้า>คืนหนังสือ</h3>
    <h3>- ค่าเช่าเล่มละ 20-100 บาท</h3>
    <h3>- ส่งฟรี! FLASH หรือ J&T (พื้นที่ห่างไกล +เพิ่ม 50 บาท)</h3>
    <h3>- ค่ามัดจำ 50 บาท</h3>
    <h3>- 1 เล่ม อ่านได้ 15 วัน</h3>
    <h3>เริ่มนับหลังวันที่ได้รับหนังสือเป็นวันแรก-วันที่ลูกค้าส่งคืน เช่น เช่าหนังสือ 2 เล่มแบบปกติ</h3> 
    <h3>ได้รับหนังสือวันที่ 1 ลูกค้าต้องส่งคืนภายในวันที่ 16 ค่ะ</h3>
    <h3>เลยกำหนดคืน +ค่าเช่าเพิ่มวันละ 20 บาท/เล่ม/วันโดยจะคิดค่าเช่าเพิ่มหลังได้รับแจ้งส่งคืนหรือได้รับหนังสือคืนแล้ว</h3>
    <h3>- หนังสือเปียกน้ำ, ฉีกขาด, ชำรุดจนนำมาปล่อยเช่าต่อไม่ได้ จะมีค่าปรับ50%-ราคาปก</h3>
    <h3>หนังสือหายปรับ50%-ราคาปก</h3>
    <h3>เล่มพิเศษหายปรับเท่าราคาปกเล่มหลัก (เพราะส่วนใหญ่หาซื้อยากหาซื้อไม่ได้แล้ว)</h3>
    <h3>**ส่งคืนแบบไหนก็ได้ตามสะดวก **ห่อกันกระแทกให้เรียบร้อย ต้องมีเลขแทรคให้ติดตามได้การส่งคืนหนังสือ</h3>

    </div>
 
  </div>  

</div>
</template>
<style scoped>
.topbox1 {
  position: absolute;
  width: 1164px;
  height: 50px;
  left: 148px;
  top: 147px;
  

  background: #924d3c;
  border-radius: 20px;

  text-align: center;
  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 25px;
  line-height: 48px;

  color: #ffffff;
}
.boxinbo {
  position: absolute;
  width: 1163px;
  height: 748px;
  left: 149px;
  top: 225px;

  background: #924d3c;
  border-radius: 20px;
}

.boxchat {
  position: absolute;
  width: 1100px;
  height: 700px;
  left: 180px;
  top: 250px;

  background: #A37564;
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
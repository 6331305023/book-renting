<template>
  <div>
    <bg></bg>

    <div class="topbox1">
      Payment
    </div>
    
    <div>
      <div class="boxinbo"></div>
  </div>
    <div>
    <div class="boxchat">
    <h2><center>Payment</center></h2>
    <h3>เมื่อโอนเงินแล้วโปรดแจ้งทางร้านค้า ผ่าน contact us ถึง rent@booklolololoe.com</h3>
    <h3>อ้างถึง order โปรดแจ้งรายละเอียดการโอนเงินด้วย</h3>
    <h3>· ธนาคาร / สาขา</h3>
    <h3>· วันที่ เวลา ที่โอน</h3>
    <h3>· จำนวนเงิน</h3>
    <h3>· ชื่อ นามสกุล ของท่าน</h3> 
    <h3>· หมายเลขโทร ติดต่อกลับ</h3>
    <h3>เมื่อทางร้านตรวจสอบความถูกต้องแล้วจะดำเนินการส่งของให้ในวันถัดไป แต่ของดวันเสาร์ </h3>
    <h3>อาทิตย์และวันหยุดราชการ กรณีต้องการเปลี่ยนแปลงรายการ หรือยกเลิก ขอให้แจ้งภายใน 3 วัน </h3>
    <h3>และต้องก่อนโอนเงิน</h3>
    
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
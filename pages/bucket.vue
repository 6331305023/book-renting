<template>
  
  <div>
    <bg></bg>
    <div>
      <div class="bgno"></div>
      <div class="ttt">Bucket</div>
    </div>

    <div class="fBlock"></div>
    <div class="sBlock"></div>
    <div class="box1"></div>
    <div class="box2"></div>
    <div class="box3"></div>
    <div class="box4"></div>
    <div class="box5"></div>
    <div class="box6"></div>
    <div class="box7"></div>
    <div class="box8"></div>
    <div class="box9"></div>
    <div class="text1">รายการสินค้า</div>
    <div class="text2">ราคา/ชิ้น</div>
    <div class="text3">จำนวน</div>
    <div class="text4">ราคารวม</div>
    <div class="text5">บันทึกตำนานราชันอหังการ</div>
    <div class="text6">50 บาท</div>
    <div class="text7">1 เล่ม</div>
    <div class="text8">50 บาท</div>
    <div class="text9">เลือกวิธีการจัดส่ง</div>
    <div class="text10">
      <v-radio
                label="Flash"
                color= #BA8C7B
                value="Flash"
              ></v-radio>
    </div>
    <div class="text11">
      <v-radio
                label="J&T"
                color= #BA8C7B
                value="J&T"
              ></v-radio>
    </div>
    <div class="text12">ที่อยู่การจัดส่ง ยยย</div>
    <div class="text13">333 Moo1, Thasud, Muang, Chiang Rai 57100 
Tel: 0-5391-6000, 0-5391-7034 Fax: 0-5391-6034, 0-5391-7049
Mae Fah Luang University, Bangkok Office Tel: 0-2679-0038-9 Fax: 0-2679-0038
</div>

    <div class="littleboxbrown"></div>
    <v-btn class="nextbutt">Next</v-btn>
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
  width: 230px;
  height: 89px;
  left: 587px;
  top: 126px;

  background: #924d3c;
  border-radius: 30px;
}
.fBlock {
  position: absolute;
  width: 1211px;
  height: 750px;
  left: 124px;
  top: 249px;

  background: #924d3c;
  border-radius: 20px;
}
.sBlock {
  position: absolute;
  width: 1163px;
  height: 695px;
  left: 149px;
  top: 282px;

  background: #a37564;
  border-radius: 20px;
}
.nextbutt {
  position: absolute;
  width: 180px;
  height: 672px;
  left: 650px;
  top: 900px;
  border-radius: 20px ;
  background-color: #B59D9D;
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

.littleboxbrown{
  position: absolute;
width: 852px;
height: 80px;
left: 300px;
top: 659px;

background: #C1A6A6;
}

.box1{
  position: absolute;
width: 364px;
height: 75px;
left: 300px;
top: 310px;

background: #C1A6A6;
}
.box2{
  position: absolute;
width: 163px;
height: 75px;
left: 664px;
top: 310px;

background: #B59D9D;
}

.box3{
  position: absolute;
width: 163px;
height: 75px;
left: 826px;
top: 310px;

background: #C1A6A6;
}
.box4{
  position: absolute;
width: 163px;
height: 75px;
left: 989px;
top: 310px;

background: #B59D9D;
}
.box5{
  position: absolute;
width: 852px;
height: 85px;
left: 300px;
top: 385px;

background: #D9D9D9;
}
.box6{
  position: absolute;
width: 852px;
height: 80px;
left: 300px;
top: 500px;

background: #C1A6A6;
}
.box7{
  position: absolute;
width: 852px;
height: 80px;
left: 300px;
top: 580px;

background: #D9D9D9;
}
.box8{
  position: absolute;
width: 852px;
height: 80px;
left: 300px;
top: 659px;

background: #C1A6A6;
}
.box9{
  position: absolute;
width: 852px;
height: 116px;
left: 300px;
top: 739px;

background: #D9D9D9;
}
.text1{
  position: absolute;
width: 300px;
height: 30px;
left: 430px;
top: 335px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 25px;
line-height: 30px;

color: #FFFFFF;
}
.text2{
  position: absolute;
width: 300px;
height: 30px;
left: 694px;
top: 335px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 25px;
line-height: 30px;

color: #FFFFFF;
}

.text3{
  position: absolute;
width: 300px;
height: 30px;
left: 865px;
top: 335px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 25px;
line-height: 30px;

color: #FFFFFF;
}

.text4{
  position: absolute;
width: 300px;
height: 30px;
left: 1027px;
top: 335px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 25px;
line-height: 30px;

color: #FFFFFF;
}

.text5{
  position: absolute;
width: 400px;
height: 30px;
left: 335px;
top: 412px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 25px;
line-height: 30px;

color: #000000;
}

.text6{
  position: absolute;
width: 300px;
height: 30px;
left: 696px;
top: 412px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 25px;
line-height: 30px;

color: #000000;

}

.text7{
  position: absolute;
width: 300px;
height: 30px;
left: 866px;
top: 412px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 25px;
line-height: 30px;

color: #000000;

}

.text8{
  position: absolute;
width: 79px;
height: 300px;
left: 1031px;
top: 412px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 25px;
line-height: 30px;

color: #000000;
}

.text9{
  position: absolute;
width: 300px;
height: 30px;
left: 335px;
top: 525px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 25px;
line-height: 30px;

color: #FFFFFF;
}

.text10{
  position: absolute;
width: 300px;
height: 30px;
left: 345px;
top: 606px;
color: #000000;
}

.text11{
  position: absolute;
width: 300px;
height: 30px;
left: 515px;
top: 606px;
color: #000000;
}
.text12{
  position: absolute;
  width: 300px;
height: 30px;
left: 335px;
top: 685px;

font-family: 'Inter';
font-style: normal;
font-weight: 300;
font-size: 25px;
line-height: 30px;

color: #FFFFFF;

}

.text13{
  position: absolute;
width: 784px;
height: 115px;
left: 345px;
top: 754px;

font-family: 'Inter';
font-style: normal;
font-weight: 400;
font-size: 22px;
line-height: 27px;

color: #000000;
}


</style>>
  
  <script>
  import bg from "../components/backgroud.vue";
  export default {
    components: {
      bg,
    },
  };
  </script>
  
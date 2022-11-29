<template>
  <div>
    <bg></bg>
    <div>
      <v-img class="bpic1" src="https://fbi.dek-d.com/27/0602/3866/127370065"></v-img>
    </div>
    <h1 class="name">Recommend</h1>
    <div>
      <h1 class="pn1">ตัวร้ายอย่างข้าจะหนีเอาตัวรอดยังไงดี ภาค 1</h1>
      <v-btn class="add1" @click="goCart">Add to Cart</v-btn>
      <v-img
        class="pic1"
        src="https://storage.naiin.com/system/application/bookstore/resource/product/201810/243420/1000212303_front_XXL.jpg?imgname=%E0%B8%95%E0%B8%B1%E0%B8%A7%E0%B8%A3%E0%B9%89%E0%B8%B2%E0%B8%A2%E0%B8%AD%E0%B8%A2%E0%B9%88%E0%B8%B2%E0%B8%87%E0%B8%82%E0%B9%89%E0%B8%B2...%E0%B8%88%E0%B8%B0%E0%B8%AB%E0%B8%99%E0%B8%B5%E0%B9%80%E0%B8%AD%E0%B8%B2%E0%B8%95%E0%B8%B1%E0%B8%A7%E0%B8%A3%E0%B8%AD%E0%B8%94%E0%B8%A2%E0%B8%B1%E0%B8%87%E0%B9%84%E0%B8%87%E0%B8%94%E0%B8%B5-%E0%B9%80%E0%B8%A5%E0%B9%88%E0%B8%A1-1"
      ></v-img>
    </div>
    <div>
      <v-img
        class="pic2"
        src="https://images-se-ed.com/ws/Storage/Originals/978616/808/9786168087718L.jpg?h=1dc41e1467c1a099975e80e6ba1a3c9d"
      ></v-img>
      <h1 class="pn2">ตัวร้ายอย่างข้าจะหนีเอาตัวรอดยังไงดี ภาค 3</h1>
      <v-btn class="add2" @click="goCart">Add to Cart</v-btn>
    </div>
    <div>
      <v-img
        class="pic3"
        src="https://cdn-local.mebmarket.com/meb/server1/204363/Thumbnail/book_detail_large.gif?2"
      ></v-img>
      <h1 class="pn3">บันทึกตำนานราชันอหังการ</h1>
      <v-btn class="add3" @click="goCart">Add to Cart</v-btn>
    </div>
    <div>
      <v-img
        class="pic4"
        src="https://images-se-ed.com/ws/Storage/Originals/552284/019/5522840195531L.jpg?h=cc2081ad2f69ca21c281ac814f786790"
      ></v-img>
      <h1 class="pn4">เทพสายฟ้าราชาสงคราม</h1>
      <v-btn class="add4" @click="goCart">Add to Cart</v-btn>
    </div>
  </div>
</template>
<style scoped>
.add1{
  position: absolute;
width: 127px;
height: 29px;
left: 155px;
top: 958px;
}
.add2{
  position: absolute;
width: 127px;
height: 29px;
left: 493px;
top: 958px;
}
.add3{
  position: absolute;
width: 127px;
height: 29px;
left: 808px;
top: 958px;
}
.add4{
  position: absolute;
width: 127px;
height: 29px;
left: 1123px;
top: 958px;
}
.bpic1 {
  position: absolute;
  width: 1382px;
  height: 319px;
  left: 33px;
  top: 138px;
}

.pic1 {
  position: absolute;
  width: 245px;
  height: 312px;
  left: 119px;
  top: 573px;
}

.name {
  position: absolute;
  width: 148px;
  height: 30px;
  left: 53px;
  top: 512px;

  font-family: "Inter";
  font-style: bold;
  font-weight: 400;
  font-size: 40px;
  line-height: 30px;

  color: #000000;
}
.pn1 {
  position: absolute;
  width: 234px;
  height: 42px;
  left: 119px;
  top: 896px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 22px;
  line-height: 27px;

  color: #000000;
}
.pic2 {
  position: absolute;
  width: 245px;
  height: 312px;
  left: 434px;
  top: 573px;
}
.pn2 {
  position: absolute;
  width: 234px;
  height: 42px;
  left: 434px;
  top: 897px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 22px;
  line-height: 27px;

  color: #000000;
}
.pic3 {
  position: absolute;
  width: 245px;
  height: 312px;
  left: 749px;
  top: 573px;
}
.pn3 {
  position: absolute;
  width: 234px;
  height: 42px;
  left: 752px;
  top: 897px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 22px;
  line-height: 27px;

  color: #000000;
}
.pic4 {
  position: absolute;
  width: 245px;
  height: 312px;
  left: 1064px;
  top: 573px;
}
.pn4 {
  position: absolute;
  width: 234px;
  height: 42px;
  left: 1066px;
  top: 895px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 22px;
  line-height: 27px;

  color: #000000;
}
</style>

<script>
import bg from "../components/backgroud.vue";
export default {
  components: {
    bg,
  },
};
</script>

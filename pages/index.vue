<template>
  <div>
    <bg></bg>
    <div>
      <div class="binb"></div>
      <div class="login">
        <div class="lg">Login</div>
        <div>
          <v-btn class="regis" color="#a37564" @click="goRe">Register</v-btn>
        </div>

        <div class="forgot">Forgot Password?</div>
        <div>
          <input class="uname" type="text" placeholder="E-mail" v-model="user.username" />
          <input
            class="pass"
            type="password"
            placeholder="Password"
            v-model="user.password"
          />
          <div>
            <form>
              <v-btn
                class="submit"
                elevation="2"
                fab
                rounded
                style="width: 150px"
                @click="home"
              >
                Sign in
              </v-btn>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
.forgot {
  position: absolute;
  width: 164px;
  height: 27px;
  left: 727px;
  top: 395px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 22px;
  line-height: 27px;

  text-decoration-line: underline;

  color: #ffffff;
}
.regis {
  position: absolute;
  width: 145px;
  height: 27px;
  left: 300px;
  top: 395px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 22px;
  line-height: 27px;

  text-decoration-line: underline;

  color: #ffffff;
}
.binb {
  position: absolute;
  width: 1163px;
  height: 748px;
  left: 149px;
  top: 147px;

  background: #a37564;
  border-radius: 20px;
}
.login {
  position: absolute;
  width: 1164px;
  height: 66px;
  left: 148px;
  top: 147px;

  background: #924d3c;
  border-radius: 20px;

  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 40px;
  line-height: 48px;
  text-align: center;
  color: #ffffff;
}
.lg {
  position: absolute;
  width: 200px;
  height: 85px;
  left: 190px;
  font-family: "Inter";
  font-style: normal;
  font-weight: 400;
  font-size: 40px;
  line-height: 48px;
  top: 7px;
  left: 500px;
  color: #ffffff;
}
.uname {
  position: absolute;
  align-items: center;
  width: 595px;
  height: 87px;
  left: 300px;
  top: 200px;
  border: 2px solid rgba(146, 77, 60, 0.7);
  border-radius: 10px;
  background-color: #d7a99d;
}
.pass {
  position: absolute;
  width: 595px;
  height: 87px;
  left: 300px;
  top: 300px;
  border: 2px solid rgba(146, 77, 60, 0.7);
  border-radius: 10px;
  background-color: #d7a99d;
}
.submit {
  position: absolute;
  width: 205px;
  height: 68px;
  left: 530px;
  top: 450px;
  background-color: #924d3c !important;
  border: 2px solid white;
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
      username: "",
      password: "",
    },
  }),
  methods: {
    // async submit() {
    //   await this.$axios
    //     .post("/api/login", this.user)
    //     .then((res) => {
    //       if (res.data.response == "Login Failed") {
    //         this.$swal({
    //           icon: "error",
    //           title: "Login Failed",
    //           text: "HaiiYaa Password pid aa poa",
    //         });
    //       } else {
    //         window.location.href = "/index";
    //       }
    //     })
    //     .catch((err) => {
    //       this.$swal({
    //         icon: "error",
    //         title: "Login Failed",
    //         text: "Login not success",
    //       });
    //       console.log(err.message);
    //     });
    // },
    goRe() {
      this.$router.push("/register");
    },
    home() {
      this.$router.push("/homepage");
    },
  },
};
</script>

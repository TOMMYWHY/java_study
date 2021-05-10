<template>
  <div>
    <el-container>
      <el-header>Header</el-header>
      <el-main>
        <el-row :gutter="20">
          <el-col :span="12" :offset="6">
            <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
              <el-form-item label="username" prop="username">
                <el-input v-model="ruleForm.username"></el-input>
              </el-form-item>

              <el-form-item label="password" prop="password">
                <el-input type="password" v-model="ruleForm.password"></el-input>
              </el-form-item>

              <el-form-item>
                <el-button type="primary" @click="submitForm('ruleForm')">Login</el-button>
                <el-button @click="resetForm('ruleForm')">clean</el-button>
              </el-form-item>
            </el-form>
          </el-col>
        </el-row>



      </el-main>
    </el-container>

  </div>
</template>

<script>
export default {
  name: "Login",

  data() {
    return {
      ruleForm: {
        username: 'tommy',
        password:"111111",

      },
      rules: {
        username: [
          { required: true, message: 'enter username', trigger: 'blur' },
          { min: 3, max: 15, message: '3-15 character', trigger: 'blur' }
        ],
        password: [
          { required: true, message: 'enter password', trigger: 'change' }
        ],

      }
    };
  },
  methods: {

    submitForm(formName) {
      let that = this
      console.log(that)
      this.$refs[formName].validate((valid) => {

        if (valid) {
          const _this = this
         /* this.$axios({
                url:"/login",
                method: 'post',
                data: this.ruleForm,
                headers: {
                  'Content-Type':'application/json'
                }
          })*/
            this.$axios.post("/login",this.ruleForm)
              .then(res=>{
                const jwt = res.headers["authorization"]
                const data = res.data.data
                _this.$store.commit("SET_TOKEN",jwt)
                _this.$store.commit("SET_USERINFO",data)
                // console.log(_this.$store.getters.getUser)
                _this.$router.push('/blogs')
              })

        } else {
          console.log('error submit!!');
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }

}
</script>

<style scoped>
.el-header, .el-footer {
  background-color: #B3C0D1;
  color: #333;
  text-align: center;
  line-height: 60px;
}

.el-aside {
  background-color: #D3DCE6;
  color: #333;
  text-align: center;
  line-height: 200px;
}

.el-main {
  /*background-color: #E9EEF3;*/
  color: #333;
  text-align: center;
  line-height: 160px;
}

body > .el-container {
  margin-bottom: 40px;
}

.el-container:nth-child(5) .el-aside,
.el-container:nth-child(6) .el-aside {
  line-height: 260px;
}

.el-container:nth-child(7) .el-aside {
  line-height: 320px;
}
</style>
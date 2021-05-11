<template>
  <div>
    <el-row :gutter="20">
      <el-col :span="12" :offset="6" style="text-align: center;">
        <h3>tommy blog</h3>
        <div class="block">
          <el-avatar :size="50" :src=user.avatar></el-avatar>
          <div>{{user.username}}</div>
        </div>
        <br>
        <div>
          <span><el-link href="/blogs">Home</el-link></span>
          <el-divider  direction="vertical"></el-divider>
          <span> <el-link type="primary" href="/blog/add">Create</el-link></span>
          <el-divider direction="vertical"></el-divider>
          <span v-show="hasLogin"> <el-link type="danger" @click="logout">logout</el-link></span>

          <span v-show="!hasLogin"> <el-link type="info" href="/login">login</el-link></span>
        </div>


      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Header",
  data(){
    return {
      hasLogin:false,
      user:{
        username:'please login',
        avatar:"https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png"
      }
    }
  },
  methods:{
    logout (){
      const  _this = this
      this.$axios.get("/logout",{
        headers:{
          "Authorization":localStorage.getItem("token")
        }
      }).then(res=>{
        _this.$store.commit("REMOVE_INFO")
        _this.$router.push("/login")
      })
    },

  },
  created(){
    if(this.$store.getters.getUser.username){
      this.hasLogin = true
      this.user.username = this.$store.getters.getUser.username
      this.user.avatar = this.$store.getters.getUser.avatar
    }
  }
}
</script>

<style scoped>

</style>
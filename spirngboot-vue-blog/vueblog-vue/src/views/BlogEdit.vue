<template>
  <div>
    <Header></Header>

    <br>
    <br>
    <div>
      <el-row :gutter="20">
        <el-col :span="18" :offset="3">
          <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
        <el-form-item label="Title" prop="title">
          <el-input v-model="ruleForm.title"></el-input>
        </el-form-item>


        <el-form-item label="Description" prop="description">
          <el-input type="textarea" v-model="ruleForm.description"></el-input>
        </el-form-item>

        <el-form-item label="Content" prop="content">
<!--          <el-input type="textarea" v-model="ruleForm.content"></el-input>-->
          <mavon-editor v-model="ruleForm.content"></mavon-editor>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="submitForm('ruleForm')">Create</el-button>
          <el-button @click="resetForm('ruleForm')">Reset</el-button>
        </el-form-item>
      </el-form>
      </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
import Header from "../components/Header"
export default {
  name: "BlogEdit",
  components:{Header},
  data() {
    return {
      ruleForm: {
        id:"",
        title: '',
        description: '',
        content:''
      },
      rules: {
        title: [
          { required: true, message: 'enter title', trigger: 'blur' },
        ],
        description: [
          { required: true, message: 'enter description', trigger: 'blur' }
        ],
        content: [
          { required: true, message: 'enter content', trigger: 'blur' }
        ],

      }
    };
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {

          const _this = this
           this.$axios.post("/blog/edit",this.ruleForm,{
             headers:{
               "Authorization":localStorage.getItem("token")
             }
           }).then(res=>{
             console.log(res)
             _this.$alert('edit successful', 'Msg', {
               confirmButtonText: '确定',
               callback: action => {
                 _this.$router.push("/blogs")
               }
             });
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
  },
  created() {
    const blogId = this.$route.params.blogId
    console.log(blogId)
    const _this = this

    if(blogId){
      this.$axios.get("/blog/"+blogId)
          .then(res=>{
            const blog = res.data.data
            _this.ruleForm.id = blog.id
            _this.ruleForm.title = blog.title
            _this.ruleForm.description = blog.description
            _this.ruleForm.content = blog.content
          })
    }
  }
}
</script>

<style scoped>

</style>
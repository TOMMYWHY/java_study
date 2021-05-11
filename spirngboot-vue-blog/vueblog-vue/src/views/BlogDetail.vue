<template>
  <div>
    <Header></Header>
    <div >
      <br>
      <br>
      <el-row :gutter="20">
        <el-col :span="18" :offset="3">
          <div class="mblog">
            <h2>{{blog.title}}</h2>
            <div>
              <el-link icon="el-icon-edit" v-if="ownBlog">
              <router-link :to="{name:'BlogEdit',params:{blogId:blog.id}}">Edit</router-link>
              </el-link>
<!--              <el-link>查看<i class="el-icon-view el-icon&#45;&#45;right"></i> </el-link>-->
            </div>
            <el-divider></el-divider>
            <br>

            <div class="markdown-body" v-html="blog.content"></div>

          </div>

        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
import Header from "../components/Header"
import "github-markdown-css/github-markdown.css"
export default {
  name: "BlogDetail",
  components:{Header},
  data(){
    return {
      blog:{
        id:'',
        title:'',
        content:''
      },
      ownBlog:false

    }
  },
  methods:{},
  created() {
    const blogId = this.$route.params.blogId
    console.log(blogId)
    const _this = this
    this.$axios.get("/blog/"+blogId)
        .then(res=>{
          const blog = res.data.data
          _this.blog.id = blog.id
          _this.blog.title = blog.title
          _this.blog.description = blog.description

          let MarkdownIt = require("markdown-it")
          let md = new MarkdownIt()
          let result = md.render(blog.content)
          _this.blog.content = result
          // _this.blog.content = blog.content
          _this.ownBlog  = (blog.userId=== _this.$store.getters.getUser.id)
        })
  }
}
</script>

<style scoped>
.mblog{
  box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
  width: 100%;
  /*height: 200px;*/
  padding: 20px;

}
</style>
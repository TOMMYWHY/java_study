<template>
  <div>
    <Header></Header>
    <br>
    <el-row :gutter="20">
      <el-col :span="18" :offset="3">
        <div class="block">
          <el-timeline>
            <el-timeline-item :timestamp=blog.created placement="top" v-for="blog in blogs ">
              <el-card>
                <h4>
                  <router-link :to="{name: 'BlogDetail',params:{blogId:blog.id}}">
                    {{blog.title}}
                  </router-link>

                </h4>
                <p>{{blog.description}} </p>
              </el-card >
            </el-timeline-item>

          </el-timeline>
        </div>
        <br>
        <el-pagination style="text-align: center"
            background
            layout="prev, pager, next"
            :current-page="currentPage" :page-size="pageSize" @current-change=page
            :total="total">
        </el-pagination>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import Header from "../components/Header"
export default {
  name: "Blogs",
  components:{Header},
  data(){
    return{
      blogs:{},
      currentPage:1,
      total:0,
      pageSize:5
    }
  },
  methods:{
    page(currentPage){
      const _this= this
      this.$axios.get("./blogs?currentPage="+currentPage)
          .then(res=>{
            console.log(res)
            _this.blogs = res.data.data.records
            _this.currentPage = res.data.data.current
            _this.total = res.data.data.total
            _this.pageSize = res.data.data.size
          })
    }
  },
  created() {
    this.page(1);
  }
}
</script>


<style scoped>

</style>
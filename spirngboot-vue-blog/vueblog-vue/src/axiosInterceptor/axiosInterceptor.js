import axios from "axios";
import Element from "element-ui"
import router from "@/router";
import store from '../store'

axios.defaults.baseURL = "http://localhost:8082"

axios.interceptors.request.use(config =>{
    return config
})

axios.interceptors.response.use(res=>{
    if(res.data.code===200){return res;}
    else{
        Element.Message.error(res.data.msg,{duration:2*1000});
        return Promise.reject(res.data.msg)
    }
},
    error => {
        console.log(error)
        if(error.response.data){
             error.message = error.response.data.msg
        }
        if(error.response.status==401){
             store.commit("REMOVE_INFO")
            router.push("/login")
        }
        Element.Message.error(error.message,{duration:2*1000});
        return Promise.reject(error)

})
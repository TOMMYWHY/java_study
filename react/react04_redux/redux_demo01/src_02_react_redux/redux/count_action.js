import { DECREMENT, INCREMENT } from "./constant"
// import store from './store'

export const createIncrementAction=(data)=>{
    return{type:INCREMENT,data:data}
}


export const createDecrementAction=(data)=>(
    {type:DECREMENT,data:data}
)

//异步 action 中调用 同步任务
export const createIncrementAsyncAction=(data,time)=>{
    return (dispatch)=>{
        setTimeout(()=>{
            // store.dispatch(createIncrementAction(data))
            dispatch(createIncrementAction(data))
        },time)
    }
}
    




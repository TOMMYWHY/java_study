import request from "../util/request";

export default {
    namespace:"list",
    state:{
        // items:[{id:1,name:"aaa"},{id:2,name:"bbbb"},{id:3,name:"cc"}]
        items:[]
    },
    reducers:{

        addNewData:(preState, currentState)=>{
            // console.log("addNewData...")
            // console.log("addNewData:", currentState)
            if(currentState.data){
                return currentState.data
            }
            const nums = preState.items.length+1;
            const newItem = {id:nums,name:"dddddd"}
            return{
                items: [ ...preState.items,newItem]
            }
        }
    },

    effects:{
        *initData(params, sagaEffects){
            console.log("222")
            const {call , put} = sagaEffects;
            const url = '/ds/list';
            let items = yield  call (request,url)
            console.log(items)

            yield put({
                type:"addNewData",
                data:items
            })
        }
    }
}
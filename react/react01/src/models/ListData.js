import request from "../util/request";
export default {
    namespace:'list',
    state:{
        data:[],
        maxNum: 3
    },
    reducers:{
        addNewData:function (state,result){
            let maxNum = state.maxNum +1;
            // console.log(maxNum)
            let newArr = state.data;
            console.log( "11111",result)
            console.log(typeof newArr )
            newArr.push(maxNum);

            return ({
                data:newArr,
                maxNum: maxNum
            })
        }
    },
    effects:{
        *initData(params,sageEffects){
            const{call,put} = sageEffects;
            const url = "/ds/list";
            let data = yield call(request,url);
            yield put({type:"addNewData",
            data:data
            });
        }
    }
}
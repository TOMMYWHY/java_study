export default {
    namespace:"list",
    state:{
        items:[{id:1,name:"aaa"},{id:2,name:"bbbb"},{id:3,name:"cc"}]
    },
    reducers:{
        addNewData:(preState)=>{
            const nums = preState.items.length+1;
            const newItem = {id:nums,name:"dddddd"}
            return{
                items: [ ...preState.items,newItem]
            }
        }
    }
}
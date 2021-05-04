export default {
    "get /ds/list":function (req,res){
        res.json({
            items:[{id:1,name:"AAA"},{id:2,name:"BBBBB"},{id:3,name:"CC"}]
        })
    }
}
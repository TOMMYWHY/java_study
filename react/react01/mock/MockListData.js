export default {
    "get /ds/list":function (req,resp){
        resp.json({
            data:[1,2,3,4,5],
            maxNum: 5
        })
    }
}
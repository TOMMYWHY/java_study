import React from "react";

import {connect} from 'dva';


const namespace = "list";
@connect((state)=>{
    return{
        dataList:state[namespace].data, //this.props
        maxNum: state[namespace].maxNum
    }
},(dispatch)=>{
    return{
        add:function (){
            dispatch({
                type:namespace+"/addNewData"
            })
        },
        init:()=>{
            dispatch({
                type:namespace+"/initData"
            })
        }
    }
})
class List extends React.Component{
    componentDidMount() {
        this.props.init();
    }

    constructor(props) {
        super(props);
        // this.state = {
        //     dataList:[1,2,3,4],
        //     msg:"xxoo",
        //     maxNum:3,
        // }
    };

    render() {
        return (
            <div>
                <ul>
                    {
                        this.props.dataList.map((value,index)=>{
                            return <li key={index}>{value}</li>
                        })
                    }
                </ul>
                <button onClick={()=>{
                   //  let maxNum = this.props.maxNum +1;
                   //  // console.log(maxNum)
                   //  let newArr = this.props.dataList;
                   //  console.log( this.props.datalist)
                   //  console.log(typeof newArr )
                   //  newArr.push(maxNum);
                   //
                   // this.setState({
                   //     dataList:newArr,
                   //     maxNum: maxNum
                   // })
                    this.props.add();
                }}>click</button>
            </div>
        );
    }
}

export default List;
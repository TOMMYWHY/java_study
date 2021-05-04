import React from 'react';
import {connect} from 'dva'
import ListData from "../models/ListData";
// import ListData  from "../models/ListData";

const namespace = "list"
@connect((state)=>{
    return{ dataList:state[namespace].items}
},(dispatch)=>{
    return{
        add:()=>{
            dispatch({type:namespace+"/addNewData"})
        },
        init:()=>{
            dispatch({type:namespace+"/initData"})
        }
    }
})
class  List extends React.Component{

    componentDidMount(){
        // console.log("1111")

        this.props.init();
        // console.log("@@@",this.props)
    }


    render(){
        console.log(this.props);
        return(
            <div>
                <h1>List</h1>
                <ul>
                    {this.props.dataList.map((itemObj)=>{
                        return (
                            <li key={itemObj.id}>{itemObj.name}</li>
                        )
                    })}
                </ul>
                <button onClick={this.props.add}>click</button>
            </div>
        )
    }
}

export default List
import React from 'react';
import {connect} from 'dva'
import ListData from "../models/ListData";
// import ListData  from "../models/ListData";

const namespace = "list"
@connect((state)=>{
    return{ dataList:state[namespace].items}
},(dispatch)=>{
    return{add:()=>{
            dispatch({type:namespace+"/addNewData"})
        }}
})
class  List extends React.Component{


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
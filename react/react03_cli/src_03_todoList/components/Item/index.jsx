import React, { Component } from 'react'
import "./index.css"
export default class Item extends Component {

    state={mouse:false}

    handleMouse=(flag)=>{
        return ()=>{
            // console.log(flag);
            this.setState({
                mouse:flag
            })
        }
    }
    handleCheck=(id)=>{
        return (event)=>{
            // console.log(id,event.target.checked);
            this.props.updateTodo(id,event.target.checked)
        }
    }

    handleDelete=(id)=>{
        if(window.confirm("R U sure to delete?")){
            console.log("delete:",id);
            this.props.deleteTodo(id)
        }
        
    }


    render() {
        const {id,name,done} = this.props
        return (
            <li style={{background:this.state.mouse?"#ddd":"white"}} onMouseLeave={this.handleMouse(false)} onMouseEnter={this.handleMouse(true)}>
                <label>
                    <input checked={done} onChange={this.handleCheck(id)}  type="checkbox"/>
                    <span>{name}</span>
                </label>
                <button onClick={()=>{this.handleDelete(id)}} className="btn btn-danger" style={{display:this.state.mouse?"block":"none"}}>删除</button>
            </li>
        )
    }
}

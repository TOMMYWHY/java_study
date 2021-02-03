import React, { Component } from 'react'
import PropTypes from 'prop-types'
import {nanoid} from 'nanoid'
import "./index.css"


// console.log(nanoid());
export default class Header extends Component {

    static propTypes = {
        addTodo:PropTypes.func.isRequired,
    }

    handleKeyUp=(event)=>{
        // console.log(event.target.value,event.keyCode);
        const {keyCode,target} = event
        if(keyCode!==13){
            return
        }
        if(target.value.trim()===""){
            alert("have to enter something...")
            return
        }
        // console.log(target.value);
        const todoObj = {id:nanoid(),name:target.value,done:false} //todo
        this.props.addTodo(todoObj)

        target.value = ""
        
    }
    render() {
        // console.log("a",this.props.a);
        return (
                <div className="todo-header">
                    <input onKeyUp={this.handleKeyUp}
                    type="text" placeholder="请输入你的任务名称，按回车键确认"/>
                </div>
        )
    }
}

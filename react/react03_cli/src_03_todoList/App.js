import React, { Component } from 'react'
import Header from './components/Header'
import List from './components/List'
import Footer from './components/Footer'
import "./App.css"


export default class App extends Component {
    state={
        todos:[
            {id:"001",name:"eating", done:true},
            {id:"002",name:"coding", done:false},
            {id:"003",name:"sleeping", done:true}
    ]}
    /*父子通信*/    
    addTodo = (todoObj) => {
        const {todos} = this.state
        console.log("App:",todoObj);
        const newTodos = [todoObj,...todos]
        this.setState({
            todos:newTodos
        })
    }

    updateTodo=(id,done)=>{
        const {todos} = this.state
        const newTodos =todos.map((todoObj)=>{
            if(todoObj.id === id){
                return {...todoObj,done:done}
            }else return todoObj
        })

        this.setState({todos:newTodos})
    }

    deleteTodo=(id)=>{
        const{todos} = this.state
        const newTodos = todos.filter((todoObj)=>{
            return todoObj.id !==id
        })
        this.setState({
            todos:newTodos
        })
    }

    checkAllTodo=(done)=>{
        const{todos} = this.state
        const newTodos=todos.map((todoObj)=>{
            return{...todoObj,done:done}
        })
        this.setState({
            todos:newTodos
        })
    }

    clearAllTodo=()=>{
        const{todos} = this.state
        const newTodos=todos.filter((todoObj)=>{
            return todoObj.done === false
        })
        this.setState({
            todos:newTodos
        })
    }


    render() {
        const {todos} = this.state
        return (
            <div className="todo-container">
                <div className="todo-wrap">
                <Header addTodo = {this.addTodo}/>
                <List deleteTodo={this.deleteTodo} updateTodo={this.updateTodo}  todos={todos}/>
                <Footer clearAllTodo={this.clearAllTodo} checkAllTodo={this.checkAllTodo} todos={todos}/>
                </div>
            </div>
        )
    }
}

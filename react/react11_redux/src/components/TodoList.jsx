import React, { Component } from 'react';
// import { Input, Col, Button, List } from "antd";
// import 'antd/dist/antd.css'
// import '../index.css'

import store from '../store/index'
// import { DELETE_ITEM, ADD_ITEM, CHANGE_INPUT } from '../store/actionTypes'
import { geMyListAction, changeInputAction, addItemAction, deleteItemAction, getListAction, getTodoListAction } from '../store/actionCreators'
import TodoListUI from '../ui/todoListUI'
import axios from 'axios'

class TodoList extends Component {
    constructor(props) {
        super(props)
        console.log(store.getState());
        this.state = store.getState()
        store.subscribe(this.storeChange)
    }
    storeChange = () => {
        this.setState(store.getState())
    }
    changeValue = (e) => {
        // console.log(e.target.value);
        // const action = {
        //     type: CHANGE_INPUT,
        //     value: e.target.value
        // }
        const action = changeInputAction(e.target.value)
        store.dispatch(action)
    }
    clickBtn = () => {
        // const action = {
        //     type: ADD_ITEM,
        // }
        const action = addItemAction()
        store.dispatch(action)
    }
    deleteItem = (index) => {
        // console.log(index);
        // const action = {
        //     type: DELETE_ITEM,
        //     index: index
        // }

        const action = deleteItemAction(index)
        store.dispatch(action)
    }

    componentDidMount = () => {
        const action = geMyListAction()
        store.dispatch(action);
        
        // const action = getTodoListAction()
        // store.dispatch(action);

        // const url = "https://www.easy-mock.com/mock/5cfcce489dc7c36bd6da2c99/xiaojiejie/getList"
        // axios.get(url).then((res) => {
        //     const data = res.data
        //     const action = getListAction(data)
        //     store.dispatch(action)
        // })
    }
    render() {
        return (
            <TodoListUI
                inputValue={this.state.inputValue}
                changeValue={this.changeValue}
                clickBtn={this.clickBtn}
                list={this.state.list}
                deleteItem={this.deleteItem}
            ></TodoListUI>
        );
    }
}

export default TodoList;
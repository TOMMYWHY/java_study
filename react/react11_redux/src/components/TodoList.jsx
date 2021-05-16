import React, { Component } from 'react';
import { Input, Col, Button, List } from "antd";
import 'antd/dist/antd.css'
import '../index.css'

import store from '../store/index'
import { convertLegacyProps } from 'antd/lib/button/button';

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
        const action = {
            type: 'changeInput',
            value: e.target.value
        }
        store.dispatch(action)
    }
    clickBtn = () => {
        const action = {
            type: 'addItem',
        }
        store.dispatch(action)
    }
    deleteItem = (index) => {
        // console.log(index);
        const action = {
            type: 'deleteItem',
            index:index
        }
        store.dispatch(action)
    }
    render() {
        return (
            <div >

                <Col span='12' offset="6" className={'center'}>
                    <h1>todo list</h1>
                    <Input placeholder={this.state.inputValue} style={{ width: '250px' }}
                        onChange={this.changeValue}
                        value={this.state.inputValue}
                    ></Input>
                    <Button type='primary' onClick={this.clickBtn}>Add</Button>
                    <br /><br />
                    <List bordered dataSource={this.state.list}
                        renderItem={(item, index) => {
                            return (<List.Item onClick={() => { this.deleteItem(index) }}>{item}</List.Item>)
                        }}>
                    </List>
                </Col>


            </div >
        );
    }
}

export default TodoList;
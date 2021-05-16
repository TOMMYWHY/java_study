import React, { Component } from 'react';
import { Input, Col, Button, List } from "antd";
import 'antd/dist/antd.css'
import '../index.css'

const data = [
    'aaa',
    'bbb',
    'ccc'
]

class TodoList extends Component {
    state = {}
    render() {
        return (
            <div >

                <Col span='12' offset="6" className={'center'}>
                    <h1>todo list</h1>
                    <Input placeholder='enter todo' style={{ width: '250px' }}></Input>
                    <Button type='primary'>Add</Button>
                    <br /><br />
                    <List bordered dataSource={data} renderItem={(item) => {
                        return (<List.Item >{item}</List.Item>)
                    }}>
                    </List>
                </Col>


            </div >
        );
    }
}

export default TodoList;
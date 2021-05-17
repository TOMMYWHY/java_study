import React, { Component } from 'react'
import { Input, Col, Button, List } from "antd";
import 'antd/dist/antd.css'
import '../index.css'
class TodoListUI extends Component {
    state = {}
    render() {
        return (
            <div >

                <Col span='12' offset="6" className={'center'}>
                    <h1>todo list</h1>
                    <Input style={{ width: '250px' }}
                        placeholder={this.props.inputValue}
                        onChange={this.props.changeValue}
                        value={this.props.inputValue}>
                    </Input>
                    <Button type='primary'
                        onClick={this.props.clickBtn}>
                        Add
                    </Button>
                    <br /><br />
                    <List bordered dataSource={this.props.list}
                        renderItem={(item, index) => {
                            return (
                                <List.Item onClick={() => { this.props.deleteItem(index) }}>
                                    {item}
                                </List.Item>
                            )
                        }}>
                    </List>
                </Col>
            </div >
        );
    }
}

export default TodoListUI;
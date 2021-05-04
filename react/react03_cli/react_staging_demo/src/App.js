import React, { Component } from 'react'
import { Button } from 'antd';
import 'antd/dist/antd.css'

export default class App extends Component {
    render() {
        return (
            <div>
                app。。。。
                <button>click</button>

                <Button type="primary">Primary Button</Button>
                <Button type="">Primary Button</Button>

            </div>
        )
    }
}

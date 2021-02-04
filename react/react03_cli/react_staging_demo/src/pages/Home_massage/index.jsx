import React, { Component } from 'react'
import {Link,Route} from 'react-router-dom'
import Detail from '../Home_message_detail'

export default class Message extends Component {
    state  = {
        messageArr:[
            {id:'01',title:"msg1"},
            {id:'02',title:"msg2"},
            {id:'03',title:"msg3"},
        ]
    }
    render() {
        return (
            <div>
                <ul>
                  
                    {this.state.messageArr.map((msgObj)=>{
                        return (
                            <li key={msgObj.id}>
                                {/* <Link to={`/home/message/detail/${msgObj.id}`}>{msgObj.title}</Link>&nbsp;&nbsp; */}
                                <Link to={`/home/message/detail/${msgObj.id}/${msgObj.title}`}>{msgObj.title}</Link>&nbsp;&nbsp;
                            </li>
                        )
                    })}
                </ul>

                    <hr/>
                <div>
                    <Route path= '/home/message/detail/:id/:title'  component={Detail}/>
                    
                </div>
            </div>
        )
    }
}

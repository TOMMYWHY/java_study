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
                                {/* params */}
                                <Link  to={`/home/message/detail/${msgObj.id}/${msgObj.title}`}>{msgObj.title}</Link>&nbsp;&nbsp;

                                {/* search */}
                                {/* <Link to={`/home/message/detail/?id=${msgObj.id}&title=${msgObj.title}`}>{msgObj.title}</Link>&nbsp;&nbsp; */}

                                {/* state */}
                                {/* <Link to={{pathname:"/home/message/detail",state:{id:msgObj.id,title:msgObj.title}}}>{msgObj.title}</Link>&nbsp;&nbsp; */}
                            </li>
                        )
                    })}
                </ul>

                    <hr/>
                <div>
                    {/* params */}
                    <Route path= '/home/message/detail/:id/:title'  component={Detail}/>

                    {/* search */}
                    {/* <Route path= '/home/message/detail'  component={Detail}/> */}

                    {/* state */}
                    {/* <Route path= '/home/message/detail'  component={Detail}/> */}

                    
                    
                </div>
            </div>
        )
    }
}

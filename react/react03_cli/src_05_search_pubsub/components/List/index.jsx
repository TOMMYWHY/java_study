import React, { Component } from 'react'
import PubSub from 'pubsub-js'

export default class List extends Component {

    state = {
        users:[],
        isFirst:true,
        isLoading: false,
        err:""
    }

    componentDidMount(){
        this.token = PubSub.subscribe("pub-sub",(msg,stateObj)=>{
            this.setState(stateObj)
        })
    }

    componentWillUnmount(){
        PubSub.unsubscribe(this.token)
    }
    
    render() {

        const {users, isFirst,isLoading,err} = this.state
        return (
            <div className="row">
                {
                    isFirst ? 
                    <h2>welcome, search github users name SVP.</h2>:
                    isLoading ? 
                    <h2>Loading....</h2>:
                    err?
                    <h3 style={{color:"red"}}>{err} </h3>:

                    users.map((userObj)=>{
                        return(
                    <div className="card" key={userObj.id} >
                        <a href={userObj.html_url} target="_blank" rel="noreferrer">
                        <img src={userObj.avatar_url} style={{width: "100px"}} alt="head portrait"/>
                        </a>
                        <p className="card-text">{userObj.login}</p>
                    </div>
                        )
                    })
                }

                    
                    
                  
                </div>
        )
    }
}

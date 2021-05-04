import React, { Component } from 'react'

export default class List extends Component {
    render() {

        const {users, isFirst,isLoading,err} = this.props
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

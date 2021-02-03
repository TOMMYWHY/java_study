import React, { Component } from 'react'
import axios from 'axios'

export default class Search extends Component {

    search=(event)=>{
        // console.log(this.keyWordElement.value);
        const{keyWordElement:{value:keywords}} = this;
        this.props.updateAppState({isFirst:false,isLoading:true})
        


        console.log(keywords);
        axios.get(`https://api.github.com/search/users?q=${keywords}`).then(
            (resp)=>{
                console.log(resp.data);
                // this.props.saveUsers(resp.data.items)
                this.props.updateAppState({isLoading:false,users:resp.data.items})

            },
            (err)=>{
                console.log(err);
                this.props.updateAppState({isLoading:false,err:err.message})

            }
        )
    }

    render() {
        return (
            <section className="jumbotron">
                <h3 className="jumbotron-heading">Search Github Users</h3>
                <div>
                    <input ref={(c)=>{this.keyWordElement=c}} type="text" placeholder="enter the name you search"/>&nbsp;
                    <button onClick={this.search}>Search</button>
                </div>
            </section>
        )
    }
}

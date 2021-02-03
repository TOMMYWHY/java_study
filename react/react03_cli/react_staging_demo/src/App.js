import React, { Component } from 'react'
import axios from 'axios'

export default class App extends Component {
    getStudentData=()=>{
        console.log("!");
        axios.get("http://localhost:3000/api1/students").then(
            (resp)=>{
                console.log("success:",resp.data);
            },
            (err)=>{
                console.log("error,",err);
            }
        )
    }

    getCarData=()=>{
        console.log("!");
        axios.get("http://localhost:3000/api2/cars").then(
            (resp)=>{
                console.log("success:",resp.data);
            },
            (err)=>{
                console.log("error,",err);
            }
        )
    }


    render() {
        return (
            <div >
               <h1>app...</h1>
               <button onClick={this.getStudentData}>click me</button>
               <button onClick={this.getCarData}>click me</button>
            </div>
        )
    }
}

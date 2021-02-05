import React, { Component } from 'react'
import store from '../../redux/store'

export default class Count extends Component {
    
    state={
        // count:0
    }
    componentDidMount(){
        store.subscribe(()=>{
            this.setState({})
        })
    }

    increment=()=>{
        const {value} = this.selectedNumber
        store.dispatch({type:'increment',data:value*1})
    }
    decrement=()=>{
        const {value} = this.selectedNumber
        store.dispatch({type:'decrement',data:value*1})
    }
    incrementIfOdd=()=>{
        
        const {value} = this.selectedNumber
        const count=  store.getState()
        if((count)%2 !==0){
            store.dispatch({type:'increment',data:value*1})
        }
    }
    incrementAsync=()=>{
        const {value} = this.selectedNumber
        setTimeout(() => {
            store.dispatch({type:'increment',data:value*1})
        }, 500);
        
    }

    render() {
        return (
            <div>
                <h1>current sum : {store.getState()} </h1>
                <hr/>
                <select ref={c=>this.selectedNumber=c} name="" id="">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>

                <button onClick={this.increment} >+</button>&naps;
                <button onClick={this.decrement}>-</button>
                <button onClick={this.incrementIfOdd}>add by odd sum</button>
                <button onClick={this.incrementAsync}>async add</button>
            </div>
        )
    }
}

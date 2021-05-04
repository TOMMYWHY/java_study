import React, { Component } from 'react'

// import store from '../../redux/store'
// import {createIncrementAction,
//     createDecrementAction,
//     createIncrementAsyncAction
// } from '../../redux/count_action'
export default class Count extends Component {
    
    state={
        // count:0
    }

    increment=()=>{
        const {value} = this.selectedNumber
        // store.dispatch(createIncrementAction(value*1))
        this.props.add(value*1)
    }
    decrement=()=>{
        const {value} = this.selectedNumber
        // store.dispatch(createDecrementAction(value*1))
        this.props.minus(value*1)

    }
    incrementIfOdd=()=>{
        
        const {value} = this.selectedNumber
        // const count=  store.getState()
        if((this.props.count)%2 !==0){
            // store.dispatch(createIncrementAction(value*1))
            this.props.add(value*1)
        }       
    }
    incrementAsync=()=>{
        const {value} = this.selectedNumber

        // store.dispatch(createIncrementAsyncAction(value*1,500))

        this.props.addAsync(value*1,500)

    }

    render() {
        // console.log("1111:",this.props);
        return (
            <div>
                <h1>current sum :
                    {this.props.count}
                </h1>
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

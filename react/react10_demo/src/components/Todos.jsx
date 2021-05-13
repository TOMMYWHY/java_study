import React, { Component ,Fragment} from 'react'

class Todos extends Component {
    /*
    constructor(props){
        super(props)
        this.state={
            inputValue:"tommy",
            list:[]
        }
    }
    */
    state = {
        inputValue:"tommywhy",
        list:['aaa','bba']
    }
    inputChange=(e)=>{
        this.setState({
            inputValue : e.target.value
        })
    }
    addItem=()=>{
        this.setState({
            list:[this.state.inputValue,...this.state.list],
            inputValue:''
        })
    }
    render() { 
        return (
            <Fragment>
                <input type="text" value={this.state.inputValue} onChange={this.inputChange}/> 
                <button onClick={this.addItem}>add</button>
                <ul>
                    {
                        this.state.list.map((item,index)=>{
                        return (<li key={index}> {item} </li>) 
                        })
                    }
                    
                </ul>
            </Fragment>
        );
    }
}
export default Todos;
import React, { Component, Fragment } from 'react';
import TodoItem from './TodoItem';


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
        inputValue: 'tommywhy',
        list: ['aaa', 'bba'],
    };
    inputChange = (e) => {
        this.setState({
            inputValue: e.target.value,
        });
    };
    addItem = () => {
        this.setState({
            list: [this.state.inputValue, ...this.state.list],
            inputValue: '',
        });
    };
    deleteItemAAAAA = (index) => {
        console.log(index);
        let list = this.state.list
        list.splice(index, 1)
        this.setState(
            this.state.list = list
        )
    }
    // deleteItem(index) {
    //     console.log(index)
    // }

    render() {
        return (
            <Fragment>
                <label htmlFor="input">Todo:</label>
                <input id='input'
                    type="text"
                    value={this.state.inputValue}
                    onChange={this.inputChange}
                />
                <button onClick={this.addItem}>add</button>
                {/* <ul>
                    {
                        this.state.list.map((item, index) => {
                            return (
                                <li key={index}  >
                                    <span>{item}</span>
                                    <button onClick={this.deleteItem.bind(this, index)}>delete</button>
                                </li>
                            )
                        })
                    }
                </ul> */}
                <hr />
                <ul>
                    {
                        this.state.list.map((item, index) => {
                            return (
                                <TodoItem key={index} item={item} index={index} deleteItemA={this.deleteItemAAAAA}></TodoItem>
                            )
                        })
                    }
                </ul>



            </Fragment>
        );
    }
}
export default Todos;
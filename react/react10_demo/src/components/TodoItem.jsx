import React, { Component, Fragment } from 'react'
import PropTypes from 'prop-types'


class TodoItem extends Component {
    state = {}
    handleClick = () => {
        console.log(this.props.index);
        this.props.deleteItemA(this.props.index)
    }
    render() {
        // let item = this.props.item
        // let index = this.props.index
        let { item, index } = this.props
        return (
            <Fragment>
                <li key={index}
                // dangerouslySetInnerHTML={{ __html: item }}
                >
                    <span>{index}==={item}</span>

                    {/* <button onClick={() => { this.deleteItemAAAAA(index) }}>delete</button> */}
                    <button onClick={this.handleClick}>delete</button>
                </li>
            </Fragment>
        );
    }
}

TodoItem.propTypes = {
    item: PropTypes.string,
    index: PropTypes.number,
    deleteItemA: PropTypes.func
}


export default TodoItem;
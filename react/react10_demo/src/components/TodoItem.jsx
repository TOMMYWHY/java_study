import React, { Component, Fragment } from 'react'
import PropTypes from 'prop-types'


class TodoItem extends Component {
    state = {}

    /*
    组件更新
    */
    shouldComponentUpdate = (nextProps, nextState) => {
        if (nextProps.item !== this.props.item) {
            return true;
        } else {
            return false;
        }

    }

    handleClick = () => {
        console.log(this.props.index);
        this.props.deleteItemA(this.props.index)
    }

    render() {
        console.log("rendering....");
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
    item: PropTypes.string.isRequired,
    index: PropTypes.number,
    deleteItemA: PropTypes.func
}
TodoItem.defaultProps = {}

export default TodoItem;
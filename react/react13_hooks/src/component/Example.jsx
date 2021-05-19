import React, { Component, Fragment, useState } from 'react'

const Example = () => {
    const [count, setCount] = useState(0)
    return (
        <Fragment>
            <h1>{count}</h1>
            <hr />
            <button onClick={() => { setCount(count + 1) }}>add</button>
        </Fragment>
    )
}



/**
class Example extends Component {
    state = {
        count: 0
    }
    addCount = (e) => {
        this.setState({
            count: this.state.count + 1
        })
    }
    render() {
        return (
            <Fragment>
                <h1>{this.state.count}</h1>
                <hr />
                <button onClick={() => { this.addCount() }}>add</button>
            </Fragment>
        );
    }
}
*/
export default Example;
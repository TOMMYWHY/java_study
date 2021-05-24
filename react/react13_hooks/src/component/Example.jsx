import React, { Component, Fragment, useEffect, useState } from 'react'

const Example = () => {
    const [count, setCount] = useState(0)
    // console.log(useState(0));
    const [name, setName] = useState('tommy')
    const [age, setAge] = useState(18)

    useEffect(() => {
        console.log(`useEffect : ${count}`);
        return () => {
            console.log('destroy');
        }
    }, [count])

    return (
        <Fragment>
            <h1>{count}</h1>
            <hr />
            <button onClick={() => { setCount(count + 1) }}>add</button>
            <hr />

            <h2>{name}:{age}</h2>
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
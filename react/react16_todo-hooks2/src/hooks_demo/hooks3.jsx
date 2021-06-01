import React, { useReducer, useRef } from 'react'

const reducer = (state, action) => {
    console.log(state, action);
    switch (action.type) {
        case 'add':
            return { count: state.count + 1 };
        case 'sub':
            return { count: state.count - 1 };
        default:
            throw '...'
    }
    return 10;
}

export default () => {
    const [counter, dispatch] = useReducer(reducer, { count: 10 })
    const refInput = useRef()
    return (
        <div>
            <h1>{counter.count}</h1>
            <button onClick={() => { dispatch({ type: "add" }) }}>+</button>
            <button onClick={() => dispatch({ type: "sub" })} >-</button>

            <hr />

            <input type="text" ref={refInput} />
            <button onClick={() => { refInput.current.focus() }}>focus </button>
        </div>
    )
}

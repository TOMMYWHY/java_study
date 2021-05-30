import React, { useState } from 'react'

const useCount = (initValue) => {
    const addCount = () => {
        setCount(count + 1)
    }
    const [count, setCount] = useState(initValue)
    // return [count, () => { setCount(count + 1) }]
    return [count, addCount]
}

export default (props) => {

    // const [count, setCount] = useState(0)
    const [count1, addCount1] = useCount(0)
    const [count2, addCount2] = useCount(0)

    // const addCount = () => {
    //     setCount(count + 1)
    // }
    return (
        <div>
            <h1>{count1}</h1>
            <h1>{count2}</h1>
            <button onClick={() => { addCount1() }}>add</button>
            <button onClick={() => { addCount2() }}>add</button>
        </div>
    )
}

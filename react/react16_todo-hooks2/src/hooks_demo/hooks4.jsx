import React, { useEffect, useState } from 'react'

const sleepFun = () => {
    return new Promise((resolve) => {
        setTimeout(
            () => {
                resolve()
            }
            , 2000)

    })
}
async function getPerson() {
    await sleepFun(200)
    return ['a', 'b', 'c']
}
const usePerson = () => {
    const [list, setList] = useState(null)

    async function request() {
        const list = await getPerson()
        setList(list)
    }

    useEffect(request, [])
    return list
}


export default () => {
    const list = usePerson()
    if (list === null) {
        return <div>loading....</div>
    }
    return (
        <div>{list.map((item, index) => {
            return <li key={index}>{item}</li>
        })}</div>
    )
}
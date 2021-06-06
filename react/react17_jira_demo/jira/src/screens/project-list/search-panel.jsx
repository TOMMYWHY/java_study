import {useEffect, useState} from 'react';

export const SearchPanel = ()=>{
    const [param, setParam] = useState({
        name:'',
        personId:''
    });

    const [users, setUsers] = useState([]);
    const [list, setList] = useState([]);

    useEffect(()=>{
        fetch('').then(async response=>{
            if(response.ok){
                setList(await response.json())
            }
        }).catch()
    },[param])

    return <form >
        <input type="text" value={param.name} onChange={evt=>setParam({
            ...param,
            name:evt.target.value
        })}/>
        <select name="" id="" value={param.personId} onChange={evt=>setParam({
            ...param,
            personIdL: evt.target.value
        })}>
            <option value={""}>manager</option>
            {users.map((user)=>{
                return (<option value={user.id}>{user.name}</option>)
            })}
        </select >
    </form>
}
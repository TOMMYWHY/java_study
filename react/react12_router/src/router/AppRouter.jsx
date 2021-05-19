import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import Index from '../pages/Index'
import List from '../pages/List'


// function Index() {
//     return <h2>index</h2>
// }

// let Index = () => {
//     return <h2>index</h2>
// }
// function List() {
//     return <h2>List</h2>
// }

function AppRouter() {
    return (
        <Router>
            <ul>
                <li><Link to='/' >index</Link></li>
                <li><Link to='/list/'>list</Link></li>
            </ul>
            <hr />
            <Route path='/' exact component={Index}></Route>
            <Route path='/list/:id' exact component={List}></Route>
        </Router>
    )
}
export default AppRouter

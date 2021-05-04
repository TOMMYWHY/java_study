import React, { Component } from 'react'
import { Route,Switch,Redirect} from 'react-router-dom'

import Home_news from '../Home_news'
import Home_massage from '../Home_massage'
import MyNavLink from '../../components/MyNavLink'

export default class Home extends Component {
    render() {
        // console.log("Home",this.props);
        return (
            <div>
                <h3>我是Home的内容</h3>
                <ul className="nav nav-tabs">
                    <li>
                    <MyNavLink to="/home/news" className="list-group-item" href="./home-news.html">News</MyNavLink>
                    </li>
                    <li>
                    <MyNavLink to="/home/message" className="list-group-item" href="./home-message.html">Message</MyNavLink>
                    </li>
                </ul>
                <Switch> 
                    <Route path="/home/news" component={Home_news}></Route>
                    <Route path="/home/message" component={Home_massage}></Route>
                    <Redirect to="/home/news" />
                </Switch>
            </div>
        )
    }
}

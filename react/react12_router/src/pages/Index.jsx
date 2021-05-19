import React, { Component, Fragment } from 'react';
import { Link } from 'react-router-dom'
class Index extends Component {
    state = {
        list: [
            { cid: 123, title: "title1...." },
            { cid: 456, title: "title2...." },
            { cid: 789, title: "title3...." },
        ]
    }
    render() {
        return (
            <Fragment>
                <h2>index</h2>
                <ul>
                    {this.state.list.map((item, index) => {
                        return (<li key={index}>
                            <Link to={ '/list/'+item.cid}>
                                {item.title}
                            </Link>
                        </li>)
                    })}
                </ul>
            </Fragment>
        );
    }
}

export default Index;
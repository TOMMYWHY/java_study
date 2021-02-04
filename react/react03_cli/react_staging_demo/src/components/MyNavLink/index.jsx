import React, { Component } from 'react'
import { NavLink} from 'react-router-dom'


export default class MyNavLink extends Component {
    render() {
        // const{to,title} = this.props
        // const {} = this.props
        return (
            
            <NavLink activeClassName="active_heighlight" className="list-group-item " {...this.props} />
                
            
                                
        )
    }
}

import React, { Component } from 'react'
class List extends Component {
    state = {
        id: null
    }

    componentDidMount = () => {
        console.log(this.props);
        let tempId = this.props.match.params.id
        this.setState({
            id: tempId
        })
    }
    render() {
        return (
            <h2>List page : {this.state.id}</h2>
        );
    }
}

export default List;
import React from "react";

class HelloWorld extends React.Component{
    render() {
        return (<div>hello tommy~ , name = {this.props.name} ,text = {this.props.children}</div>);
    }
}

export default HelloWorld;
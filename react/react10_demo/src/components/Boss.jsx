import React, { Component, Fragment } from 'react';
import { CSSTransition } from 'react-transition-group'
class Boss extends Component {
    state = {
        isShow: true
    }
    btn1 = () => {
        this.setState(
            { isShow: !this.state.isShow }
        )
        console.log('btn1', this.state.isShow)

    }
    render() {
        return (
            <Fragment >
                {/* <div className={this.state.isShow ? "show" : 'hide'}>Boss1</div> */}
                <CSSTransition in={this.state.isShow} timeout={2000}
                    classNames='boss-text' unmountOnExit>
                    <div >Boss1</div>
                </CSSTransition>
                <div><button onClick={this.btn1}>call</button></div>
            </Fragment>
        );
    }
}

export default Boss;
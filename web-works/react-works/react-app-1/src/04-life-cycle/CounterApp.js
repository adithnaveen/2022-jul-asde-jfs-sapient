import React, { Component } from 'react';


class CounterApp extends Component {
    state = {
        count: 1
    }

    num = 1;
    constructor() {
        super();
        console.log("in CounterApp.constructor()");
    }

    componentDidMount() {
        // we shall have the fetch here 
        console.log("in CounterApp.componentDidMount()");
    }

    render() {
        return (
            <div className="container">
                <div className="row">
                    <div className="col-md-4">
                        <div className="alert alert-info">{this.props.title}</div>
                        <h2>Counter Application</h2>
                        <h3>The value of count : {this.state.count}</h3>
                        <h3>The value of Number : {this.num}</h3>
                        <button className="btn btn-danger"
                            onClick={() => {
                                this.setState({ count: this.state.count + 1 })
                            }}
                        >Increment Count</button>

                        <button className="btn btn-secondary"
                            onClick={() => {
                                this.num++;
                                this.forceUpdate();
                            }}
                        >Increment Number</button>

                    </div>
                </div>
            </div>
        );
    }

    componentWillUnmount() {
        console.log("in CounterApp.componentWillUnmount()");
    }

    componentDidUpdate() {
        console.log("in CounterApp.componentDidUpdate()");
    }
    shouldComponentUpdate() {
        console.log("in CounterApp.shouldComponentUpdate()");
        return true;
    }
}

export default CounterApp;
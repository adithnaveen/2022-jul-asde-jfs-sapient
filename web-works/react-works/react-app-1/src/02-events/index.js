// imrc 
import React, { Component } from 'react';

import './App.css';

import Btn1 from './Btn';



const Btn2 = ({ caption, handler, className1 }) =>
(<button onClick={handler}
    className={className1} >{caption}</button>);


// ccs 
class App extends Component {

    state = { num: 10, mynum: 100 };
    constructor() {
        super();
        console.log("You are in App-Even Constructor");
        // this.btnHandlerIncrement = this.btnHandlerIncrement.bind(this);
        // this.btnHandlerDecrement = this.btnHandlerDecrement.bind(this);
    }

    // version 1 
    btnHandlerIncrement() {
        console.log("you clicked Button btnHandlerIncrement() ", this)
    }

    btnHandlerDecrement() {
        console.log("you clicked Button btnHandlerDecrement() ", this)
    }

    increment = () => {
        this.setState({ num: this.state.num + 1 });
    }
    decrement = () => {
        this.setState({ num: this.state.num - 1 });
    }

    incrementOrDecrement = (val) => {
        this.setState({ num: this.state.num + val })
    }

    render() {
        let count = 0;

        return (
            <div className="app-content">
                <h3>Working with Events</h3>

                { /* version 1*/}
                <button className='btn btn-primary'
                    onClick={this.btnHandlerIncrement.bind(this)}
                >Increment</button>


                <button className='btn btn-danger'
                    onClick={this.btnHandlerDecrement.bind(this)}
                >Decrement</button>
                <br />
                <h3>The value of count {count}</h3>
                <h3>The value of num {this.state.num}</h3>

                <br />

                <button className="btn btn-danger"
                    onClick={this.increment}>Increment</button>


                <button className="btn btn-danger"
                    onClick={
                        this.decrement
                    }>Decrement</button>


                <button className="btn btn-success"
                    onClick={() =>
                        this.incrementOrDecrement(1)
                    }>INCR</button>
                <button className="btn btn-success" onClick={() =>
                    this.incrementOrDecrement(-1)
                }>DECR</button>


                <br />

                <Btn1 caption="INCREMENT"
                    handler={() => this.incrementOrDecrement(1)} />
                <Btn1 caption="DECREMENT"
                    handler={() => this.incrementOrDecrement(-1)} />

                <Btn2 caption="DECREMENT"
                    handler={() => this.incrementOrDecrement(-1)}
                    className1="btn btn-dark"
                />

            </div>
        );
    }
}

export default App;
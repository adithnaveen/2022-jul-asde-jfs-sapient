import React, { Component } from 'react';

import './index.css';

import CounterApp from './CounterApp';


class App extends Component {
    state = {
        showHideApp: true,
        title: "Hello World"
    }
    render() {

        let output = null;
        if (this.state.showHideApp === true) {
            output = <CounterApp title={this.state.title} />;
        }

        return (
            <div className="container">
                <div className="alert alert-success">LifeCycle Example</div>

                <button className="btn btn-primary"
                    onClick={() => {
                        this.setState({ showHideApp: !this.state.showHideApp })
                    }}
                >Show Hide Component</button>

                <button className="btn btn-success"
                    onClick={() => {
                        if (this.state.title === 'Hello World') {
                            this.setState({ title: 'React World' })
                        } else {
                            this.setState({ title: 'Hello World' })
                        }
                    }}
                >Toggle Title</button>


                {output}
            </div>
        );
    }
}

export default App;
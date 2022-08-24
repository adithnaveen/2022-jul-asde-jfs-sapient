import React, { Component } from 'react';

import EmployeeForm from './EmployeeForm';

class App extends Component {
    render() {
        return (
            <div className="container">
                <h1 className="alert">Employee Form - Controlled Component</h1>
                <div className="row">
                    <div className="col-md-6">
                        <EmployeeForm />

                    </div>
                    <div className="col-md-6">
                        Other stuffs..
                    </div>
                </div>
            </div>
        );
    }
}

export default App;




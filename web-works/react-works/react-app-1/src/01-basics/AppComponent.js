import React, { Component } from 'react';

import './AppComponent.css';

class AppComponent extends Component {
    render() {
        // this.props.emp
        const { emp } = this.props;
        return (
            <div className='app-content'>
                <h3>Employee Details</h3>
                <table style={{ border: "1px solid black" }}>
                    <tbody>
                        <tr>
                            <td>Employee Name </td>
                            <td>{emp.name}</td>
                        </tr>
                        <tr>
                            <td>Employee Exp</td>
                            <td>{emp.experience}</td>
                        </tr>
                        <tr>
                            <td>Employee Exp</td>
                            <td>{emp.email}</td>
                        </tr>
                    </tbody>
                </table>
            </div >
        );
    }
}

export default AppComponent;
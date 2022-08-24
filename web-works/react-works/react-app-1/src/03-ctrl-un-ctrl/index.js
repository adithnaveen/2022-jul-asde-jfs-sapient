import React, { Component } from 'react';


import ProductForm from './ProductForm';

class App extends Component {
    render() {
        return (

            /*  .container>.alert-alert-info>h1{Product Form}+.row>.col*2 */

            <div className="container">
                <div className="alert alert-info">
                    <h1>Working with Product (UnControlled)</h1>
                </div>
                <div className="row">
                    <div className="col"><ProductForm /> </div>
                    <div className="col">Second Part Of Form</div>
                </div>

            </div>
        );
    }
}

export default App;
import React, { Component } from 'react';


import ContactList from './ContactList';

class App extends Component {
    state = {
        contacts: []
    }
    // this handled cross cutting works like 
    // fetch from rest end point 
    componentDidMount() {
        fetch("http://localhost:4000/contacts")
            .then(resp => resp.json())
            .then(contacts => this.setState({ contacts }))
    }
    render() {

        return (
            <div className="container">
                <div className="row">
                    <div className="col">
                        <h1 className="alert alert-info">Contacts List </h1>
                        <ContactList contacts={this.state.contacts} />

                    </div>
                    <div className="col">
                        <h3>product List</h3>
                    </div>
                </div>
            </div>

        );
    }
}

export default App;


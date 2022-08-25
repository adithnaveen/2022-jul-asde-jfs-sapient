import React, { Component } from 'react';

import ContactCard from './ContactCard';

class App extends Component {
    state = {
        contacts: []
    }
    // this handled cross cutting works like 
    // fetch from rest end point 
    componentDidMount() {
        fetch("http://localhost:4000/contacts")
            .then(resp => resp.json())
            .then(data => this.setState({ contacts: data }))

    }
    render() {
        const contactList = this.state.contacts.map((c, idx) => <ContactCard contact={c} key={idx} />);
        return (
            <div className="container">
                <h1 className="alert alert-info">Contacts List </h1>
                <h4>Number Of Contacts{this.state.contacts.length}</h4>
                {contactList}
            </div>

        );
    }
}

export default App;


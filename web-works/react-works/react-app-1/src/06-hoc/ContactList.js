import React, { Component } from 'react';

import ContactCard from './ContactCard';
import Loading from './Loading';
class ContactList extends Component {

    render() {

        const contactList = this.props.contacts.map((c, idx) => <ContactCard contact={c} key={idx} />);
        return (
            <div className="container">
                <h3>Contact List</h3>
                {contactList}
            </div>
        );
    }
}

export default Loading('contacts')(ContactList);
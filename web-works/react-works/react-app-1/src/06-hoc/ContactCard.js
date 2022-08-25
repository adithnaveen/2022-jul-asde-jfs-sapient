import React from 'react';

import { Title, Button } from '../05-contacts-fetch/style';

const ContactCard = ({ contact }) => {
    return <div className="card" style={{ width: '500px', height: '120px', margin: '10px', padding: '7px' }}>

        <div className="row">
            <div className="col-md-6">
                <div className="card-body">
                    <div className="card-title"><h5>{contact.gender === 'Male' ? "Mr" : "Ms/Mrs"}
                        :{contact.first_name + " " + contact.last_name}</h5></div>
                    <div className="card-data">{contact.email}</div>
                    <div className="card-data">{contact.phone}</div>
                </div>
            </div>
            <div className="col-md-3">
                <img src={contact.pic} alt={contact.name} className="card-img"
                    style={{ width: '100px', height: '100px' }}
                />

            </div>
            <div className="col-md-3">
                <Title>{contact.id}</Title> <Button primary>X</Button>
            </div>
        </div>
    </div>
}

export default ContactCard;
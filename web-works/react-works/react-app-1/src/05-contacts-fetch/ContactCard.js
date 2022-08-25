import React from 'react';


const ContactCard = ({ contact }) => {
    return <div className="card" style={{ width: '400px', height: '120px', margin: '10px', padding: '7px' }}>
        <div className="row">
            <div className="col-md-8">
                <div className="card-body">
                    <div className="card-title"><h5>{contact.gender === 'Male' ? "Mr" : "Ms/Mrs"}
                        :{contact.first_name + " " + contact.last_name}</h5></div>
                    <div className="card-data">{contact.email}</div>
                    <div className="card-data">{contact.phone}</div>
                </div>
            </div>
            <div className="col-md-4">
                <img src={contact.pic} alt={contact.name} className="card-img"
                    style={{ width: '100px', height: '100px' }}
                />
            </div>
        </div>
    </div>
}

export default ContactCard;
import React from 'react';

import './Footer.css';

export default function AppFooter({ year }) {
    return (
        <div>
            <hr />
            <p className='myfooter' >Copyright &copy; Reserved; Sapient {year}</p>
        </div>

    );
}
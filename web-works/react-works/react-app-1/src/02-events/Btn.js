import React from 'react'

const Btn1 = ({ caption, handler }) =>
 (<button onClick={handler} 
    className="btn btn-secondary">{caption}</button>);

export default Btn1
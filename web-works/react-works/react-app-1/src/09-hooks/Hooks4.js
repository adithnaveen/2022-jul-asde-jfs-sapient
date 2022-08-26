import React, { useReducer } from 'react';


const App = () => {


    const [number, setNumber] = useReducer((number, newNumber) => number + newNumber, 0);


    return (
        <div>
            <h1>Value of Number {number}</h1>
            <button className="btn btn-primary"
                onClick={() => {
                    setNumber(10)
                }}
            >Set Value</button>
        </div>
    )
}

export default App;
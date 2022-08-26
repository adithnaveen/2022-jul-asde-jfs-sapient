import React, { useEffect, useState } from 'react';

const App = () => {

    const [count, setCount] = useState(0);
    const [name, setName] = useState("harry");

    // useEffect is a function 
    // default behaviour of useEffect is called when even state is invoked 
    // on useEffect if you hav empty array it will be called only once for page load 
    // you can have useEffect to use only for specifice useState 
    useEffect(() => {
        document.title = `Value of Count : ${count}`;
        console.log(`i'm in use effect... ${count}`);
    }, [count])


    return (
        <div>

            <button className="btn btn-info"
                onClick={() => {
                    setCount(count + 1)
                }}
            >Increment Count</button>
            <p>Name {name}</p>

            <button className="btn btn-warning"
                onClick={() => {
                    setName("Harry Peter")
                }}    >Get Full Name</button>

        </div>
    )

}

export default App; 
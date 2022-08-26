import React, { useState } from 'react';


/*
    class MyClass extends Component {

        state = {
            name:"pranshu", 
            count:0, 
            admin: true
        }
        render() {
            <div>
                Name is {this.state.name}
                ... 

                <button onclick={() => {
                        
                    this.setState({name: "Pranshu Kumar"})

                }}>get full name</button>
            </div>
        }
    }
*/

const App = () => {

    const [name, setName] = useState("Pranshu");
    const [count, setCount] = useState(0);
    const [admin, setAdmin] = useState(true);

    return (
        <div>
            <h2 className='alert alert-info'>Value of Count {count}</h2>
            <h2 className='alert alert-info'>Name {name}</h2>
            <h2 className='alert alert-info'>Is Admin {admin ? "Yes" : "No"}</h2>

            <button className="btn btn-primary"
                onClick={() => {
                    setCount(count + 1)
                }}    >Increment Count</button>


            <button className="btn btn-primary"
                onClick={() => {
                    setCount(count - 1)
                }}    >Decrement Count</button>


            <button className="btn btn-warning"
                onClick={() => {
                    setName("Pranshu Kumar")
                }}    >Get Full Name</button>

            <input type="checkbox" name="setIsAdmin"
                onChange={() => {
                    setAdmin((admin) => !admin)
                }}

            />


        </div>
    );

}

export default App
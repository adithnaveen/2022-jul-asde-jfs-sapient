import React, { useState, useEffect } from 'react';

const App = () => {
    const [data, setData] = useState([]);

    useEffect(() => {
        fetch("https://api.github.com/users")
            .then(resp => resp.json())
            .then(setData);
    }, []);


    if (data.length > 0) {
        return (
            <div>
                <ul>
                    {
                        data.map((user, index) => (
                            <li key={user.id}>{user.login} - {user.url}</li>
                        ))
                    }
                </ul>
            </div>
        );
    }

    return <div>Sorry no records...</div>

}

export default App;
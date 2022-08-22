import React, { Component, Fragment } from 'react';
import AppComponent from './AppComponent';
import AppHeader from './AppHeader';
import AppFooter from './AppFooter';

class App extends Component {
    render() {

        const employee = {
            name: "Alok",
            experience: "Frehser",
            email: "alok@gmail.com"
        }

        return (
            <>
                <AppHeader company="Publicis Sapient" place="Bengaluru" />
                <AppComponent emp={employee} />

                <AppFooter year="2022" />
            </>
        );
    }
} export default App;
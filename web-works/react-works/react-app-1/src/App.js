
import React, { Component } from 'react'

class App extends Component {

  render() {
    const name = "Himanshu";
    const message = "Hello World";
    return (
      <div>
        <h1>Hello {name} message : {message}</h1>
        <p>hello this is new message</p>
      </div>
    );
  }
}

export default App;
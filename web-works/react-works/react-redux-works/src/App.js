import React, { Component } from 'react';

import 'bootstrap/dist/css/bootstrap.css';

import { createStore } from 'redux';
import rootReducer from './reducers/root-reducer';

let store = createStore(rootReducer);

class App extends Component {

  render() {
    return (
      <div></div>
    );
  }
}

export default App;
import 'bootstrap/dist/css/bootstrap.css';
import './index.css';

import { createStore } from 'redux';

// reducer is a function, which take the current state from the store 
// since we dont have the store with any values, we shall initialize store 
// with some values + reducer get a parameter from UI which is dispatching action 


const initialState = ['Pranshu', 'Rohit'];


const reducer = (state = initialState, action) => {

  switch (action.type) {
    case 'ADD_NAME':
      return [...state, action.data];

    case 'DELETE_NAME':
      let names = [...state];
      names.splice(action.data, 1);
      return names;

    default:
      return state;
  }
}

const store = createStore(reducer);
window['store'] = store;
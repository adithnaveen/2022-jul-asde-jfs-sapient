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

// submit handler 
const submitHandler = (evt) => {
  evt.preventDefault();

  const name = document.getElementById("name").value;
  const action = { type: 'ADD_NAME', data: name };

  store.dispatch(action);
  document.getElementById("name").value = '';
  document.getElementById("name").focus();

}

document.getElementById("formName").onsubmit = submitHandler;


// update names list 
const updateList = () => {
  let names = store.getState();

  let list = names.map((name, index) => {
    return '<li class="list-group-item">' + '<button class="btn btn-danger" onclick="deleteName(' + index + ')">X</button>' + name + '</li>'
  })
  let listJoined = list.join('');
  document.getElementById("namesList").innerHTML = listJoined;
}

window['updateList'] = updateList;

updateList();
store.subscribe(updateList);

// delete name 

window['deleteName'] = (index) => {
  const action = { type: 'DELETE_NAME', data: index };
  store.dispatch(action);
} 
import {DELETE_ITEM, ADD_ITEM, CHANGE_INPUT, GET_LIST} from './actionTypes';
// import { } from './actionTypes'

const defaultState = {
  inputValue: 'enter....',
  list: ['aaa', 'bbb', 'ccc'],
};
export default (state = defaultState, action) => {
  // console.log (state, action);
  if (action.type === CHANGE_INPUT) {
    let newState = JSON.parse (JSON.stringify (state));
    newState.inputValue = action.value;
    return newState;
  }

  if (action.type === ADD_ITEM) {
    let newState = JSON.parse (JSON.stringify (state));
    newState.list.push (newState.inputValue);
    newState.inputValue = '';
    return newState;
  }
  if (action.type === DELETE_ITEM) {
    let newState = JSON.parse (JSON.stringify (state));
    newState.list.splice (action.index, 1);
    return newState;
  }

  if (action.type === GET_LIST) {
    let newState = JSON.parse (JSON.stringify (state));
    newState.list = newState.list.push (...action.data.data.list);
    console.log ('=====>', newState.list);
    return newState;
  }
  return state;
};

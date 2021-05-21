import './App.scss';
import React, {useState} from 'react';
import TodoList from './hooks/TodoList';

function App () {
  return (
    <div className="App">
      <TodoList />
    </div>
  );
}

export default App;

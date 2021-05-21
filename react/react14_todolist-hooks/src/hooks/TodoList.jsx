import React, { Component, Fragment, useState } from 'react'


const Todo = ({ todo, index, key, completedTodo1, deleteTodo }) => {
    // console.log(todo);


    return (
        <Fragment>
            <div className="todo-item" style={{ textDecoration: todo.isCompleted ? "line-through" : '' }} key={key}>
                {todo.text}
                <div>
                    <button onClick={() => { completedTodo1(index) }}>completed</button>
                    <button onClick={() => { deleteTodo(index) }}>delete</button>
                </div>
            </div>

        </Fragment>
    )
}

const TodoForm = ({ addTodo1 }) => {
    const [value, setValue] = useState('')
    const handleSubmit = (e) => {
        e.preventDefault();
        if (!value) return;
        addTodo1(value);
        setValue(" ")
    }
    return (
        <form onSubmit={handleSubmit}>
            <input type="text" value={value} onChange={e => setValue(e.target.value)} />
            <button>Add </button>
        </form>
    )
}

const TodoList = () => {
    const [todos, setTodos] = useState([
        { text: 'aaa', isCompleted: true },
        { text: 'bb', isCompleted: false },
        { text: 'ccccc', isCompleted: true },
    ]);
    const addTodoFun = (text) => {
        const newTodos = [{ text }, ...todos]
        setTodos(newTodos)
    }
    const deleteTodo = (index) => {
        const newTodos = [...todos]
        newTodos.splice(index, 1)
        setTodos(newTodos)
    }
    const completedTodo = (index) => {
        const newTodos = [...todos]
        // console.log(index);
        // console.log(newTodos[index]);
        newTodos[index].isCompleted = true
        setTodos(newTodos)
    }

    return (
        <Fragment>
            <h1>testing</h1>
            <br /><br />
            <TodoForm addTodo1={addTodoFun}></TodoForm>
            <br /><br />
            <ul className="todo-list">
                {todos.map((todo, index) => {
                    return (
                        // <li key={index}>{item.text}</li>
                        <Todo key={index} todo={todo} index={index} completedTodo1={completedTodo} deleteTodo={deleteTodo} ></Todo>
                    )
                })}
            </ul>
        </Fragment>
    )
}
export default TodoList
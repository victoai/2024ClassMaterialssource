import  "./TodoList.css";
import { useState } from "react";
import TodoItem from "./TodoItem";




const  TodoList = ( {todo , onDelete , onUpdate}) =>{
    const [search, setSearch]= useState("");

    const onChangeSearch = (e) =>{
        setSearch(e.target.value);
    }

    const getSearchResult = () =>{
        return search===""?todo : todo.filter(it => it.content.includes(search));
    };

    return (
        <div className="TodoList">
            <h4> Todo List  🌞</h4>
            <input className="searchbar" placeholder="검색어를 입력하세요"  onChange={onChangeSearch}/>
            <div className="list_wrapper">     
                {
                    getSearchResult().map( (it) => ( <TodoItem key={it.id} { ...it}  onDelete={onDelete}   onUpdate={onUpdate}/>))
                }
            </div>
        </div>
    );
};

export default TodoList;
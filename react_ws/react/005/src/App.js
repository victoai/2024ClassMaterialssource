 
import { useState  , useRef } from 'react';
import './App.css';
import Header from './Header';
import TodoEditor from './TodoEditor';
import TodoList from './TodoList';


function App() {
  
const mockTodo =[
  {
     id:0,
     isDone :false,
     content: "React 공부하기",
     createdDate : new Date().getTime()
  },

  {
     id:1,
     isDone :false,
     content: "빨래 널기",
     createdDate : new Date().getTime()
  },

  {
     id:2,
     isDone :false,
     content: "노래 연습하기",
     createdDate : new Date().getTime()
  }
 

];

  const [ todo, setTodo] = useState( mockTodo);


  const idRef  = useRef(3); //리액트 변수만들기 
  let onCreate  = ( content) =>{
    const newItem ={
      id: idRef.current,
      content,
      idDone:false,
      createdDate: new Date().getTime()
    };



    setTodo([newItem, ...todo]);
    idRef.current +=1;

  };


  
    //삭제
    let onDelete = ( targetId)=>{
      setTodo( todo.filter( (it) => it.id !== targetId));
    } 

    //변경
    const onUpdate  = (targetId)=>{
      setTodo(  todo.map( (it)=>   it.do === targetId?{...it, isDone : !it.isDone} : it));
    }
  return (
    <div className="App">
      <Header/>
      <TodoEditor  onCreate={ onCreate } />
      <TodoList   todo={todo}  onDelete={onDelete}  onUpdate={onUpdate} />    
    </div>
  );
}

export default App;

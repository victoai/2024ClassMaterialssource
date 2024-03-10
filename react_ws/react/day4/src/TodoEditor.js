import { useState } from "react";
import "./TodoEditor.css";
 

const  TodoEditor = ( {onCreate})=>{


    const [content, setContent] = useState("");

    

    return(
        <div className="TodoEditor">
            <h4>새로운 todo 작성하기🖊</h4>
            <div className="editor_wrapper">
                <input placeholder="새로운 todo"  value={content} onChange={ (e)=>{
                    setContent(e.target.value);
                }} />
                <button   onClick={ ()=>{
                     onCreate( content);
                }}>추가</button>
            </div>
        </div>
    );

};

export default TodoEditor;
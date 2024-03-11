import "./TodoItem.css";

const TodoItem = (   { id, content, isDone, createdDate , onDelete , onUpdate} )=>{

const onChangeCheckbox = ()=>{
     onUpdate(id);
}

return (
    <div className="TodoItem">
        <div className="checkbox_col"> <input type="checkbox"  checked={isDone}  onChange={onChangeCheckbox}/></div>
        <div className="title_col" > {content} </div>
        <div className="date_col">{createdDate}</div>
        <div className="btn_col" ><button  onClick={ ()=>{
            onDelete(id);
        }}>삭제</button></div>
    </div>   
);

};

export default TodoItem;

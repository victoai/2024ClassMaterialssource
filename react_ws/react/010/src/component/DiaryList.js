import { useNavigate } from "react-router-dom";
import Button from "./Button";
import DiaryItem from "./DiaryItem";
import { DiaryStateContext } from "../App";
import { useContext } from "react";

const DiaryList = (  ) =>{

     const nav  = useNavigate();
     const data = useContext( DiaryStateContext);

     return(
        <div>
            <div>
                <Button  onClick={ ()=>{ nav("/new")}}  text={"새 일기 쓰기"}  type={"positive"}/>
            </div>

            <div className="list_wrapper">
                {data.map( (item) => {
                    return (
                        <DiaryItem key={item.id}  {...item}/>
                    );
                })}
n
            </div> 
        </div>
     ); 
};


export default DiaryList;
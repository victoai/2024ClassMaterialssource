

import Button from   "../component/Button";
import Header from  "../component/Header"
import DiaryList from "../component/DiaryList";
import { DiaryStateContext } from "../App";
 
import { getStringedDate } from "../utils/get-stringed-date";


const Home  = () =>{


    //현재날짜  -> 년 월 일
    const formattedDate = getStringedDate (new Date());  

     return  (
     <div>  
        <Header         
        
            title={ formattedDate +   '😄'}
 
            
            leftChild= { 
                <Button type={"default"}  text={"<"} 
                onClick={ ()=>{
                      alert("이전");
                }}
                />        
            }


            rightChild= { 
                <Button type={"default"}  text={">"} 
                onClick={ ()=>{
                    alert("다음");
                }}
                />        
            }
            />  
         

         <DiaryList   />
            
         
          
     </div> )

};

export  default Home;

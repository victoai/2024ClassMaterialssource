

import { useReducer } from "react";

//reducer
//변환기
//상태를 변화시키는 함수

function myreducer( count, action){   
    if( action.type ==="INCREASE"){
        count =  count + action.data;
    } else if( action.type ==="DECREASE"){
        count = count - action.data;
    }
    return count;   // 리턴을 하면 상태가 변화됨 !!
}

function Exam ( ){

    //useReducer 사용하기
    const [ count, mydistach]  = useReducer( myreducer,0);

    const onClickPlus =()=>{

        //상태 변화가 발생헤야 함을 알리는 함수 

        mydistach(  {
            type:"INCREASE" ,
            data :1
        });
    };;

    const  onClickMinus = ()=>{
        mydistach({
            type :"DECREASE",
            data:1
        });
    };
    
    return(
        <div>
              <h1>{count}</h1>
              <button onClick={onClickPlus}>+</button>
              <button onClick={onClickMinus}> -</button>
        </div>
    );

}

export default Exam;
import { useState, useEffect } from "react";
function App3() {
    const [count, setCount] = useState(0);
    
    const onHandleClick = () =>{
        setCount( count +1 );
    
    };
     
    
    useEffect( ()=>{
            console.log( "마운트 되었음" );
    } , []);
    
       return (    
           <div>
              dfdfdfd {count}
               <button  onClick={onHandleClick}> + </button>
           </div>
       );
    
    }


    export default App3;
import { useState, useEffect , useRef} from "react";
function App4() {
    const [count, setCount] = useState(0);    
    const onHandleClick = () =>{
        setCount( count +1 );
    
    };
     

    const didMountRef  = useRef(false);  


    
    useEffect( ()=>{

        if( !didMountRef.current){
            didMountRef.current =true;
            return;
        }else{
            console.log( "업데이되었음" );
        }
    } );
    
       return (    
           <div>
              카운트 {count}
               <button  onClick={onHandleClick}> + </button>
           </div>
       );
    
    }


    export default App4;
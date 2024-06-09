import { useState } from "react"
import "./Counter.css";

 

const Counter = () =>{

  const [ counter, setCounter] = useState(0);

  const handleConter = ( value)=>{
    setCounter( counter+value);

  }




  return (
    <div className="Counter">
        <h1>{counter}</h1>
        <button onClick={ ()=>{ handleConter(1)}}>1</button>
    </div>
  );

}


export default Counter;
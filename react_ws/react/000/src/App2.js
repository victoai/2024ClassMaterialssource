 
import { useState } from 'react';
import './App.css';
import { add, subtract } from './math';

function App2() {


  const  [result, setResult] =  useState(0);


  const handleAdd = () => {
    let rtn  = add( 3,5);
    setResult(rtn);     
  };


  const handleSubtract = () =>{
     let rtn  =subtract(3,5);
     setResult(rtn);
  };


  return (
    <div className="App">       
      <button onClick={ handleAdd }>더하기</button>
      <button  onClick={ handleSubtract } >빼기</button>
      <div> {result}</div>
      
    </div>
  );
}

export default App2;

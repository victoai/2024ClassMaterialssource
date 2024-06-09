 
import './App.css';
import { add, subtract } from './math';

function App() {


  return (
    <div className="App">
       
      <button onClick={()=>{
          
           let result  = add( 3 ,5);
           console.log(  result);
           
      }}>더하기</button>
      <button  onClick={ () =>{ 
        
        let result =subtract( 3,5);
        console.log( result)}}
        
        >빼기</button>
      
    </div>
  );
}

export default App;

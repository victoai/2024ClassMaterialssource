 
import './App.css';
import  {useState} from  'react';



 // 카운터 앱 만들고
 // 상태관리하기

function App() {

  const [counter, setCounter] = useState(0);
  const handlerBtn =  () =>{        
        setCounter( counter+1);
  };


  return (
    <div className="App">          
          <span>{counter}</span>
          <div className='btnLine'>  <button  onClick={handlerBtn}>  카운터  + </button></div>
          <div></div>
          <p> hello react</p>
    </div>
  );
}


export default App;

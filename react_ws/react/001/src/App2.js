 
import './App.css';
 


//일반변수를 사용하여 카운터 증가 하기 
//변수의 값이 변경된다고 화면을 다시 그리지 않는다.


function App2() {

   let counter=0;
  const handlerBtn =()=>{    
    counter++;
    console.log( counter);
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


export default App2;

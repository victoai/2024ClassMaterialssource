 
import './App.css';

function App() {


  const handlerBtn =  (e) =>{
        alert("클릭되었어");
  };
  return (
    <div className="App">
          day1
          <div className='btnLine'>  <button  onClick={handlerBtn}>  day1 </button></div>
          <p> hello react</p>
    </div>
  );
}

export default App;

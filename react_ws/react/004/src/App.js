 
import './App.css';
import Viewer  from './Viewer';
import Controller from './Controller';
import { useState } from 'react';
import Even from './Even';

function App() {
  const [ count, setCount] = useState(1);
  
  const onClickButton =(value)=>{
    setCount(count + value);
  }

  return (
    <div className="App">
      <h1> Simple Counter</h1>
      <section> 
      <Viewer count={count}/>
      {count %2 ===0 && <Even />}
      </section>
      <section>
      <Controller onClickButton={onClickButton}/>
      </section>       
    </div>
  );
}

export default App;

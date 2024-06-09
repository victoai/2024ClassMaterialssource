 
import './App.css';
import Header from './Header';
import Content  from './Content';
import { useState} from 'react';

function App() {


  const [first, setFirst] = useState("");

  const hanleSetContent  = (e) =>{

    setFirst( e.target.value);

  };

  return (
    <div className="App">

       <input value={first}  onChange={ hanleSetContent} />
      
      <Header />
      <Content />
    </div>
  );
}

export default App;

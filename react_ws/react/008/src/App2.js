import React, { createContext, useState } from 'react';
import './App.css';
import ChildComponent from './ChildComponent';

// 컨텍스트 생성
export const ArrayContext = createContext();

function App2() {


  const mylikes=[
    '커피' ,
    '산책' ,
    '책'
  ];
  const [likes, setLikes] = useState(mylikes);

  const addLike= (  newLike) => {    
    setLikes([...likes, newLike]);
  };

  return (
    <ArrayContext.Provider value={{ likes, addLike }}>
      <div className="App">
        <h1 >  my favorite  </h1>    
        <ChildComponent />
      </div>
    </ArrayContext.Provider>
  );
}

export default App2;

import React, { useContext, useState } from 'react';
import { ArrayContext } from './App2';

function ChildComponent() {
  const { likes, addLike } = useContext(ArrayContext);
 const [item, setItem]  = useState("");
  

  const onChangeItem  =(e) =>{
    setItem( e.target.value);

  }
  const addItem= () => {
    // 이전 상태를 이용하여 새로운 배열을 만들어야 합니다.
    addLike( item );
  };


  return (
    <div>
      <h2>Child Component</h2>
      <ul>
        {likes.map((like, index) => (
          <li key={index}>{like}</li>
        ))}
      </ul>

      <input value={item}  onChange={onChangeItem}></input>
      <button onClick={ addItem}>Add Number</button>
    </div>
  );
}

export default ChildComponent;

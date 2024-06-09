 
import './App.css';
 


//일반변수를 사용하여 카운터 증가 하기 
//변수의 값이 변경된다고 화면을 다시 그리지 않는다.

import  {useState} from "react";


function App3() {
  
  const [like, setLike] = useState(false); 
  let heart= (like)?'❤' :''; 

 
  const handleLike = () =>{     
    if( like){
      setLike(false);
    }else{
      setLike(true);
    }
  };
  
  
/*
  const handleLike = () =>{     
       setLike ( !like);
  };
  */  

  return (
    <div className="App">            
           <button  onClick={handleLike}>  like   </button> 
           <span>   {heart}</span>
           
    </div>
  );
}


export default App3;

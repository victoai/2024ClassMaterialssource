 
import './App.css';

import Header from './component/Header'; // Header 컴포넌트 import
import Content from './component/Content'; // Content 컴포넌트 import 
import Content2 from './component/Content2'; // Content 컴포넌트 import 
import Footer from './component/Footer'; // Footer 컴포넌트 import

function App() {

  const myInfo={
    name: "우주연",
    address: "공릉동",
    company: "acorn academy",
    tel : "010-3903-1028",
    email :  "victoai@naver.com",
    likes: [ '산책' , '커피' ,'책' , '사과' ]
  };


  return (
    <div className="App">
     <Header      />
     <Content  userInfo={myInfo}/>    
     <Content2  {...myInfo}/>   
     <Footer   />
    </div>
  );
}

export default App;

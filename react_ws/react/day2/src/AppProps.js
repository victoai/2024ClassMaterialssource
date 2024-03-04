 
import './App.css';

import Header from './component/Header'; // Header 컴포넌트 import 
import Body from './props/Body'; // Header 컴포넌트 import
import Footer from './component/Footer'; // Footer 컴포넌트 import

function AppProps() {
  const name="우주연";
  return (
    <div className="App">
     <Header/>
     <Body  name={name}  location={"공릉동"}/>
      
     <Footer />
    </div>
  );
}

export default AppProps;

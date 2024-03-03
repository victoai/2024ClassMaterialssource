 
import './App.css';

import Header from './component/Header'; // Header 컴포넌트 import
import Content from './component/Content'; // Content 컴포넌트 import
import Footer from './component/Footer'; // Footer 컴포넌트 import

function App() {
  return (
    <div className="App">
     <Header/>
     <Content/>
     <Footer />
    </div>
  );
}

export default App;

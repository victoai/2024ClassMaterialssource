 
import './App.css';

import Header from './component/Header'; // Header 컴포넌트 import
import Content from './component/Content'; // Content 컴포넌트 import
import Content2 from './component/Content2'; // Content 컴포넌트 import
import Content3 from './component/Content3'; // Content 컴포넌트 import
import Content4 from './component/Content4'; // Content 컴포넌트 import
import Footer from './component/Footer'; // Footer 컴포넌트 import

function App() {
  return (
    <div className="App">
     <Header/>
     <Content/>
     <Content2/>
     <Content3/>
     <Content4/>
     <Footer />
    </div>
  );
}

export default App;

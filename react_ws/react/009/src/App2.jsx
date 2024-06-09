import React from 'react';
import './App2.css';
import About from './About';
import Experience from './Experience'; 
import Education from './Education';
import Gallery from  "./Gallery";

function App2() {
  return (
    <div className="App">
      <About />
      <Experience />      
      <Education />
      <Gallery />
    </div>
  );
}

export default App2;

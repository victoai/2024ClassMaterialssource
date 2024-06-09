import React, { createContext, useState } from 'react';
import './App.css';
import ThemeComponent from './ThemeComponent';

// 컨텍스트 생성
export const ThemeContext = createContext();

function App() {
  const [theme, setTheme] = useState('light');

  const toggleTheme = () => {
    setTheme(theme === 'light' ? 'dark' : 'light');
  };

  return (
    <ThemeContext.Provider value={{ theme, toggleTheme }}>
      <div >
        <h1> {theme}</h1>
        <button onClick={toggleTheme}> 토글</button>
        <ThemeComponent />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;

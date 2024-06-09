import React, { useContext } from 'react';
import { ThemeContext } from './App';

function ThemeComponent() {
  const { theme, toggleTheme } = useContext(ThemeContext);

  return (
    <div>
      <h2>This is a themed component!  {theme}</h2>
      <button onClick={toggleTheme}>Toggle Theme</button>
    </div>
  );
}

export default ThemeComponent;

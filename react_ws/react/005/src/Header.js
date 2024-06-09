
import "./Header.css";

const Header = () =>{
  return(  <div class="Header">
        <h3>오늘은  😊</h3>
        <h1>{new Date().toDateString() }</h1> 
    </div>);
};

export default  Header;
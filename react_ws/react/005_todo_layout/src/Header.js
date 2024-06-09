
import "./Header.css";

const Header = () =>{
  return(  <div class="Header">
        <h3>오늘은  😊</h3>
        <h3>{new Date().toDateString() }</h3> 
    </div>);
};

export default  Header;
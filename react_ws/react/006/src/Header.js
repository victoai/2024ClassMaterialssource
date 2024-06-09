 
import React, { useEffect } from 'react';
function Header(){


       useEffect(() => {
              let btn = document.querySelector(".btn");
              let r = btn.innerHTML;
              alert(r);
            }, []);

    return (
     <div>
       <button className="btn">dfdfdf</button>
            Header !!!!! <br/> 
           잼나는 드라마 소개
    </div>
    );
 }
 
 export default Header;
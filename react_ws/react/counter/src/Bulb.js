import { useState } from "react";

const  Bulb  = () =>{

    const [ light, setLight] = useState("OFF");
    const handleLight=()=>{
/*
        if(light==="OFF")
           setLight("ON");   
        else
           setLight( "OFF");
  */
 
        setLight(   light==="ON"?"OFF":"ON");
    };

    return (
        <div className="Bulb">
            {light==="ON"?(<h1 style={{backgroundColor:"yellow"}}>ON</h1>):(<h1 style={{backgroundColor:"grey"}}>OFF</h1>)}

            <button onClick={handleLight}>스위치</button>
        </div>
    );


};


export default Bulb;
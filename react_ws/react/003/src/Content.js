
import {useState, useEffect} from 'react';


const Content = ()=>{ 
    const [content, setContent] = useState("");

    const handleSetCount = (e) =>{
         setContent ( e.target.value);
    };


    useEffect(() => { 
         console.log(" 마운트 및 업데이트");           
    } );
    

    return(
        <div>
            <input   value={ content}   onChange={handleSetCount}/>
        </div>
    );
}


export default Content;
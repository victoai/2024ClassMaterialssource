
import {useEffect} from 'react';

const Header = () =>{
    
    useEffect(() => {    
          console.log( " header 마운터");
    }, [ ]);
    


    return(
        <div>
            Header
        </div>
    );
}


export default  Header;
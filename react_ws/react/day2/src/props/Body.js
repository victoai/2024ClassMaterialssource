

/*

1.
 const Body = ( props)=>{

    return( <div  1. className="body"> {props.name}    {props.location} </div>);
}

export default Body;

*/


/*
const Body = ( props)=>{

    const {name, l } = props;
    return( <div className="body"> 2. {name}    {l} </div>);
}

export default Body;

*/
 

//매개변수 자리에 구조분해 할당 사용
const Body = ( {name, location})=>{    
    return( <div className="body"> 3. {name}    {location} </div>);
}

export default Body;
 


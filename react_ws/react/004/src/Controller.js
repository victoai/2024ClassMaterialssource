const Controller = ({onClickButton})=>{

    return(
        <div >           
            <button onClick={ ()=>{
                onClickButton(-1);
            }}>-1</button>
            <button onClick={ ()=>{
                onClickButton(1);
            }}>+1</button>
             
        </div>
    );
};


export default Controller;
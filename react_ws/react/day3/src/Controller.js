const Controller = ({onClickButton})=>{

    return(
        <div >           
            <button onClick={ ()=>{
                onClickButton(-1);
            }}>-1</button>
            <button onClick={ ()=>{
                onClickButton(10);
            }}>+10</button>
            <button>+</button>
            <button>+</button>
            <button>+</button>
            <button>+</button>
            <button>+</button>
            <button>+</button>

        </div>
    );
};


export default Controller;
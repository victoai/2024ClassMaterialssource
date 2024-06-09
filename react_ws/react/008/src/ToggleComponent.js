import {  useEffect } from "react";

function ToggleComponent() {
     

    useEffect(() => {
        console.log( " 보이나요 ?  마운트 되었음");
        return () => {
            console.log("보이나요 ? 언마운트 되었음");
        };
    }, []);

    return (
        <div>
            보이나요?           
        </div>
    );
}

export default ToggleComponent;

import React, { useState } from "react";
 
import ToggleComponent from "./ToggleComponent";

function App6() {
    const [showApp, setShowApp] = useState(true);

    const toggleApp = () => {    
       setShowApp(     !showApp  );
    };

    return (
        <div>
            <button onClick={toggleApp}>
                {showApp? "Hide" : "Show "}
            </button>
            {showApp && <ToggleComponent />}
        </div>
    );
}


export default App6;

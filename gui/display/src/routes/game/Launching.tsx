import {CenterContainer, Gif} from "../../shared/SharedStyles";
import React from "react";

const Launching = () => {
    return (
        <CenterContainer>
            <Gif src="/launch.gif" alt="Launch GIF" style={{
                width: "50%",
                height: "50%",
                objectFit: "contain",
            }} data-testid="launching-gif"/>
        </CenterContainer>
    );
}

export default Launching;
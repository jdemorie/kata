import {Container, Gif, InputColumnContainer} from "../../shared/SharedStyles";
import React from "react";

const Launching = () => {
    return (
        <Container>
            <Gif src="/pins.jpg" alt="Bowling GIF"/>
            <InputColumnContainer>
                <Gif src="/strike.jpg" alt="Launch GIF" style={{
                    width: "50%",
                    height: "50%",
                    objectFit: "contain",
                    display: "block",
                    margin: "auto"
                }} data-testid="launching-gif"/>
                <label style={{
                    color: "white",
                    marginLeft: "10px",
                    display: "block",
                    margin: "auto"
                }}>
                    Launching ball...
                </label>
            </InputColumnContainer>
        </Container>
    );
}

export default Launching;
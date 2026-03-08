import {Container, Gif, GifLaunching, InputColumnContainer, StyledLabel} from "../../shared/SharedStyles";
import React from "react";

const Launching = () => {
    return (
        <Container animate={{
            scale: 1,
            transition: {duration: 2}
        }}>
            <Gif src="/pins.jpg" alt="Bowling GIF"/>
            <InputColumnContainer animate={{
                scale: 1,
                transition: {duration: 2}
            }}>
                <GifLaunching src="/strike.jpg" alt="Launch GIF" initial={{scale: 0}} animate={{
                    scale: 1,
                    transition: {duration: 1}
                }} data-testid="launching-gif"/>
                <StyledLabel initial={{scale: 0}} animate={{
                    scale: 1,
                    transition: {duration: 1}
                }}>
                    Launching ball...
                </StyledLabel>
            </InputColumnContainer>
        </Container>
    );
}

export default Launching;
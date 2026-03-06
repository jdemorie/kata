import Grid from "../../shared/Grid";
import React from "react";
import {ButtonStyle, Container, Gif, InputColumnContainer} from "../../shared/SharedStyles";
import {useName} from "../../store/playerSlice";

const GamePage = () => {
    const name = useName();
    const headers = ["Name", "Turn 1", "Turn 2", "Turn 3", "Turn 4", "Turn 5", "Turn 6", "Turn 7", "Turn 8", "Turn 9", "Turn 10", "Score"];
    const data = [
        {
            Name: `${name}`,
            "Turn 1": "0 | 0",
            "Turn 2": "0 | 0",
            "Turn 3": "0 | 0",
            "Turn 4": "0 | 0",
            "Turn 5": "0 | 0",
            "Turn 6": "0 | 0",
            "Turn 7": "0 | 0",
            "Turn 8": "0 | 0",
            "Turn 9": "0 | 0",
            "Turn 10": "0 | 0",
            "Score": "0",
        },
    ];

    function throwBall() {
    }

    return (
        <Container>
            <Gif src="/bowling-area.jpg" alt="Bowling GIF"/>
            <InputColumnContainer>
                <h2 style={{color: "white"}}>Bowling score</h2>
                <Grid headers={headers} data={data}/>
                <ButtonStyle onClick={throwBall}>
                    Throw Ball
                </ButtonStyle>
            </InputColumnContainer>
        </Container>
    );
}

export default GamePage;
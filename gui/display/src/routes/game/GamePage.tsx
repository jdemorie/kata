import React, {useMemo, useState} from "react";
import {ButtonStyle, Container, Gif, InputColumnContainer} from "../../shared/SharedStyles";
import {useName} from "../../store/playerSlice";
import useColumnDefs from "./useColumnDefs";
import Launching from "./Launching";
import Grid from "../../shared/Grid";

const GamePage = () => {
    const name = useName();
    const headers = useColumnDefs();
    const [isLaunching, setIsLaunching] = useState(false);
    const data = useMemo(() => {
        return [
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
        ]
    }, [name]);

    function throwBall() {
        setIsLaunching(true);
        setTimeout(() => {
            setIsLaunching(false);
        }, 2500);
    }

    return (
        <div>
            {isLaunching ? (
                <Launching/>
            ) : (
                <Container>
                    <Gif src="/strike.jpg" alt="Bowling GIF"/>
                    <InputColumnContainer>
                        <h2 style={{color: "white"}}>Bowling score</h2>
                        <Grid headers={headers} data={data}/>
                        <ButtonStyle onClick={throwBall}>
                            Throw Ball
                        </ButtonStyle>
                    </InputColumnContainer>
                </Container>
            )}
        </div>
    );
}

export default GamePage;
import React, {useEffect, useMemo, useState} from "react";
import {ButtonStyle, Container, Gif, InputColumnContainer} from "../../shared/SharedStyles";
import {useName} from "../../store/playerSlice";
import useColumnDefs from "./useColumnDefs";
import Launching from "./Launching";
import Grid from "../../shared/Grid";
import {useGetScoreQuery} from "../../openapi/enhancedApi";
import AwaitQuery from "../../shared/AwaitQuery";
import {usePlayGame} from "./usePlayGame";

const GamePage = () => {
    const name = useName();
    const headers = useColumnDefs();
    const [isLaunching, setIsLaunching] = useState(false);
    const query = useGetScoreQuery();
    const {playGame, isPlaySuccess, isPlayStart} = usePlayGame();
    const data: Array<Record<string, string>> | undefined = useMemo(() => {
        return query.data?.map(scoreBean => {
            return {
                Name: scoreBean.name,
                "Turn 1": "",
                "Turn 2": "",
                "Turn 3": "",
                "Turn 4": "",
                "Turn 5": "",
                "Turn 6": "",
                "Turn 7": "",
                "Turn 8": "",
                "Turn 9": "",
                "Turn 10": "",
                Score: scoreBean.score.toString(),
            }
        });
    }, [query]);

    function throwBall() {
        playGame(name);
    }

    useEffect(() => {
        if (isPlayStart) {
            setIsLaunching(true);
        }
        if (isPlaySuccess) {
            setIsLaunching(false);
        }
    }, [isPlaySuccess, isPlayStart]);

    return (
        <AwaitQuery query={query}>
            <div>
                {isLaunching ? (
                    <Launching/>
                ) : (
                    <Container>
                        <Gif src="/strike.jpg" alt="Bowling GIF"/>
                        <InputColumnContainer>
                            <h2 style={{color: "white"}}>Bowling score</h2>
                            <Grid headers={headers} data={data} testId="grid"/>
                            <ButtonStyle onClick={throwBall}>
                                Throw Ball
                            </ButtonStyle>
                        </InputColumnContainer>
                    </Container>
                )}
            </div>
        </AwaitQuery>
    );
}

export default GamePage;
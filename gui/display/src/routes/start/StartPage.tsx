import React, {FC, useCallback, useEffect, useRef} from "react";
import {ButtonStyle, Container, Gif, InputRowContainer} from "../../shared/SharedStyles";
import {useNavigate} from "react-router";
import {useName, useSetName} from "../../store/playerSlice";

const StartPage: FC = () => {
    const name = useName();
    const setName = useSetName();
    const navigate = useNavigate();
    const inputRef = useRef<HTMLInputElement>(null);

    const navigateStartGame = useCallback(() => {
        navigate("/game");
    }, [navigate]);

    const handleNameChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        setName(e.target.value);
    };

    const handleKeyDown = (e: React.KeyboardEvent<HTMLInputElement>) => {
        if (e.key === "Enter") {
            navigateStartGame();
        }
    };

    useEffect(() => {
        if (inputRef.current) {
            inputRef.current.focus();
        }
    }, []);

    return (
        <Container>
            <Gif src="/bowling.webp" alt="Bowling GIF"/>
            <InputRowContainer>
                <input
                    ref={inputRef}
                    type="text"
                    value={name}
                    onChange={handleNameChange}
                    onKeyDown={handleKeyDown}
                    placeholder="Enter your name"
                    style={{padding: '10px', width: '400px', fontSize: '16px'}}
                />
                <ButtonStyle onClick={navigateStartGame}>
                    Start New Game
                </ButtonStyle>
            </InputRowContainer>

        </Container>
    )
}

export default StartPage;
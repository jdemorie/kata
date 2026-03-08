import React, {FC, useCallback, useEffect, useRef} from "react";
import {Container, Gif, InputRowContainer, StyledButton} from "../../shared/SharedStyles";
import {useNavigate} from "react-router";
import {useName, useSetName} from "../../store/playerSlice";
import {useStartGame} from "./useStartGame";

const StartPage: FC = () => {
    const name = useName();
    const setName = useSetName();
    const navigate = useNavigate();
    const inputRef = useRef<HTMLInputElement>(null);
    const {startGame, isStartSuccess} = useStartGame();

    const navigateStartGame = useCallback(() => {
        navigate("/game");
    }, [navigate]);

    const handleNameChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        setName(e.target.value);
    };

    const handleKeyDown = (e: React.KeyboardEvent<HTMLInputElement>) => {
        if (e.key === "Enter") {
            startGame(name);
        }
    };

    function onStartGame() {
        startGame(name);
    }

    useEffect(() => {
        if (inputRef.current) {
            inputRef.current.focus();
        }
        if (isStartSuccess) {
            navigateStartGame();
        }
    }, [isStartSuccess]);

    return (
        <Container animate={{
            scale: 1,
            transition: {duration: 2}
        }}>
            <Gif src="/bowling.jpg" alt="Bowling GIF"/>
            <InputRowContainer animate={{
                scale: 1,
                transition: {duration: 2}
            }}>
                <input
                    ref={inputRef}
                    type="text"
                    value={name}
                    onChange={handleNameChange}
                    onKeyDown={handleKeyDown}
                    placeholder="Enter your name"
                    style={{padding: '10px', width: '400px', fontSize: '16px'}}
                />
                <StyledButton initial={{scale: 0}} animate={{scale: 1, transition: {duration: 1}}} onClick={onStartGame}>
                    Start New Game
                </StyledButton>
            </InputRowContainer>

        </Container>
    )
}

export default StartPage;
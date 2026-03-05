import styled from "styled-components";

export const CenterContainer = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
`;

export const Container = styled.div`
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    padding: 2rem;
    gap: 1rem;
`;

export const ButtonStyle = styled.button`
    font-size: 16px;
    cursor: pointer;
`;

export const BowlingStyle = styled.div`
    background-image: url('/bowling.webp');
    background-size: cover;
    background-position: center;
    display: flex;
    justify-content: center;
    align-items: center;
`;

export const BowlingAreaStyle = styled.div`
    background-image: url('/bowling-area.jpg');
    background-size: cover;
    background-position: center;
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    padding: 2rem;
    gap: 1rem;
    height: 100vh;
`;
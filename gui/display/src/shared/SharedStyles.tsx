import styled from "styled-components";

export const CenterContainer = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
`;

export const Container = styled.div`
    position: relative;
    height: 100vh;
    width: 100vw;
    display: flex;
    justify-content: center;
    align-items: center;
`;

export const InputRowContainer = styled.div`
    position: absolute;
    z-index: 2;
    display: flex;
    flex-direction: row;
    align-items: flex-start;
    gap: 1rem;
`;

export const InputColumnContainer = styled.div`
    position: absolute;
    z-index: 2;
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    gap: 1rem;
`;

export const Gif = styled.img`
    height: 100%;
    width: 100%;
`;

export const ButtonStyle = styled.button`
    font-size: 16px;
    cursor: pointer;
    padding: 10px 20px;
`;

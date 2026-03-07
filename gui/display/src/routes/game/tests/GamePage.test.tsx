import React from "react";
import {render, screen, within} from "@testing-library/react";
import {MemoryRouter} from "react-router";
import {Provider} from "react-redux";
import {bowlingStore} from "../../../store/bowlingStore";
import GamePage from "../GamePage";
import {useGetScoreQuery} from "../../../openapi/enhancedApi";
import {ScoreBean} from "../../../openapi/api";

// Mock du module
jest.mock("../../../openapi/enhancedApi", () => ({
    ...jest.requireActual("../../../openapi/enhancedApi"),
    useGetScoreQuery: jest.fn(),
    usePlayMutation: jest.fn().mockReturnValue([jest.fn()]),
    useStartMutation: jest.fn().mockReturnValue([jest.fn()]),
}));

describe("GamePage Component", () => {
    it("renders bowling game page", async () => {
        mockGetScore([
            {name: "Player 1", score: 100},
            {name: "Player 2", score: 150},
        ]);
        render(
            <Provider store={bowlingStore}>
                <MemoryRouter>
                    <GamePage/>
                </MemoryRouter>
            </Provider>
        );
        const element = screen.getByText("Bowling score");
        expect(element).toBeInTheDocument();
        const scoreGrid = await screen.findByTestId("grid");
        expect(scoreGrid).toBeInTheDocument();
        expect(within(scoreGrid).getByText("Player 1")).toBeInTheDocument();
        expect(within(scoreGrid).getByText("Player 2")).toBeInTheDocument();
    });
});

function mockGetScore(data: ScoreBean[]) {
    (useGetScoreQuery as jest.Mock).mockReturnValue({
        data: data,
        isLoading: false,
        isError: false,
    });
}

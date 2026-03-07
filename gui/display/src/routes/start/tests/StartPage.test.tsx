import React from "react";
import {render, screen} from "@testing-library/react";
import StartPage from "../StartPage";
import {MemoryRouter} from "react-router";
import {Provider} from "react-redux";
import {bowlingStore} from "../../../store/bowlingStore";

describe("StartPage Component", () => {
    it("renders bowling start page", async () => {
        render(
            <Provider store={bowlingStore}>
                <MemoryRouter>
                    <StartPage/>
                </MemoryRouter>
            </Provider>
        );
        const element = screen.getByText("Start New Game");
        expect(element).toBeInTheDocument();
    });
});

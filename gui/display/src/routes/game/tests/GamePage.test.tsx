import React from "react";
import {render} from "@testing-library/react";
import {MemoryRouter} from "react-router";
import {Provider} from "react-redux";
import {bowlingStore} from "../../../store/bowlingStore";
import GamePage from "../GamePage";

describe("GamePage Component", () => {
    it("renders bowling game page", async () => {
        render(
            <Provider store={bowlingStore}>
                <MemoryRouter>
                    <GamePage/>
                </MemoryRouter>
            </Provider>
        );
    });
});
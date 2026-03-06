import React from "react";
import {render} from "@testing-library/react";
import StartPage from "../StartPage";
import {MemoryRouter} from "react-router";
import {Provider} from "react-redux";
import {bowlingStore} from "../../../store/bowlingStore";

describe("StartPage Component", () => {
    it("renders input and button", async () => {
        render(
            <MemoryRouter>
                <Provider store={bowlingStore}>
                    <StartPage/>
                </Provider>
            </MemoryRouter>
        );
    });
});

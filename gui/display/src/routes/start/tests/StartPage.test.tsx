import React from "react";
import {render} from "@testing-library/react";
import StartPage from "../StartPage";
import {MemoryRouter} from "react-router";

describe("StartPage Component", () => {
    it("renders input and button", async () => {
        render(
            <MemoryRouter>
                <StartPage/>
            </MemoryRouter>
        );
    });
});

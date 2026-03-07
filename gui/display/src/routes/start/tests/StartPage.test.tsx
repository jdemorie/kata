import React from "react";
import {render} from "@testing-library/react";
import StartPage from "../StartPage";
import {MemoryRouter} from "react-router";
import {Provider} from "react-redux";
import {bowlingStore} from "../../../store/bowlingStore";
// import {setupServer} from 'msw/node';
// import {delay, http, HttpResponse} from 'msw'
//
// export const handlers = [
//     http.get('/server/score', async () => {
//         await delay(150)
//         return HttpResponse.json('0')
//     })
// ]
//
// const server = setupServer(...handlers)
//
// beforeAll(() => server.listen())
//
// afterEach(() => server.resetHandlers())
//
// afterAll(() => server.close())

describe("StartPage Component", () => {
    it("renders bowling start page", async () => {
        render(
            <Provider store={bowlingStore}>
                <MemoryRouter>
                    <StartPage/>
                </MemoryRouter>
            </Provider>
        );
    });
});

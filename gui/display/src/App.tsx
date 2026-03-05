import React from 'react';
import {createBrowserRouter, Navigate, Outlet, RouterProvider} from "react-router";
import StartPage from "./routes/start/StartPage";
import ErrorElement from "./shared/ErrorElement";
import GamePage from "./routes/game/GamePage";

const router = createBrowserRouter([
    {
        path: '/',
        element: <div><Outlet/></div>,
        children: [
            {
                index: true,
                element: <Navigate to="/start" replace={true}/>,
            },
            {
                path: 'start',
                element: <StartPage/>,
                errorElement: <ErrorElement/>,
                loader: () => {
                }
            },
            {
                path: 'game',
                element: <GamePage/>,
                errorElement: <ErrorElement/>,
                loader: () => {
                }
            }
        ]
    },
]);

function App() {
    return (
        <div className="App">
            <RouterProvider router={router}/>
        </div>
    );
}

export default App;

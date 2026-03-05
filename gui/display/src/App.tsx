import React from 'react';
import {createBrowserRouter, Navigate, Outlet, RouterProvider} from "react-router";
import StartPage from "./routes/start/StartPage";
import ErrorElement from "./shared/ErrorElement";

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

import {usePlayMutation} from "../../openapi/enhancedApi";
import {useCallback, useState} from "react";

export const usePlayGame = () => {
    const [play] = usePlayMutation();
    const [isPlayStart, setPlayStart] = useState(false);
    const [isPlaySuccess, setPlaySuccess] = useState(false);

    const playGame = useCallback((name: string) => {
            setPlayStart(true);
            play({
                playerBean: {
                    name: name,
                },
            })
                .unwrap()
                .then(
                    (_) => {
                        setPlaySuccess(true);
                    },
                    (reason) => {
                        setPlaySuccess(false);
                    },
                )
                .finally(() => {
                    setPlayStart(false);
                });
        },
        [play],
    );
    return {playGame, isPlaySuccess, isPlayStart};
};
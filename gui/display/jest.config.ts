// jest.config.ts

module.exports = {
    preset: "ts-jest",
    testEnvironment: "jsdom",
    transform: {
        "\\.[t]sx?$": ['ts-jest'],
    },
    setupFilesAfterEnv: ["<rootDir>/src/setupTests.ts"],
};

export default {
    exports
}
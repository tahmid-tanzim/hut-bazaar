import express, { Express } from "express";
import router from "./routes";

const app: Express = express();

// for parsing application/json
app.use(express.json());

// for parsing application/x-www-form-urlencoded
app.use(express.urlencoded({ extended: true }));

// Register Main Router
app.use("/api", router);

export default app;
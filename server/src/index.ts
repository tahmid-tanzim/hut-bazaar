import dotenv from "dotenv";
import { connect } from "mongoose";
import app from "./app";

dotenv.config();

const PORT: Number = Number(process.env.PORT);
const URI: string = String(process.env.MONGODB_CONNSTRING);
const main = async () => {
    try {
        await connect(URI); 
        console.log("[MongoDB]: Database Connected.");
        app.listen(PORT, () => {
            console.log(`[Node]: Server is running at https://localhost:${PORT}`);
        });
    } catch (error) {
        console.error(error);
        process.exit(1);
    }
};

main();
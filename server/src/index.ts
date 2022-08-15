import dotenv from "dotenv";
import app from "./app";

dotenv.config();

const PORT: Number = Number(process.env.PORT);

app.listen(PORT, () => {
  console.log(`[server]: Server is running at https://localhost:${PORT}`);
});
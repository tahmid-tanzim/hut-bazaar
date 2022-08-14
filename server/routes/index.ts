import express, { Router, Request, Response } from "express";
import httpStatusCodes from "../helpers/http-status-codes";

const router: Router = express.Router();

router.get('/api', (req: Request, res: Response) => {
    return res.send({message: 'Express & TypeScript Server!'});
});

router.all("*", async (req: Request, res: Response, next) => {
    return res.status(httpStatusCodes.NOT_FOUND).send({ message: "404 Not Found" });
});

export default router;
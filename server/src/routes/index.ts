import express, { Router, Request, Response } from "express";
import httpStatusCodes from "../helpers/http-status-codes";

const router: Router = express.Router();

router.get('/api/category', (req: Request, res: Response) => {
    return res.send({
        data: [
            {
                id: 1,
                text: 'Food'
            },
            {
                id: 2,
                text: 'Baby Care'
            },
            {
                id: 3,
                text: 'Home & Kitchen'
            }
        ]
    }).status(httpStatusCodes.OK);
});

router.all("*", async (req: Request, res: Response, next) => {
    return res.status(httpStatusCodes.NOT_FOUND).send({ message: "404 Not Found" });
});

export default router;
import express, { Router, Request, Response, NextFunction } from "express";
import httpStatusCodes from "../utils/http-status-codes";

const router: Router = express.Router();

router.get('/api/category', (req: Request, res: Response, next: NextFunction): void => {
    res.send({
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

router.all("*", (req: Request, res: Response, next: NextFunction): void => {
    res.status(httpStatusCodes.NOT_FOUND).send({ message: "404 Not Found" });
});

export default router;
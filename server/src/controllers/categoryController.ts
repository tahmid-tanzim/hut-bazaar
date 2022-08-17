import { Request, Response, NextFunction } from "express";
import httpStatusCodes from "../utils/http-status-codes";

import { run_mongo } from "../model/category";

function resolveAfterSeconds(ms: any) {
    return new Promise(resolve => {
        setTimeout(() => {
            resolve(`resolved after ${ms} millisec`);
        }, ms);
    });
}

class CategoryController {
    public constructor() { }

    // Display list of all categories.
    public async category_list(req: Request, res: Response, next: NextFunction) {
        console.log('GET category_list');
        const result = await resolveAfterSeconds(1500);
        res.status(httpStatusCodes.OK).json({
            result,
            data: [
                {
                    id: 1,
                    text: 'Food 1'
                },
                {
                    id: 2,
                    text: 'Baby Care 1'
                },
                {
                    id: 3,
                    text: 'Home & Kitchen 1'
                }
            ]
        });
    }


    public async category_create_post(req: Request, res: Response, next: NextFunction) {
        console.log('POST category_create_post');
        const result = await resolveAfterSeconds(2000);
        res.status(httpStatusCodes.CREATED).json({
            result,
            body: req.body,
        });
    }

    // Display list of all subcategories.
    public subcategory_list(req: Request, res: Response, next: NextFunction) {
        console.log('GET subcategory_list');
        run_mongo().catch(err => console.log(err));
        res.status(httpStatusCodes.OK).json({
            data: [
                {
                    id: 1,
                    text: 'Burger'
                },
                {
                    id: 2,
                    text: 'Pizza'
                }
            ]
        });
    }
};

export default new CategoryController();
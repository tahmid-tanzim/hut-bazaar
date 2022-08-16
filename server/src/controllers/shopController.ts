import { Request, Response, NextFunction } from "express";
import httpStatusCodes from "../utils/http-status-codes";

function resolveAfter2Seconds() {
    return new Promise(resolve => {
        setTimeout(() => {
            resolve('resolved after 2 sec');
        }, 2000);
    });
}

class ShopController {
    public constructor() { }

    // Display list of all categories.
    public async category_list(req: Request, res: Response, next: NextFunction) {
        console.log('GET SHOP category_list');
        const result = await resolveAfter2Seconds();
        res.send({
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
        }).status(httpStatusCodes.OK);
    }

    // Display list of all subcategories.
    public subcategory_list(req: Request, res: Response, next: NextFunction) {
        console.log('GET SHOP subcategory_list');
        res.send({
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
        }).status(httpStatusCodes.OK);
    }
};

export default new ShopController();
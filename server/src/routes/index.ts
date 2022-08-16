import express, { Router, Request, Response, NextFunction } from "express";
import httpStatusCodes from "../utils/http-status-codes";

import category_controller from "../controllers/categoryController";
import shop_controller from "../controllers/shopController";

const router: Router = express.Router();

router.get('/api/category', category_controller.category_list);
router.post('/api/category', category_controller.category_create_post);
router.get('/api/subcategory', category_controller.subcategory_list);
router.get('/api/shop', shop_controller.category_list);

router.all("*", (req: Request, res: Response, next: NextFunction): void => {
    res.status(httpStatusCodes.NOT_FOUND).end();
});

export default router;
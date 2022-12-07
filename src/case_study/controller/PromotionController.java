package case_study.controller;

import case_study.model.Promotion;
import case_study.service.IPromotion;
import case_study.service.Impl.PromotionServiceImpl;

public class PromotionController {
    IPromotion iPromotion = new PromotionServiceImpl();

    public void displayUser(Promotion promotion) {
        this.iPromotion.displayPerson(promotion);
    }

    public void displayGetVoucher(Promotion promotion) {
        this.iPromotion.displayVoucher(promotion);
    }
}

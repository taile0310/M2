package CaseStudy.controller;

import CaseStudy.model.Promotion;
import CaseStudy.service.IPromotion;
import CaseStudy.service.Impl.PromotionServiceImpl;

public class PromotionController {
    IPromotion iPromotion = new PromotionServiceImpl();

    public void displayUser(Promotion promotion) {
        this.iPromotion.displayPerson(promotion);
    }

    public void displayGetVoucher(Promotion promotion) {
        this.iPromotion.displayVoucher(promotion);
    }
}

package CaseStudy.controller;

import CaseStudy.model.Villa;
import CaseStudy.service.IVilla;
import CaseStudy.service.VillaIServiceImpl;

public class VillaController {
    IVilla iVilla = new VillaIServiceImpl();

    public void displayVilla(Villa villa) {
        this.iVilla.display(villa);
    }

    public void addVilla(Villa villa) {
        this.iVilla.add(villa);
    }

    public void deleteVilla(Villa villa) {
        this.iVilla.delete(villa);
    }

    public void editVilla(Villa villa) {
        this.iVilla.edit(villa);
    }

}

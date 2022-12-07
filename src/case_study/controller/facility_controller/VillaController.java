package case_study.controller.facility_controller;

import case_study.model.facility.Villa;
import case_study.service.IVilla;
import case_study.service.Impl.VillaIServiceImpl;

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

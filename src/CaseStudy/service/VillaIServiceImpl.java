package CaseStudy.service;

import CaseStudy.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class VillaIServiceImpl implements IVilla {
    private static final List<Villa> villaList = new ArrayList<>();

    @Override
    public void display(Villa villa) {
        for (Villa vil : villaList) {
            System.out.println(vil);
        }

    }

    @Override
    public void add(Villa villa) {
        villaList.add(villa);

    }

    @Override
    public void delete(Villa villa) {
        Villa deleteVilla = null;
        for (Villa vil : villaList) {
            if (vil.getNumOfFloors() == villa.getNumOfFloors()) {
                deleteVilla = vil;
                break;
            }
        }
        if (deleteVilla == null) {
            villaList.remove(deleteVilla);
        }
    }

    @Override
    public void edit(Villa villa) {
        for (Villa vil : villaList) {
            vil.setPoolArea(villa.getPoolArea());
            vil.setRoomStandard(villa.getRoomStandard());
            vil.setNumOfFloors(villa.getNumOfFloors());
            break;
        }
    }
}

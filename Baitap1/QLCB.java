package Baitap1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {
    private List<CanBo> canBo;

    public QLCB() {
        canBo = new ArrayList<>();
    }
    public void addCanBo(CanBo canBo) {
        this.canBo.add(canBo);
    }
    public List<CanBo> getCanBo() {
        return canBo;
    }
    public void setCanBo(List<CanBo> canBo) {
        this.canBo = canBo;
    }
    public List<CanBo> searchOfficerByName(String name) {
        return this.canBo.stream().filter(o -> o.getHoTen().contains(o.getHoTen())).collect(Collectors.toList());
    }

    public void showListInforOfficer() {
        this.canBo.forEach(o -> System.out.println(o.toString()));
    }
}

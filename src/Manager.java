import java.util.ArrayList;
import java.util.List;

public class Manager {
    public void addStaff(List<CBGV> cbgvList, CBGV cbgv) {
        cbgvList.add(cbgv);
    }

    public double ReceiveMoney(CBGV cbgv) {
        return cbgv.getReceiveMoney();
    }
    public List<CBGV> showStaffWithSalaryOver8m(List<CBGV> cbgvList){
        List<CBGV> tempList = new ArrayList<>();
        for (CBGV c: cbgvList){
            if (c.getReceiveMoney()>=8.0){
                tempList.add(c);
            }
        }
        if (tempList.isEmpty()){
            return null;
        } else {
            return tempList;
        }
    }
}

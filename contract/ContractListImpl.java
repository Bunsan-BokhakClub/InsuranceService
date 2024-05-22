package contract;

import java.util.ArrayList;

public class ContractListImpl implements ContractList {

    public ArrayList<Contract> contractList;
    public Contract contract;

    public ContractListImpl(ArrayList<Contract> contractList) {
        this.contractList = contractList;
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void get() {

    }
    public Contract getContractByID(int id) {
        for (Contract contract : contractList) {
            if (contract.getContractID() == id) {
                return contract;
            }
        }
        return null;
    }

    @Override
    public void update() {

    }
}

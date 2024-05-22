package insurance;

import java.util.ArrayList;

public class InsuranceListImpl implements InsuranceList {

    private ArrayList<Insurance> insuranceList;
    public Insurance m_Insurance;

    public InsuranceListImpl(ArrayList<Insurance> insuranceList){
        this.insuranceList = insuranceList;
    }


    public void add(){

    }

    public void delete(){

    }

    public Insurance getInsuranceByID(String id){
        for (Insurance insurance : insuranceList) {
            if(insurance.getInsuranceID().equals(id)){
                return insurance;
            }
        }
        return null;
    }

    public ArrayList<Insurance> get(){
        return insuranceList;
    }

    public void update(){

    }

}
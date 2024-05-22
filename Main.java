import compensation.CompensationClaim;
import compensation.CompensationClaimListImpl;
import compensation.Survey;
import complaint.Complaint;
import complaint.ComplaintListImpl;
import contract.Contract;
import contract.ContractListImpl;
import employee.Employee;
import employee.EmployeeListImpl;
import employee.sellingRecord.SellingRecord;
import insurance.Insurance;
import insurance.InsuranceListImpl;
import partner.Partner;
import partner.PartnerListImpl;
import payment.PaymentListImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static InsuranceListImpl insuranceListImpl;
    private static ComplaintListImpl complaintListImpl;
    private static PartnerListImpl partnerListImpl;
    private static CompensationClaimListImpl compensationClaimListImpl;
    private static ContractListImpl contractListImpl;
    private static EmployeeListImpl employeeListImpl;

    public static void main(String[] args) throws IOException {
        ArrayList<Insurance> insuranceList = new ArrayList<>();
        insuranceListImpl = new InsuranceListImpl(insuranceList);
        ArrayList<Complaint> complaintList = new ArrayList<>();
        complaintListImpl = new ComplaintListImpl(complaintList);
        ArrayList<Partner> partnerList = new ArrayList<>();
        partnerListImpl = new PartnerListImpl(partnerList);
        ArrayList<CompensationClaim> compensationClaimList = new ArrayList<>();
        compensationClaimListImpl = new CompensationClaimListImpl(compensationClaimList);
        ArrayList<Contract> contractList = new ArrayList<>();
        contractListImpl = new ContractListImpl(contractList);
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeListImpl = new EmployeeListImpl(employeeList);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userChoice = "";
        while (!userChoice.equals("x")) {
            showMenu();
            userChoice = br.readLine().trim();
            switch (userChoice) {
                case "1":
                    claimInsurance();
                    break;
                case "2":
                    queryInsurance();
                    break;
                case "3":
                    checkMyInsurance();
                    break;
                case "4":
                    fileComplaint();
                    break;
                case "5":
                    payInsurance();
                    break;
                case "6":
                    queryPartnerCompanies();
                    break;
                case "7":
                    assessDamage();
                    break;
                case "8":
                    registerInsurance();
                    break;
                case "9":
                    modifyInsurance();
                    break;
                case "10":
                    queryCustomerInfo();
                    break;
                case "11":
                    queryEmployeeInfo();
                    break;
                case "12":
                    queryContractInfo();
                    break;
                case "13":
                    queryInsuranceApplication();
                    break;
                case "x":
                    break;
                default:
                    if (!userChoice.equals("x")) {
                        System.out.println("Invalid choice. Please try again.");
                    }
            }
        }
    }

    public static void showMenu() {
        System.out.println("1. 보험금 청구");
        System.out.println("2. 보험 조회");
        System.out.println("3. 내 보험 확인");
        System.out.println("4. 민원 접수");
        System.out.println("5. 보험금 납부");
        System.out.println("6. 협력 업체 조회");
        System.out.println("7. 손해 사정 한다");
        System.out.println("8. 보험 등록한다");
        System.out.println("9. 보험 수정한다");
        System.out.println("10. 고객 정보 조회");
        System.out.println("11. 직원 정보 조회");
        System.out.println("12. 계약 정보 조회");
        System.out.println("13. 보험 가입 신청 내역 조회");
    }

    public static void claimInsurance() {
        System.out.println("보험금 청구를 처리합니다.");
    }

    public static void queryInsurance() throws IOException {
        System.out.println("보험 조회를 처리합니다.");
        ArrayList<Insurance> insuranceList = insuranceListImpl.get();
        for (Insurance insurance : insuranceList) {
            System.out.println(insurance.getInsuranceID() + insurance.getInsuranceName() + insurance.getPaymentAmount() + insurance.getCompensationAmount());
        }
        System.out.println("조회를 원하는 보험 ID를 입력해주세요 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userChoice = br.readLine().trim();
        Insurance seletedInsurance = insuranceListImpl.getInsuranceByID(userChoice);
        if (seletedInsurance != null) {
            System.out.println(seletedInsurance.getInsuranceID() + " / " + seletedInsurance.getInsuranceName()
                    + " / " + seletedInsurance.getPaymentAmount() + " / " + seletedInsurance.getCompensationAmount()
                    + " / " + seletedInsurance.getCycleType() + " / " + seletedInsurance.getPaymentCycle()
                    + " / " + seletedInsurance.getInsurancePeriod());
            System.out.println("메인 화면으로 돌아가려면 x를, 보험을 신청하시려면 보험 ID를 입력해주세요: ");
            userChoice = br.readLine().trim();
            if (!userChoice.equals("x")){
                seletedInsurance = insuranceListImpl.getInsuranceByID(userChoice);
                if (seletedInsurance != null){
                    System.out.println("이름을 입력하세요: ");String userInput = br.readLine().trim();
                    while(userInput.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");userInput = br.readLine().trim();}
                    System.out.println("성별을 입력하세요: ");userInput = br.readLine().trim();
                    while(userInput.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");userInput = br.readLine().trim();}
                    System.out.println("생년월일을 입력하세요: ");userInput = br.readLine().trim();
                    while(userInput.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");userInput = br.readLine().trim();}
                    System.out.println("전화번호를 입력하세요: ");userInput = br.readLine().trim();
                    while(userInput.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");userInput = br.readLine().trim();}
                    System.out.println("주소을 입력하세요: ");userInput = br.readLine().trim();
                    while(userInput.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");userInput = br.readLine().trim();}
                    System.out.println("직업을 입력하세요: ");userInput = br.readLine().trim();
                    while(userInput.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");userInput = br.readLine().trim();}
                    System.out.println("가족력을 입력하세요: ");userInput = br.readLine().trim();
                    while(userInput.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");userInput = br.readLine().trim();}
                    System.out.println("신청이 완료되었습니다.");
                } else {
                    System.out.println("입력하신 보험은 존재하지 않습니다.");
                }
            }
        } else {
            System.out.println("입력하신 보험은 존재하지 않습니다.");
        }
    }

    public static void checkMyInsurance() {
        System.out.println("내 보험 확인을 처리합니다.");
    }

    public static void fileComplaint() throws IOException {
        System.out.println("민원 접수를 처리합니다.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("이름을 입력하세요: ");String userName = br.readLine().trim();
        while(userName.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");userName = br.readLine().trim();}
        System.out.println("민원 내용을 입력하세요: ");String content = br.readLine().trim();
        while(content.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");content = br.readLine().trim();}
        Complaint complaint = new Complaint(userName, content);
        complaintListImpl.add(complaint);
        System.out.println("접수가 완료되었습니다.");
    }

    public static void payInsurance() {
        System.out.println("보험금 납부를 처리합니다.");
    }

    public static void queryPartnerCompanies() throws IOException {
        System.out.println("협력 업체 조회를 처리합니다.");
        ArrayList<Partner> partnerList = partnerListImpl.get();
        for (Partner partner : partnerList) {
            System.out.println(partner.getPartnerType() + " / " + partner.getPartnerName());
        }
        System.out.println("업체를 등록하려면 \"등록\"을, 세부 조회를 하려면 업체명을 입력해주세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = br.readLine().trim();
        if (userInput.equals("등록")) {
            System.out.println("업체명을 입력하세요: ");String partnerName = br.readLine().trim();
            while(partnerName.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");partnerName = br.readLine().trim();}
            System.out.println("업종을 입력하세요: ");String partnerType = br.readLine().trim();
            while(partnerType.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");partnerType = br.readLine().trim();}
            System.out.println("주소를 입력하세요: ");String partnerAddress = br.readLine().trim();
            while(partnerAddress.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");partnerAddress = br.readLine().trim();}
            System.out.println("전화번호를 입력하세요: ");String partnerContactInformation = br.readLine().trim();
            while(partnerContactInformation.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");partnerContactInformation = br.readLine().trim();}
            Partner partner = new Partner(partnerName, partnerType, partnerAddress, partnerContactInformation);
            partnerListImpl.add(partner);
            System.out.println("등록이 완료되었습니다.");
        } else {
            Partner selectedPartner = partnerListImpl.getPartnerByName(userInput);
            if(selectedPartner != null) {
                System.out.println(selectedPartner.getPartnerName() + " / " + selectedPartner.getPartnerType()
                        + " / " + selectedPartner.getPartnerAddress() + " / " + selectedPartner.getPartnerContactInformation());
                System.out.println("업체를 평가하시겠습니까? (Y/N): ");
                userInput = br.readLine().trim();
                if(userInput.equals("Y")) {
                    System.out.println("평가자 이름을 입력해주세요: ");
                    String employeeName = br.readLine().trim();
                    while(employeeName.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");employeeName = br.readLine().trim();}
                    System.out.println("평점을 입력해주세요: ");
                    String rate = br.readLine().trim();
                    while(rate.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");rate = br.readLine().trim();}
                    System.out.println("평가 내용을 입력해주세요: ");
                    String content = br.readLine().trim();
                    while(content.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");content = br.readLine().trim();}
                    selectedPartner.setPartnerRate(Integer.parseInt(rate));
                    System.out.println("평가가 완료되었습니다.");
                }
            } else {
                System.out.println("입력하신 업체는 존재하지 않습니다.");
            }
        }
    }
    public static void assessDamage() throws IOException {
        System.out.println("손해 사정을 처리합니다.");
        ArrayList<CompensationClaim> compensationClaimList = compensationClaimListImpl.get();
        for (CompensationClaim compensationClaim : compensationClaimList) {
            System.out.println(compensationClaim.getContractID() + " / " + compensationClaim.getInsuranceName()
                    +  " / " + compensationClaim.getCustomerName() +  " / " + compensationClaim.getCompensationClaimAmount());
        }
        System.out.println("손해 사정을 하려면 \"손해 사정\"을, 보상금 요청을 하려면 \"보상금 요청\"을 입력하세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = br.readLine().trim();
        if(userInput.equals("손해 사정")) {
            System.out.println("손해 사정할 계약 ID를 입력하세요: ");
            String contractID = br.readLine().trim();
            Contract contract = contractListImpl.getContractByID(Integer.parseInt(contractID));
            if(contract != null) {
                System.out.println("직원 이름을 입력해주세요: ");
                String managerName = br.readLine();
                while(managerName.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");managerName = br.readLine().trim();}
                System.out.println("청구 서류를 제출해주세요: ");
                String documentFile = br.readLine();
                while(documentFile.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");documentFile = br.readLine().trim();}
                System.out.println("청구 금액을 입력해주세요: ");
                String compensationClaimAmount = br.readLine();
                while(compensationClaimAmount.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");compensationClaimAmount = br.readLine().trim();}
                System.out.println("면/부책 사유를 입력해주세요: ");
                String reason = br.readLine();
                while(reason.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");reason = br.readLine().trim();}
                System.out.println("총 보상금을 입력해주세요: ");
                String surveyAmount = br.readLine();
                while(surveyAmount.isEmpty()){System.out.println("입력 정보가 누락되었습니다. 다시 입력해주세요: ");surveyAmount = br.readLine().trim();}
                for (CompensationClaim compensationClaim : compensationClaimList) {
                    if(compensationClaim.getContractID() == contract.getContractID()) {
                        compensationClaim.setSurvey(new Survey(Integer.parseInt(contract.getCustomerID()), Integer.parseInt(contract.getInsuranceID()), managerName, Integer.parseInt(surveyAmount), reason));
                        break;
                    }
                }
                System.out.println("저장이 완료되었습니다.");
            } else {
                System.out.println("입력하신 계약은 존재하지 않습니다.");
            }
        } else if (userInput.equals("보상금 요청")) {
            System.out.println("보상금을 요청할 계약 ID를 입력하세요: ");
            String contractID = br.readLine().trim();
            Contract contract = contractListImpl.getContractByID(Integer.parseInt(contractID));
            CompensationClaim compensationClaim = null;
            for (CompensationClaim compensation : compensationClaimList) {
                if(compensation.getContractID() == contract.getContractID()) {
                    compensationClaim = compensation;
                    break;
                }
            }
            if(compensationClaim != null) {
                System.out.println(compensationClaim.getSurvey().getManagerName()
                        + " / " + compensationClaim.getDocumentFile()
                        + " / " + compensationClaim.getCompensationClaimAmount()
                        + " / " + compensationClaim.getSurvey().getReason()
                        + " / " + compensationClaim.getSurvey().getSurveyAmount());
                System.out.println("보상금 요청을 완료하려면 엔터를 눌러주세요");
                br.readLine().trim();
                System.out.println("요청이 완료되었습니다.");
            } else {
                System.out.println("입력하신 정보는 존재하지 않습니다.");
            }
        }
    }
    public static void registerInsurance() {
        System.out.println("보험 등록을 처리합니다.");
    }

    public static void modifyInsurance() {
        System.out.println("보험 수정을 처리합니다.");
    }

    public static void queryCustomerInfo() {
        System.out.println("고객 정보 조회를 처리합니다.");
    }

    public static void queryEmployeeInfo() throws IOException {
        System.out.println("직원 정보 조회를 처리합니다.");
        ArrayList<Employee> employeeList = employeeListImpl.get();
        for (Employee employee : employeeList) {
            System.out.println(employee.getEmployeeID() + " / " + employee.getEmployeeName() + " / " + employee.getEmployeePhoneNumber());
        }
        System.out.println("상세 정보를 확인하려면 직원 ID를 입력하세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String employeeID = br.readLine().trim();
        Employee employee = employeeListImpl.getEmployeeByID(employeeID);
        if(employee != null) {
            System.out.println(employee.getEmployeeID() + " / " + employee.getEmployeeName()
                    + " / " + employee.getPosition() + " / " + employee.getIncidentDate()
                    + " / " + employee.getEmployeePhoneNumber());
            System.out.println("판매 실적을 조회하려면 \"판매 실적 조회\"를 입력하세요.");
            String userInput = br.readLine().trim();
            if (userInput.equals("판매 실적 조회")) {
                for (SellingRecord sellingRecord : employee.getSellingRecordList()) {
                    System.out.println(sellingRecord.getCustomerID() + " / " + sellingRecord.getInsuranceID() + " / " + sellingRecord.getContractDate());
                }
                System.out.println("판매 실적을 등록하려면 \"판매 실적 등록\"을 입력하세요.");
                userInput = br.readLine().trim();
                if (userInput.equals("판매 실적 등록")) {
                    System.out.println("고객 ID를 입력하세요: ");
                    String customerID = br.readLine();
                    System.out.println("고객 이름을 입력하세요: ");
                    String customerName = br.readLine();
                    System.out.println("가입한 보험 ID를 입력하세요: ");
                    String insuranceID = br.readLine();
                    System.out.println("가입 일자를 입력하세요: ");
                    String contractDate = br.readLine();
                    System.out.println("만기 일자를 입력하세요: ");
                    String concludeDate = br.readLine();
                    System.out.println("보험료를 입력하세요: ");
                    String paymentAmount = br.readLine();
                    System.out.println("등록을 완료하려면 엔터를 눌러주세요.");
                    br.readLine();
                    employee.getSellingRecordList().add(new SellingRecord(customerID, insuranceID, contractDate));
                    System.out.println("등록이 완료되었습니다.");
                }
            }
        } else {
            System.out.println("입력하신 직원 ID는 존재하지 않습니다.");
        }
    }
    public static void queryContractInfo() {
        System.out.println("계약 정보 조회를 처리합니다.");
    }

    public static void queryInsuranceApplication() {
        System.out.println("보험 가입 신청 내역 조회를 처리합니다.");
    }
}

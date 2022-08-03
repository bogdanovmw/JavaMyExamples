package org.example.MyWitcher.solid.ocp.exm1.bad;

public class LoanApprovalHandler {
    public void approvePersonalLoan(PersonalLoanValidator validator) {
        if (validator.isValid()) {
            System.out.println("True");
        }
    }

    public void approveVehicleLoan(VehicleLoanValidator validator) {
        if (validator.isValid()) {
            System.out.println("True");
        }
    }
}

class PersonalLoanValidator {
    public boolean isValid() {
        return true;
    }
}

class VehicleLoanValidator {
    public boolean isValid() {
        return true;
    }
}
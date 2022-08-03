package org.example.MyWitcher.solid.ocp.exm1.good;

public class LoanApprovalHandler {
    public void approveLoan(Validator validator) {
        if (validator.isValid()) {
            // process the loan
        }
    }
}

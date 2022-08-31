package in.spdev.ss.aop.methodbeforeadvice.beans;

public class LoanApprover {
    public boolean approveLoan(long loanNo){
        System.out.println("received loan application " + loanNo);
        return true;
    }
}

package interview.questions.design_patterns.dev.rukshesh.SOLIDPrinciples.SRP.GoodCode;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount= amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated & printed invoice for amount " + amount);
    }
}

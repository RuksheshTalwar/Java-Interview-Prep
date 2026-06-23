package interview.questions.design_patterns.dev.rukshesh.SOLIDPrinciples.SRP.BadCode;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount= amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated & printed invoice for amount " + amount);
    }

    public void savetoDatabase() {
        System.out.println("Saving Invoice to Database");
    }

    public void sendEmailNotification() {
        System.out.println("Sending email notification for Invoice ");
    }

}

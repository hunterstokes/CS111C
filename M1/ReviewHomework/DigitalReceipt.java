package M1.ReviewHomework;
public class DigitalReceipt extends Receipt{
    private Receipt receipt;
    private String email;

    public DigitalReceipt(Receipt receipt, String email) {
        super(receipt.getStore(), receipt.getNumberOfItems(), receipt.getTotal(), receipt.getReceiptID());
        this.receipt = receipt;
        this.email = email;
    }

    public DigitalReceipt(Store groceryStore, int numberOfItems, double moneySpent, String receiptID, String email) {
        super(groceryStore, numberOfItems, moneySpent, receiptID);
        this.receipt = new Receipt(groceryStore, numberOfItems, moneySpent, receiptID);
        this.email = email;
    }

    public Receipt getReceipt() {
        return receipt;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DigitalReceipt{" +
                "receipt=" + receipt +
                ", email='" + email + '\'' +
                '}';
    }

    public static boolean validateEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return true;
        } else {
            return false;
        }
    }
}

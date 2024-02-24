package M1.ReviewHomework;
import java.text.NumberFormat;

public class Receipt extends Store {
    private Store groceryStore;
    protected int numberOfItems;
    protected double moneySpent;
    protected String receiptID;

    public Receipt(Store groceryStore, int numberOfItems, double moneySpent, String receiptID) {
        super(groceryStore.getName(), groceryStore.getLocation());
        this.groceryStore = groceryStore;
        this.numberOfItems = numberOfItems;
        this.moneySpent = moneySpent;
        this.receiptID = receiptID;
    }
    public Receipt(Store groceryStore, double moneySpent, String receiptID) {
        super(groceryStore.getName(), groceryStore.getLocation());
        this.groceryStore = new Store("","");
        this.numberOfItems = 1;
        this.moneySpent = moneySpent;
        this.receiptID = receiptID;
    }

    public Store getStore() {
        return groceryStore;
    }

    public void setGroceryStore(Store groceryStore) {
        this.groceryStore = groceryStore;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setnumberOfItems(int numberOfItems) {
        if (numberOfItems >=0) {
            this.numberOfItems = numberOfItems;
        } else {
            System.out.println("Invalid number of Items");
        }
    }

    public double getTotal() {
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public String getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }
    @Override
    public boolean equals(Object receiptObject) {
        if (this == receiptObject) {
            return true;
        }
        if (receiptObject == null || getClass() != receiptObject.getClass()) {
            return false;
        }
    Receipt receipt = (Receipt) receiptObject;
    return numberOfItems == receipt.numberOfItems &&
           Double.compare(receipt.moneySpent, moneySpent) == 0 &&
           (receiptID == null ? receipt.receiptID == null : receiptID.equalsIgnoreCase(receipt.receiptID)) &&
           (groceryStore == null ? receipt.groceryStore == null : groceryStore.equals(receipt.groceryStore));
}

    @Override
    public String toString() {
    String moneyString = NumberFormat.getCurrencyInstance().format(moneySpent);
    return "Store: " + groceryStore.toString() + "\n" +
           "Number of Items: " + numberOfItems + "\n" +
           "Total Money Spent: " + moneyString + "\n" +
           "Receipt ID: " + receiptID;
    }
	public static boolean idMeetsCriteria(String receiptID2, char firstChar, char secondChar, int timesAfter) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'idMeetsCriteria'");
	}


}

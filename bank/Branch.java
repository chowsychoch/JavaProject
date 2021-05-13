package udemy.bank;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, double initial){
        if(find(customerName) == null){
            this.customerList.add(new Customer(customerName,initial));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName,double amount){
        Customer existingCustomer = find(customerName);

        if(existingCustomer !=null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer find(String customerName){
        for (int i=0; i<this.customerList.size();i++){
            if (this.customerList.get(i).equals(customerName)){
                return this.customerList.get(i);
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
}

package udemy.bank;

import java.util.ArrayList;

public class Bank {

    private String Bank;
    private ArrayList<Branch> BranchList;

    public Bank(String name){
        this.Bank = name;
        this.BranchList = new ArrayList<Branch>();
    }

    public boolean newBranch(String branchName){
            if(find(branchName) == null){
                Branch newBranch = new Branch(branchName);
                this.BranchList.add(newBranch);
                System.out.println("New Branch is created");
                return true;
            }
            return false;
    }

    public boolean newCustomerToBranch(String branchName, String customerName, double initial){
        Branch existingBranch = find(branchName);
        if(existingBranch != null){
            System.out.println("New customer is created");
            return existingBranch.newCustomer(customerName,initial);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double initial){
        Branch existingBranch = find(branchName);
        if(existingBranch !=null){
            return existingBranch.addCustomerTransaction(customerName,initial);
        }
        return false;
    }

    private Branch find(String Branchname){
        for(int i=0; i< this.BranchList.size(); i++){
            if(this.BranchList.get(i).getBranchName().equals(Branchname)){
                return this.BranchList.get(i);
            }

        }
        return null;
    }

    public void printBranch(){
        System.out.println("Total " + BranchList.size() + " no. of branches");
        for (int i=0; i< this.BranchList.size(); i++){
            Branch name = this.BranchList.get(i);
            ArrayList<Customer> branchCustomer = name.getCustomerList();
            for (int j =0; i<branchCustomer.size();i++){
                Customer c = branchCustomer.get(i);
                c.getName();
                System.out.println("Customer " + c.getName());
            }
            System.out.println("Branch " + name.getBranchName() +" has " + name.getCustomerList());
        }
    }

    public boolean listCustomers(String branchName, boolean showTransaction){
        Branch branch = find(branchName);
        if (branch !=null){
            System.out.println("Customer details for branch " +branch.getBranchName());
            ArrayList<Customer> branchCustomers = branch.getCustomerList();
            for (int i=0; i< branchCustomers.size();i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Custoemr: "+branchCustomer.getName()+ "[ " + (i+1)+ "]");
                if(showTransaction){
                    System.out.println("Transaction");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for(int j =0; j < transactions.size(); j++){
                        System.out.println("[" +(j+1)+ "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }




}

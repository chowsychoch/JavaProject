package udemy.bank;

public class Main {
    public static void main (String[] args){
        Bank bank = new Bank("National Australia Bank");
        bank.newBranch("Mel");

        bank.newCustomerToBranch("Mel", "Peter",5065.2);
        bank.newCustomerToBranch("Mel", "Cho",50.2);
        bank.newCustomerToBranch("Mel", "Tim",50.2);

        bank.newBranch("Sydney");
        bank.addCustomerTransaction("Mel","Cho",5456.2);

        bank.listCustomers("Sydney",true);
        bank.listCustomers("Mel",true);
        System.out.println("Finished");
        bank.printBranch();
    }

}

package udemy.bank;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> doubleValList;
    //constructor
    public Customer(String name, double amount) {
        this.name = name;
        this.doubleValList = new ArrayList<Double>();
        addTransaction(amount);
    }

    public void addTransaction(double value){
        this.doubleValList.add(value);
    }

    public String getName(){
        return name;
    }
    public ArrayList<Double> getTransaction(){
        return doubleValList;
    }

}

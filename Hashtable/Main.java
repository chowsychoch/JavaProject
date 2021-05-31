package udemy.Hashtable;

public class Main {

    public static void main (String[] args){
        Employee j = new Employee("Jane", "Jone", 123);
        Employee k = new Employee("Kelly", "Doe", 567);

        HashTable ht = new HashTable();
        ht.put("Jone", j);
        ht.put("Kelly", k);


        ht.get("Jone");

        ht.print();


    }


}

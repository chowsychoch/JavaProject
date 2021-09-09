package udemy.Hashtable;

public class Main {

    public static void main (String[] args){
        Employee j = new Employee("Jane", "Jones", 123);
        Employee k = new Employee("Kelly", "Doe", 567);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee makeMary = new Employee("Mary", "Smith", 22);

        //HashTable ht = new HashTable();
        ChianedHashTable ht = new ChianedHashTable();

        ht.put("Jones", j);
        ht.put("Doe", k);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith",makeMary);


        //System.out.print(ht.get("Jone"));

        ht.print();

        System.out.println("Retrieve key Mary: " + ht.get("Smith"));

        ht.remove("Smith");
        ht.print();
        ht.put("Smith",makeMary);

        ht.print();

        Employee makeKary= new Employee("Kary", "Qmith", 22);
        ht.put("Qmith",makeKary);
        Employee makeLary= new Employee("Lary", "Lmith", 22);
        ht.put("Lmith",makeLary);
        ht.print();

        ht.remove("Smith");
        ht.print();


    }


}

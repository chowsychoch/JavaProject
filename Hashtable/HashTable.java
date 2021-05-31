package udemy.Hashtable;

public class HashTable {

    private Employee[] hashTable;

    public HashTable(){
        //construct
        this.hashTable = new Employee[10];
    }

    public Employee get(String key){
        int hashIndex = HashCode(key);
        return hashTable[hashIndex];


    }

    public void put(String key, Employee employee){
        int hashIndex = HashCode(key);
        if( hashTable[hashIndex] != null){
            System.out.println("Already exist" + hashIndex);
        }else{
            hashTable[hashIndex] = employee;
        }
    }

    private int HashCode(String key){
        return key.length() % hashTable.length;
    }

    public void print(){
        for (int i=0; i <hashTable.length;i++){
            System.out.println((hashTable[i]));
        }
    }
}

// Time Complexity
// Retrieve O(1)
// Insert O(1)
// Delete O(1)
package udemy.Hashtable;

public class HashTable {
    //private Employee[] hashTable;
    private StoredEmployee[] hashTable;

    public HashTable(){
        //construct
        this.hashTable = new StoredEmployee[10];
    }
    //Not handle Collision yet
    public Employee get(String key){
        int hashIndex = findKey(key);
        if (hashIndex == -1 ){
            return null;
        }
        return hashTable[hashIndex].employee;
    }

    public Employee remove(String key){
        int hashIndex = findKey(key);
        if ( hashIndex == -1){
            return null;
        }
        Employee e = hashTable[hashIndex].employee;
        hashTable[hashIndex] = null;

        StoredEmployee[] old = hashTable;
        hashTable = new StoredEmployee[old.length];
        for (int i =0 ; i < old.length; i++){
            if(old[i]!= null){
                put(old[i].key, old[i].employee);
            }
        }
        return e;
    }

    public void put(String key, Employee employee){
        int hashIndex = HashCode(key);
        //
        if (occupied(hashIndex)){
            int stopIndex = hashIndex;
            if ( hashIndex == hashTable.length - 1 ){
                hashIndex = 0 ;
            }else{
                hashIndex++;
            }
            while (hashIndex != stopIndex && occupied(hashIndex)){
                hashIndex = (hashIndex + 1 ) % hashTable.length;
            }
        }

        if(occupied(hashIndex)){
            System.out.println("Already exist" + hashIndex);
        }else{
            hashTable[hashIndex] = new StoredEmployee(key, employee);
        }
    }

    private int findKey(String key){
        int hashIndex = HashCode(key);
        if ( hashTable[hashIndex]!= null && hashTable[hashIndex].key.equals(key)){
            return  hashIndex;
        }

        int stopIndex = hashIndex;
        if (hashIndex == hashTable.length - 1) {
            hashIndex = 0;
        } else {
            hashIndex++;
        }
        while (hashIndex != stopIndex && hashTable[hashIndex] !=null && !hashTable[hashIndex].key.equals(key)) {
            hashIndex = (hashIndex + 1) % hashTable.length;
        }
        if (hashTable[hashIndex]!= null && hashTable[hashIndex].key.equals(key)){
            return hashIndex;
        }
        return -1;

    }

    private int HashCode(String key){
        return key.length() % hashTable.length;
    }

    private boolean occupied (int index){
        return hashTable[index] != null;
    }

    public void print(){
        for (int i=0; i <hashTable.length;i++){
            if ( hashTable[i] != null){
                System.out.println(i + " " +hashTable[i].employee.getFirstname());
            }else{
                System.out.println("Empty");
            }
        }
        System.out.println("==========================");
    }
}

// Time Complexity
// Retrieve O(1)
// Insert O(1)
// Delete O(1)

//Hash Table will have collisions issue.
//Two keys have the same index. That will override the values.
//Solution:
//Linear Probing.
package udemy.Hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChianedHashTable {
    private LinkedList<StoredEmployee>[] hashtable;

    public ChianedHashTable(){
        hashtable = new LinkedList[10];
        for(int i=0 ; i < hashtable.length ; i++){
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee val){
        int hashKey = HashCode(key);
        hashtable[hashKey].add(new StoredEmployee(key, val));

    }

    private int HashCode(String key){
        //return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public Employee get(String key){
        int hashkey = HashCode(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashkey].listIterator();
        StoredEmployee s;
        while (iterator.hasNext()){
            s = iterator.next();
            if(s.key.equals(key)){
                return s.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashedky = HashCode(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedky].listIterator();
        StoredEmployee s = null ;
        int index = -1 ;
        while (iterator.hasNext()){
            index++;
            s = iterator.next();
            if(s.key.equals(key)){
                break;
            }
        }
        if (s == null ){
            return null;
        }else{
            hashtable[hashedky].remove(index);
            return s.employee;
        }
    }

    public void print(){
        for (int i = 0; i < hashtable.length ; i++){
            if (hashtable[i].isEmpty()){
                System.out.println("Empyty");
            }else{
                ListIterator<StoredEmployee> s = hashtable[i].listIterator();
                while (s.hasNext()){
                    System.out.print(s.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
        System.out.println("=========");
    }




}

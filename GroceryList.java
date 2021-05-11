package udemy;

import java.util.ArrayList;

public class GroceryList {
    //class
    private ArrayList<String> grocertList = new ArrayList<String>();

    public void addGroceryItem(String item){
        grocertList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+ grocertList.size() + " items ");
        for (int i =0; i < grocertList.size(); i++){
            System.out.println((i +1) +". "+ grocertList.get(i));
        }
    }
    /*public void modifyGroceryItem(String newItem){
        int pos = findItem(newItem);
        if (pos >= 0){
            modifyGroceryItem(pos, newItem);
        }
    }*/

    public void modifyGroceryItem(int position, String newItem){
        grocertList.set(position,newItem);
        System.out.println("Grocery item "+ (position+1)+" has been modified");
    }

    public void removeGroceryItem(int pos){
        String theItem = grocertList.get(pos-1);
        grocertList.remove(pos);

    }

    public String findItem(String searchItem){
        boolean exists = grocertList.contains(searchItem);
        int position = grocertList.indexOf(searchItem);
        if (position >=0){
            return grocertList.get(position);
        }
        return null;
    }
    /*
    public int findItem(String searchItem){
        return grocertList.indexOf(searchItem);
    }*/


}

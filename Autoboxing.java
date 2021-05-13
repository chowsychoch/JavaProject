package udemy;

import java.util.ArrayList;


class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Autoboxing {

    public static void main(String[] args){
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> str = new ArrayList<String>();
        str.add("Cho");
        //Why error?
        //A primitive type is not a class, it needs a class reference here
        //ArrayList<int> intArr = new ArrayList<int>();
        //Solution One --> Set up  a wrapper
        ArrayList<IntClass> intArr = new ArrayList<IntClass>();
        intArr.add(new IntClass(55));
        //*****************************************//
        //Solution 2
        Integer integer = new Integer(55);
        Double doubleVal = new Double(12.25);
        Float floatVal = new Float(123.564);
        Boolean booleanVal = new Boolean(false);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i =0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));
            //intArrayList.add(i);
            System.out.println(i + "-->" + intArrayList.get(i).intValue());
            //
            int value = intArrayList.get(i);
            System.out.println(i + "-->" + value);
        }

        Integer myInt = 56; //Integer.valueOf(56)
        int myIntVal = myInt; // myInt.intValue();




    }
}

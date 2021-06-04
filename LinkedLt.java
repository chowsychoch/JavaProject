package udemy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedLt {
    public static void main(String[] args){
        LinkedList<String> places = new LinkedList<String>();
        addOrder(places,"Adelaide");
        addOrder(places,"Brisbane");
        addOrder(places,"Canberra");

        printList(places);
        addOrder(places,"Darwin");
        printList(places);
        places.remove(2);
        printList(places);
        addOrder(places,"Melbourne");
        printList(places);
        visit(places);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("====================");
    }

    private static boolean addOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringList = linkedList.listIterator();
        while(stringList.hasNext()){
            int comparison = stringList.next().compareTo(newCity);
            if(comparison ==0){
                //equal, do not add
                System.out.println(newCity + " is already included");
                return false;
            }else if (comparison > 0){
                // new City
                stringList.previous();
                stringList.add(newCity);
                return true;
            }else if( comparison <0 ){
                //move on next city

            }
        }

        stringList.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in the list");

        }else{
            System.out.println("Now visiting" + listIterator.next());
            printList();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now " + listIterator.next());
                    }else{
                        System.out.println("Reach the end");
                        goingForward = false;
                    }
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.hasPrevious();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting" + listIterator.previous());
                    }else{
                        System.out.println("WE are at the start");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printList();
                    break;
            }



        }
    }

    private static void printList(){
        System.out.println("Available: \npress");
        System.out.println("0 - to quit \n +" +
                "1 - go to next city\n" +
                "2 - go to previous city\n"+
                "3 - print menu options");
    }



}

package udemy;

public class Count5whileLoop {
    public static void main (String[] args){
        int count = 1;
        while (count != 6){
            System.out.println("Count" + count);
            count++;
        }

        count = 1;
        while (true){
            System.out.println("Count" + count);
            count+=1;
            if (count ==6){
                break;
            }
        }

        for (count =1 ; count < 6; count++){
            System.out.println("Count is " + count);
        }
    }

}

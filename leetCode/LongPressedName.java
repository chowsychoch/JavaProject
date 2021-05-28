package udemy.leetCode;

public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int nameInd = 0;
        int typesInd = 0;
        if ( typed.length() < name.length() || name.length() <= 0 || typed.length() <= 0 )return false;

        while ( nameInd < name.length() && typesInd < typed.length()){
            if (name.charAt(nameInd) == typed.charAt(typesInd)){
                nameInd++;
                typesInd++;
            }else{
                if (typesInd == 0 || typed.charAt(typesInd) != typed.charAt(typesInd -1 )){
                    System.out.println("F" );
                    return false;
                }
                typesInd++;
            }
        }
        System.out.println("name: " + nameInd);
        System.out.println("typesInd: " + typesInd);

        while (typesInd != typed.length() ){
            if (typed.charAt(typesInd) != typed.charAt(typesInd - 1)){
                System.out.println("F");
                return false;
            }else{
                typesInd++;
            }
        }
        if ( nameInd == name.length()){
            System.out.println("Tt");
            return true;
        }else{
            System.out.println("FFF");
            return false;
        }
    }
}

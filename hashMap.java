package udemy;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        if (languages.containsKey("Java")){
            System.out.println("JAva is here");
        }else{
            languages.put("Java","This is course is about JAva");
            System.out.println("JAva is added");

        }
        languages.put("Python","an interpreted OOP language");
        languages.put("Javascript","frontend language");
        System.out.println(languages.put("Basic", "some basic")); // return null for not exist key
        System.out.println(languages.get("Java"));
        //Same key --> over written the value;
        languages.put("Java", "this course is about Java");
        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")){
            System.out.println("JAva is here");
        }else{
            languages.put("Java","This is course is about JAva");

        }

        System.out.println("================================");

        for (String key: languages.keySet()){
            System.out.println(key + ":" + languages.get(key));
        }

    }


}

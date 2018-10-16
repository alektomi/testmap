package notepad;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//      Map<String, String> translations = new LinkedHashMap<>(); // associativnyj spisok. Ne garantiruet pravilnuju posledovatelnostj pri vyvode na ekran

//      Map<String, String> translations = new LinkedHashMap<>(); // associativnyj spisok v kotorom sohranjaetsja pravilnyj porjadok v spiske

//      Map<String, String> translations = new TreeMap<>(); // associativnyj spisok v alfavitnom porjadke ili v porjadke vozrastanija

        Map<String, String> translations = new TreeMap<>(Comparator.reverseOrder()); // associativnyj spisok v obratnom porjadke porjadke ili v porjadke ubivanija


        translations.put("one", "один"); //key and value
        translations.put("home", "дом");
        translations.put("mouse", "мышь");
        translations.put("two", "два");

        System.out.println(translations.get("two"));

        for (String k : translations.keySet()) {
            System.out.printf("%s -> %s\n", k, translations.get(k));

        }

        System.out.println(translations.containsKey("home")); // returns true or false
        System.out.println(translations.size()); // returns number ov values in the list
        System.out.println(translations.remove("one")); // returns number ov values in the list

        System.out.println("after removal");
        for (String k : translations.keySet()) {
            System.out.printf("%s -> %s\n", k, translations.get(k));

        }
    }
}

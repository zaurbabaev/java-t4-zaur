package az.edu.itbrains.codewars;

import java.util.HashMap;
import java.util.Map;

/*
("english", "Welcome")
, ("czech", "Vitejte")
, ("danish", "Velkomst")
, ("dutch", "Welkom")
, ("estonian", "Tere tulemast")
, ("finnish", "Tervetuloa")
, ("flemish", "Welgekomen")
, ("french", "Bienvenue")
, ("german", "Willkommen")
, ("irish", "Failte")
, ("italian", "Benvenuto")
, ("latvian", "Gaidits")
, ("lithuanian", "Laukiamas")
, ("polish", "Witamy")
, ("spanish", "Bienvenido")
, ("swedish", "Valkommen")
, ("welsh", "Croeso")
 */
public class Welcome {

    public static Map<String, String> languages = new HashMap<>();

    public static void init() {
        languages.put("english", "Welcome");
        languages.put("czech", "Vitejte");
        languages.put("danish", "Velkomst");
        languages.put("dutch", "Welkom");
        languages.put("estonian", "Tere tulemast");
        languages.put("finnish", "Tervetuloa");
        languages.put("flemish", "Welgekomen");
        languages.put("french", "Bienvenue");
        languages.put("german", "Willkommen");
        languages.put("irish", "Failte");
        languages.put("italian", "Benvenuto");
        languages.put("latvian", "Gaidits");
        languages.put("lithuanian", "Laukiamas");
        languages.put("polish", "Witamy");
        languages.put("spanish", "Bienvenido");
        languages.put("swedish", "Valkommen");
        languages.put("welsh", "Croeso");
    }


    public static String greet(String language) {
        Map<String, String> languages = new HashMap<>();
        languages.put("english", "Welcome");
        languages.put("czech", "Vitejte");
        languages.put("danish", "Velkomst");
        languages.put("dutch", "Welkom");
        languages.put("estonian", "Tere tulemast");
        languages.put("finnish", "Tervetuloa");
        languages.put("flemish", "Welgekomen");
        languages.put("french", "Bienvenue");
        languages.put("german", "Willkommen");
        languages.put("irish", "Failte");
        languages.put("italian", "Benvenuto");
        languages.put("latvian", "Gaidits");
        languages.put("lithuanian", "Laukiamas");
        languages.put("polish", "Witamy");
        languages.put("spanish", "Bienvenido");
        languages.put("swedish", "Valkommen");
        languages.put("welsh", "Croeso");

        if (languages.containsKey(language)) {
            return languages.get(language);
        }
        return languages.get("english");
    }

    public static String greet2(String language) {
        Map<String, String> languages = new HashMap<>();
        languages.put("english", "Welcome");
        languages.put("czech", "Vitejte");
        languages.put("danish", "Velkomst");
        languages.put("dutch", "Welkom");
        languages.put("estonian", "Tere tulemast");
        languages.put("finnish", "Tervetuloa");
        languages.put("flemish", "Welgekomen");
        languages.put("french", "Bienvenue");
        languages.put("german", "Willkommen");
        languages.put("irish", "Failte");
        languages.put("italian", "Benvenuto");
        languages.put("latvian", "Gaidits");
        languages.put("lithuanian", "Laukiamas");
        languages.put("polish", "Witamy");
        languages.put("spanish", "Bienvenido");
        languages.put("swedish", "Valkommen");
        languages.put("welsh", "Croeso");

        return languages.getOrDefault(language, languages.get("english"));

    }


    public static void main(String[] args) {
//        init();

        System.out.println(greet2("english"));
        System.out.println(greet2("czech"));
        System.out.println(greet2("italian"));
        System.out.println(greet2("french"));
        System.out.println(greet2("frech"));
    }


}

package com.urvashigupta;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "a compile high level, object oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithm language");
        languages.put("BASIC", "Beginers All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java", "this course is about Java");
        }
        System.out.println(languages.get("Java"));

    //    languages.remove("Lisp"); //case sensitive
        if(languages.remove("Algol", "a family of algorithmic language")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key/value pair not found");
        }

        System.out.println("============================");
        if(languages.replace("Lisp","Therein lies madness", "a functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        }else{
            System.out.println("Lisp not replaced");
        }
        System.out.println(languages.replace("Scala", "this will not be added"));

        for(String key: languages.keySet()){
            System.out.println(key + " : " +languages.get(key));
        }
    }
}

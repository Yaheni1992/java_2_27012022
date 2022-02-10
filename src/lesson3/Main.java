package lesson3;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "звезда", "планета", "воздух",
                "звезда", "солнце", "земля",
                "звезда", "солце", "воздух",
                "птица", "растение", "альфа"
        };

            for(String e : words) {
                hm.put(e,hm.getOrDefault(e,0) + 1);
            }

            System.out.println(hm);

            System.out.println(Arrays.toString((words)));

            Telephone telephonebook = new Telephone();
            telephonebook.add("Николай", "7894561");
            telephonebook.add("Николай", "7554561");
            telephonebook.add("Сярожа", "2587416");
            telephonebook.add("Игорь", "3259633");
            telephonebook.add("Игорь", "9959633");


            System.out.println("Номер Николая" + telephonebook.get("Николай"));
            System.out.println("Номер Сярожи" + telephonebook.get("Сярожа"));
            System.out.println("Номер Игоря" + telephonebook.get("Игорь"));
        }
    }
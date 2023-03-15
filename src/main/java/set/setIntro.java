package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setIntro {
    public static void main(String[] args) {

        Set<String> usernames = new HashSet<>();
        usernames.add("abc123");
        usernames.add("botirovna");
        usernames.add("baitikkv");
        usernames.add("aibolincho");
        usernames.add("orozonova");

        System.out.println(usernames);
        System.out.println(usernames.contains("bena")); // false
        System.out.println(usernames.contains("abc123")); // true
        System.out.println(usernames.contains(" baitikkv".trim())); // true
        System.out.println(usernames.isEmpty()); // false

        usernames.clear();
        System.out.println(usernames.size());
        usernames.remove("ailincho");

        Object [] array = (String [])usernames.toArray();
        System.out.println(Arrays.toString(array));

        HashSet<String> usernames2 = new HashSet<>();
        usernames2.add("sweetmoon");
        usernames2.add("Alina456");
        usernames2.add("ailaAkaAila");
        usernames2.add("baitikkv");
        usernames2.add("botirovna");

        /*
        FIFO - first in, first out
        FILO - last in, first out

         */
        }
    }

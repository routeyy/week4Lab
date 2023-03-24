package Week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringBuilderListSetMapLab {

  public static void main(String[] args) {

      // 1. Why would we use a StringBuilder instead of a String?
      //      a. Instantiate a new StringBuilder
      //      b. Append the characters 0 through 9 to it separated by dashes
      //              Note:  make sure no dash appears at the end of the StringBuilder
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < 10; i++) {
          numbers.append(i);
          if (i != 9) {
            numbers.append(" - ");
          }
        }
        System.out.println(numbers);
        
        
      // 2. List of String:
      //      a. Create a list of Strings 
      //      b. Add 5 Strings to it, each with a different length
        List<String> someStrings = new ArrayList<String>();
        someStrings.add("woah");
        someStrings.add("reeee");
        someStrings.add("weewoo");
        someStrings.add("ahh");
        someStrings.add("ha");
//        for (String say : someStrings) {
//          System.out.println(say);
//        }
        System.out.println(someStrings);
      
        
      // 3. Write and test a method that takes a list of strings 
      //          and returns the shortest string
        System.out.println(shortestString(someStrings));
        
        
      // 4. Write and test a method that takes a list of strings 
      //          and returns the list with the first and last element switched
        System.out.println(switchedStringList(someStrings));
      
        
      // 5. Write and test a method that takes a list of strings 
      //          and returns a string with all the list elements concatenated to each other,
      //          separated by a comma
        System.out.println(concatString(someStrings));
      
        
      // 6. Write and test a method that takes a list of strings and a string 
      //          and returns a new list with all strings from the original list
      //          containing the second string parameter (i.e. like a search method)
        System.out.println(newStringList(someStrings, "a"));
      
        
      // 7. Write and test a method that takes a list of integers 
      //          and returns a List<List<Integer>> with the following conditions specified
      //          for the return value:
      //      a. The first List in the returned value contains any number from the input list 
      //          that is divisible by 2
      //      b. The second List contains values from the input list that are divisible by 3
      //      c. The third containing values divisible by 5, and 
      //      d. The fourth all numbers from the input List not divisible by 2, 3, or 5
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(12);
        intList.add(10);
        intList.add(15);
        intList.add(17);
        intList.add(18);
        System.out.println(listOfIntegerList(intList));
      
        
      // 8. Write and test a method that takes a list of strings 
      //          and returns a list of integers that contains the length of each string
        System.out.println(stringLengthList(someStrings));

        
      // 9. Create a set of strings and add 5 values
        Set<String> strSet = new HashSet<String>();
        strSet.add("grow");
        strSet.add("shrink");
        strSet.add("minimize");
        strSet.add("maximize");
        strSet.add("medium");
        System.out.println(strSet);
      
      
      // 10. Write and test a method that takes a set of strings and a character 
      //          and returns a set of strings consisting of all the strings in the
      //          input set that start with the character parameter.
        System.out.println(stringStartCharSet(strSet, 'm'));
      
        
      // 11. Write and test a method that takes a set of strings 
      //          and returns a list of the same strings
        System.out.println(setToList(strSet));


      // 12. Write and test a method that takes a set of integers 
      //          and returns a new set of integers containing only even numbers 
      //          from the original set
        Set<Integer> intSet = new HashSet<Integer>();
        intSet.add(3);
        intSet.add(6);
        intSet.add(2);
        System.out.println(intEvenSet(intSet));

      
      // 13. Create a map of string and string and add 3 items to it where the key of each
      //          is a word and the value is the definition of the word
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("lore", "a body of traditions and knowledge on a subject or held by a particular group");
        dictionary.put("legend", "a traditional story sometimes popularly regarded as historical but unauthenticated");
        dictionary.put("myth", "a traditional story, especially one concerning the early history of a people");
        System.out.println(dictionary);
  
      
      // 14. Write and test a method that takes a Map<String, String> and a string 
      //          and returns the value for a key in the map that matches the
      //          string parameter (i.e. like a language dictionary lookup)
        System.out.println(getDefinition(dictionary, "legend"));
        
      
      // 15. Write and test a method that takes a List<String> 
      //          and returns a Map<Character, Integer> containing a count of 
      //          all the strings that start with a given character
        System.out.println(countStringStartWithChar(someStrings));

  }
  
  
  // Method 15:
    public static Map<Character, Integer> countStringStartWithChar(List<String> strList) {
      Map<Character, Integer> newMap = new HashMap<Character, Integer>();
      for (String str : strList) {
        char c = str.charAt(0);
        if (newMap.get(c) == null) {
          newMap.put(c, 1);
        } else {
          newMap.put(c, newMap.get(c) + 1);
        }
      }
      return newMap;
    }
  
  
  // Method 14:
    public static String getDefinition(Map<String, String> dictionary, String unknwnWord) {
      for (String word : dictionary.keySet()) {
        if (word.equals(unknwnWord)) {
          return dictionary.get(word);
        }
      }
      return "";
    }

  
  // Method 12:
    public static Set<Integer> intEvenSet(Set<Integer> intSet) {
      Set<Integer> integerSet = new HashSet<Integer>();
      for (int x : intSet) {
        if (x % 2 == 0) {
          integerSet.add(x);
        }
      }
      return integerSet;
    }

  
  // Method 11:
    public static List<String> setToList(Set<String> strSet) {
      List<String> strList = new ArrayList<String>();
      for (String str : strSet) {
        strList.add(str);
      }
      return strList;
    }


  // Method 10:
    public static Set<String> stringStartCharSet(Set<String> strSet, char x) {
      Set<String> strStartCharSet = new HashSet<String>();
      for (String str : strSet) {
        if (str.charAt(0) == x) {
          strStartCharSet.add(str);
        }
      }
      return strStartCharSet;
    }

  
  // Method 8:
    public static List<Integer> stringLengthList(List<String> strList) {
      List<Integer> strLengthList = new ArrayList<Integer>();
      for (String str : strList) {
        strLengthList.add(str.length());
      }
      return strLengthList;
    }

  
  // Method 7:
    public static List<List<Integer>> listOfIntegerList(List<Integer> intList) {
      List<Integer> intList1 = new ArrayList<Integer>();
      List<Integer> intList2 = new ArrayList<Integer>();
      List<Integer> intList3 = new ArrayList<Integer>();
      List<Integer> intList4 = new ArrayList<Integer>();
      for (int x : intList) {
        if (x % 2 == 0) {
          intList1.add(x);
        } 
        if (x % 3 == 0) {
          intList2.add(x);
        } 
        if (x % 5 == 0) {
          intList3.add(x);
        }
        if (x % 2 != 0 && x % 3 != 0 && x % 5 != 0) {
          intList4.add(x);
        }
      }
      List<List<Integer>> listIntList = new ArrayList<List<Integer>>();
      listIntList.add(intList1);
      listIntList.add(intList2);
      listIntList.add(intList3);
      listIntList.add(intList4);
      return listIntList;
    }

  
  // Method 6:
    public static List<String> newStringList(List<String> strList, String str) {
      List<String> newStrList = new ArrayList<String>();
      for (String stri : strList) {
        if (stri.contains(str)) {
          newStrList.add(stri);
        }
      }
      return newStrList;
    }

  
  // Method 5:
    public static String concatString(List<String> stringList) {
      StringBuilder concatString = new StringBuilder();
      int counter = 1;
      for (String str : stringList) {
          concatString.append(str);
          if (counter < stringList.size()) {
            concatString.append(", ");
          }
          counter ++;
        }
      return concatString.toString();
    }
  
  
  // Method 4:
    public static List<String> switchedStringList(List<String> stringList) {
      String firstString = stringList.get(0);
      String lastString = stringList.get(stringList.size() - 1);
      stringList.set(0, lastString);
      stringList.set(stringList.size() - 1, firstString);
      return stringList;
    }
  
  
  // Method 3:
    public static String shortestString(List<String> stringList) {
      String shortString = stringList.get(3);
      for (String str : stringList) {
        if (shortString.length() > str.length()) {
          shortString = str;
        }
      }
      return shortString;
    }

}

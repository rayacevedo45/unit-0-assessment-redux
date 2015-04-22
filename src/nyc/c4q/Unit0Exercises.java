package nyc.c4q;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Unit0Exercises
{
    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     * additional information in the comments of each method
     */
    public static void main(String args[])
    {
        // Use main to test your methods
        print();
        System.out.println(returnPrimitiveBooleanFalse());
        System.out.println(returnPrimitiveInt55Plus44());
    }

    public static void print()
    {
        // print out "I'm sorry Dave, I'm afraid I can't let you do that."
        System.out.println("I'm sorry Dave, I'm afraid I can't let you do that.");
    }

    public static boolean returnPrimitiveBooleanFalse()
    {
        return false;
    }

    public static int returnPrimitiveInt55Plus44()
    {
        return 99;
    }

    public static double returnPrimitiveDouble2Point718()
    {
        // This is the start of a famous mathematical constant.
        // What's that constant?
        return 2.718;
    }

    public static char returnPrimitiveCharASCII35()
    {
        // What's the character for the ASCII number 35?
        // Look at an ASCII table and return that character.
        // You can look at the ASCII table at http://www.asciitable.com/
        return '#';
    }

    public static boolean isEven(int n)
    {
        return (n % 2 == 0);
    }

    public static boolean isMultipleOfX(int n, int x)
    {
        // 0 is a multiple of every number (except 0)
        // For example:
        //      isMultipleOfX(0, 3) == true
        //      isMultipleOfX(1, 3) == false
        //      isMultipleOfX(3, 3) == true
        //      isMultipleOfX(10, 3) == false
        //      isMultipleOfX(28, 7) == true
        // TODO expect a ArithmeticException in Test with x==0
        return (n % x == 0);
    }

    public static int returnSumOfOddNumbersBetween1And100()
    {
        int j = 0;
        for(int i = 1; i < 100; i += 2)
        {
            j += i;
            // Starts with [1, 3, 5, ...]
            // Ends with   [..., 95, 97, 99]
        }
        return j;
    }

    public static int returnSumOfTheFirst200MultiplesOf3()
    {
        int j = 0;
        for(int i = 3; i < 600; i += 3)
        {
            j += i;
            // Starts with [0, 3, 6, ...]
            // Ends with   [..., 591, 594, 597]
        }
        return j;
    }

    public static boolean isEmptyString(String str)
    {
        return (str.length() == 0);
    }

    public static String alternateS1AndS2Xtimes(String s1, String s2, int x)
    {
        // Given string `s1`, `s2` and a positive integer `x`,
        // return a string that is equal to s1 + s2 repeated x times.
        // If x is 0 or negative negative, return an empty string `""`.
        // For example:
        //      alternateS1AndS2Xtimes("abra", "cadabra", 0).equals("") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 1).equals("abracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 2).equals("abracadabraabracadabra") == true
        //      alternateS1AndS2Xtimes("abra", "cadabra", 3).equals("abracadabraabracadabraabracadabra") == true
        String finalString = "";
        //String combo = s1 + s2;
        for(int i = 0; i < x; i++)
        {
           if (x != 0){
               finalString += s1 + s2;
           }
           else finalString = "";
        }

        return finalString;
    }


    public static String stringSplit(String s, String splitOn)
    {
//        Given string s, return a string that stops at the first occurrence of "split".
//        For example:
//              stringSplit("ubiquitous", "q").equals("ubi") == true
//              stringSplit("hellogoodbye", "good").equals("hello") == true
//              stringSplit("fancy seeing you", "there").equals("") == true
//        If the string does not contain split, then return the empty string "".
        String splitString = s.replaceAll(splitOn, "");
        int sLenght = s.length();

        String splitString2 = splitString.substring(sLenght,splitString.length());
        return splitString;
                //int j = s.split(splitOn);
                //for(int i = 0;i < s.split(splitOn);i++)
               // {

                    //String result = s.split(splitOn)[0];

                }



    public static Singer returnBeyonce() {
      Singer Beyonce = new Singer("Beyonce","USA");
      // should return an instance of Singer with the name "Beyonce" and location "USA"
      return Beyonce;
    }

    public static Singer returnSingerChild(Singer s1, Singer s2) {

      // should return an instance of Singer with the name of s1 and the location of s2.
      // For example:
            Singer queenB = new Singer("Beyonce", "USA");
            Singer rihanna = new Singer("Rihanna", "Barbados");
            Singer child = new Singer(s1.getName(),s2.getLocation());
      //      returnSingerChild(queenB, rihanna) ==> returns an instance of Singer with name "Beyonce" and location "Barbados".
      return child;
    }

    public static HashMap<String, Singer> returnSingers() {
        // should return a HashMap of the following singers:
        Singer Beyonce = new  Singer("Beyonce","USA");
        Singer Jay =  new Singer("Jay-Z","USA");
        Singer Bieber = new Singer("Bieber","Canada");
        Singer Drake = new Singer("Drake","Canada");
        Singer Jepsen = new Singer("Jepsen","Canada");
        HashMap<String,Singer>singers = new HashMap<String, Singer>();
        singers.put("Beyonce",Beyonce);
        singers.put("Jay-Z",Jay);
        singers.put("Bieber",Bieber);
        singers.put("Drake",Drake);
        singers.put("Jepsen",Jepsen);
        return singers;
    }

    public static boolean isFromCanada(Singer person) {
        return (person.getLocation().equals("Canada"));
    }

    public static void changeJayZsLocationToLosAngeles(HashMap<String, Singer> people) {


        //people.get("Jay-Z").setLocation("Los Angeles");
        //people = returnSingers();
        people.remove("Jay-Z");
        people.put("Jay", new Singer("Jay-Z", "Los Angeles"));
        //people = returnSingers();
//        people.return
//        HashMap<String, Singer> singers = new HashMap<String, Singer>();
//        singers.put("Beyonce", new Singer("Beyonce", "USA"));
//        singers.put("Jay-Z", new Singer("Jay-Z", "Los Angeles"));
//        singers.put("Bieber", new Singer("Bieber", "Canada"));
//     Singer jay = singers.get("Jay-Z");
        // people will have the values of the `returnSingers()` method you filled in previously.
        // the city should be set to "Los Angeles"
        // old value of Jay-Z:
        //      Singer(name="Jay-Z",   location="USA")
        // new value of Jay-Z:
        //      Singer(name="Jay-Z",   location="Los Angeles")
    }

    public static void removeJepsenFromSingers(HashMap<String, Singer> people){
        returnSingers().remove("Jespen");
        //Singer Beyonce = new  Singer("Beyonce","USA");
        //Singer Jay =  new Singer("Jay-Z","USA");
        //Singer Bieber = new Singer("Bieber","Canada");
        //Singer Drake = new Singer("Drake","Canada");
        //Singer Jepsen = new Singer("Jepsen","Canada");
        //HashMap<String,Singer>singers = new HashMap<String, Singer>();
        //people = singers;
        //singers.put("Beyonce",Beyonce);
        //singers.put("Jay-Z",Jay);
        //singers.put("Bieber",Bieber);
        //singers.put("Drake",Drake);
        //singers.put("Jepsen",Jepsen);
        //people = singers;
        //people.remove(Jepsen);

        // people will have the values of the `returnSingers()` method you filled in previously.
        // old keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake", "Jepsen"]
        // new keys in `people`:
        //  ["Beyonce", "Jay-Z", "Bieber", "Drake"]

    }

    // Bonus Problems
    public static void readFileAndOnlyPrintCanadianCelebrities() {
        // TODO Use Apache Commons CSV and provide boilerplate for reading the file
        // https://commons.apache.org/proper/commons-csv/
      try {
        FileReader fr = new FileReader("celebrities.csv");
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }

    public static void readFileAndPrintCelebrityAges(){
        // TODO similar as above
    }
}

package learnProgramming;

public class StringImmutability {
    public static void main(String[] args) {

        String myFirstString = "Hello";


        String myFirstString2 = myFirstString + "One";

        System.out.println(myFirstString.toLowerCase());

        System.out.println(myFirstString);

        //String is immutable, you cannot change, make it smaller or larger you can only create another string.

        String newString = myFirstString + "World";
        newString = myFirstString;
        System.out.println(newString );
//        newString = "HelloWorld";
        String anotherString = "hElLo";


        System.out.println("using equals method to compare hello and newString and value is " + (myFirstString==newString));

        System.out.println("using equals method to compare hello and newString and value is " + myFirstString.equals(anotherString));

        System.out.println("using equalsIgnoreCase method to compare hello and newString and value is " + anotherString.equalsIgnoreCase(newString));

        System.out.println(newString.toUpperCase());

        System.out.println(newString.charAt(2));


        newString = newString.toUpperCase().concat(" WORLD").toLowerCase().concat(" Suffix").toUpperCase();

        System.out.println("The new string value is " + newString);

//        System.out.println(newString.);

        System.out.println(myFirstString.toUpperCase());
        System.out.println(newString.hashCode());
        System.out.println(myFirstString.hashCode());
        System.out.println(newString);
        System.out.println(myFirstString);
        System.out.println(myFirstString2);

        System.out.println(newString + myFirstString);

        myFirstString.toUpperCase();

        System.out.println(myFirstString);

        String newUpperCaseString = myFirstString.toUpperCase();

        System.out.println(newUpperCaseString);

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");


        System.out.println(s1);
        System.out.println(s2);


    }
}

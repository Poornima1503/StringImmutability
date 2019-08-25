package practiseProgramming;

public class PractiseStringImmutability {
    public static void main(String[] args) {

        String str = "Hi";
        String str1 = "Java";
        System.out.println(str +" object reference is =" + str.hashCode());
        System.out.println(str1 +" object reference is =" + str1.hashCode());

        str = str+str1;
        System.out.println(str + " object reference is =" + str.hashCode());

        String str2 = "Java";
        System.out.println(str2 +" object reference is =" + str2.hashCode());
        String str3 ="java";
        System.out.println(str3 +" object reference is =" + str3.hashCode());
        String str4 ="java";
        System.out.println(str4 +" object reference is =" + str4.hashCode());
        String str5 ="MyFifthString";
        System.out.println(str5);
        System.out.println(str5 = str + str1 + "object reference is =" + str5.hashCode());
        System.out.println(str5);
    }
}

import java.util.Scanner;
public class TrytoCompareStrings_2{
    
    public static void main(String[] args)
    {
        String aName = "Carmen";
        String anotherName;
        Scanner input = new Scanner(System.in);
        anotherName = "carmen";
        if(aName.equals(anotherName))
            System.out.println(aName + " equals " + anotherName);
        else
            System.out.println(aName + " Does not equal " + anotherName);
        if(aName.equalsIgnoreCase(anotherName))
            System.out.println(aName + " equals " + anotherName + " Case Ignored");
        else
            System.out.println(aName + " Does not equal " + anotherName + " Case ignored");
    }
}
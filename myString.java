public class myString{
    public static void main(String[] args){
        //String myString = "Welcome to Holy Angel University";
        //System.out.println(myString.trim().indexOf("Holy"));
        
        String myString = "Hello";
        char string = myString.charAt(3);
        System.out.println(string);
        Boolean result = myString.endsWith("o");
        System.out.println(result);
        
        System.out.println(myString.replace("o","p"));
    }
}

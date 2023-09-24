import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {   // print out the reversed string to verify
        System.out.println(reverseString("acbcefg"));
    }
    // add the characters in reverse order to char array
    public static String reverseString(String stringIn){
        char[] reverse = new char[stringIn.length()];

        for (int i = 0; i < stringIn.length(); i++)
        {
            reverse[(stringIn.length() -1) - i] = stringIn.charAt(i);
        }
        // return the char array as a string
        return Arrays.toString(reverse);
    }
}

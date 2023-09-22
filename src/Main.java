import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(reverseString("acbcefg"));
    }

    public static String reverseString(String stringIn){
        char[] reverse = new char[stringIn.length()];

        for (int i = 0; i < stringIn.length(); i++)
        {
            reverse[(stringIn.length() -1) - i] = stringIn.charAt(i);
        }
        return Arrays.toString(reverse);
    }
}

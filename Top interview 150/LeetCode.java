import java.nio.charset.CharsetEncoder;
import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        //String s = "Hello world ";
        //String s =  "   fly me   to   the moon ";
        //String s = "luffy is still joyboy";
        int count=0,WhiteSpaceCount=0,main_index = s.length()-1;
        while (Character.isWhitespace(s.charAt(main_index)))
        {
            main_index--;
        }
        for(int i=main_index;i>=0;i--)
        {
            if(WhiteSpaceCount == 1)break;
            if(Character.isWhitespace(s.charAt(i)))
                WhiteSpaceCount++;
            else count++;
        }
        System.out.println(count);

    }
}

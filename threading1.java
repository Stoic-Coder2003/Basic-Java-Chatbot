import java.util.*;
class threading1
{
    public static void something()throws InterruptedException
    {
        String s="...";
        int l=s.length();
        char c;
        for(int i=0;i<l;i++)
        {
            c=s.charAt(i);
            System.out.print(c);
            Thread.sleep(1000);
        }
    }
}

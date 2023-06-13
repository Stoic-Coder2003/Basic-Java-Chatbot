import java.util.*;
class cons
{
    public static void constatnt()throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        System.out.println();
        System.out.println("enter any thing you want, my input system is switched on for you");
        threading.something();
        System.out.println("p.l. enter only 'bye' to exit");
        threading.something();
        System.out.println("if i give you no reply on the screen then it means that i was not able to get what you said");
        threading.something();
        while(b==true)
         {
            String args=sc.nextLine();
            if(args.equalsIgnoreCase("bye"))
            {
                System.out.println();
                System.out.println("closing constant input system.....");
                threading1.something();
                System.out.println("removing internal files.....");
                threading1.something();
                System.out.println("deleting passwords.....");
                threading1.something();
                System.out.println("your savings and passwords deleted.");
                b=false;
                  }
            if(args.equalsIgnoreCase("hi"))
            System.out.println("hello how are you");
            else if(args.equalsIgnoreCase("hello"))
            System.out.println("hello how are you?");
            else if(args.equalsIgnoreCase("will you marry me"))
            System.out.println("yeah sure but let me first ask my parents for that");
            else if(args.equalsIgnoreCase("let us go for a date"))
            System.out.println("yeah sure i am looking forward for that day");
            else if(args.equalsIgnoreCase("you were bad"))
            System.out.println("i am sorry for that may be i am not a better companion");
            else if(args.equalsIgnoreCase("you are good"))
            System.out.println("thank you for your comment");
            else if(args.equalsIgnoreCase("i am fine how are you"))
            System.out.println("it is good to hear that");
            
        }
    }
}

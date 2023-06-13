import java.util.*;
class security
{
    public static void sec()throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("hey, wait a min! let us make your personals private");
        System.out.println("enter a password");
        String pass=sc.nextLine();
        threading1.something();
        System.out.println("password saved");
       threading.something();
        System.out.println("enter you age");
       int age=sc.nextInt();
       threading1.something();
       if(age<18)
       System.out.println("minor mode switched on");
       else
       System.out.println("major mode running");
    }
}

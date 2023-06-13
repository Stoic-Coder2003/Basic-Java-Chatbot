import java.util.*;
class javaA_I
  {
    
    public static void main(String args[])throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        intro.intro();
        conversation.conver();
        System.out.println();
        security.sec();
        System.out.println("enter confirm password again");
        String conpass=sc.nextLine();
        System.out.println();
        cons.constatnt();
        System.out.println();
        System.out.println();
        System.out.println("want to play a game?, enter yes for yes and n for no");
        String s=sc.nextLine(),pass1=" ";
        int choice=0;
        if(s.equalsIgnoreCase("yes")){
        if1main.ifthis();
         choice=sc.nextInt();
        switch (choice)
       {
        case 1:
         handcricket_simulator x=new handcricket_simulator();
        x.play();
       break;
      case 2:
       game1.guessgame();
      break;
       }
                }
        
                else{
       else1main.elsethis();
     }
    
    cons.constatnt();
                            }
                        }


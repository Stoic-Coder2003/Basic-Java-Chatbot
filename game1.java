import java.util.*;
class game1
{
    public static void guessgame()throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random(6);
        int score=0,mscore=0,z2;
        String s;
        System.out.println("this game is about the guessing game in which you will enter 6 numbers and at the same time i will also do the same");
        threading.something();
        System.out.println("if your number matches mine then you score a point else i do");
        System.out.println();
        do
        {
        System.out.println("enter 6 numbers");
        for(int i=1;i<=6;i++)
        {
           System.out.print("your number= ");
            int z1=sc.nextInt();
           z2=rnd.nextInt(6);
           System.out.println("my number= "+z2);
           if(z1==z2)
           score++;
           else
           mscore++;
        }
        System.out.println("your score= "+score);
        System.out.println("my score= "+mscore);
        if(score>mscore)
        System.out.println("you win the game");
        else{
        System.out.println("you loose");
        System.out.println("better luck next TIME");
        }
        System.out.println("do you want to try once more? enter yes");
        s=sc.nextLine();
    }
        while(s=="yes");
    
}
}

/*please read the instructions carefully.
you have to first choose either batting or balling.then according to yuor choice
you will have to play a match of 2 overs which means that you will play 12 times
then with you comp will also type its random value .
REMEMBER:you have to input each score between 1 to 6.
if your value will match that of the comp then you are declared out.*/
import java.util.*;
class handcricket_simulator
{
public static void play()throws InterruptedException
{
Scanner z=new Scanner(System.in);
Random rnd=new  Random();
int ch,x,s,random,ursco=0,mysco=0,random1,s1,y;
System.out.println("enter a choice(1-batting 2-balling)");
ch=z.nextInt();
switch (ch)
{
case 1:
for(x=1;x<13;x++)
{
System.out.println("enter your score");
s=z.nextInt();
if(s<1 || s>6)
System.out.println("go and read the multiple line comments");
else
{
random=rnd.nextInt(6);
System.out.println("your score="+s);
threading.something();
System.out.println("my score="+random);
ursco=ursco+s;
if(s==random)
{
System.out.println("your value "+s+" was equal to my value hence you are out");
threading.something();
System.out.println("your score="+(ursco-s));
break;
}
}
}
break;
case 2:
for(y=1;y<13;y++)
{
random1=rnd.nextInt(6);
System.out.println("enter your value");
s1=z.nextInt();
if(s1<1 || s1>6)
System.out.println("go read instructions");
else
{
System.out.println("ur value="+s1);
threading.something();
System.out.println("my value="+random1);
mysco=mysco+random1;
if(random1==s1)
{
System.out.println("your value "+s1+" was equal to my value so i am out");
threading.something();
System.out.println("my score="+(mysco-1));
break;
}
}
}
break;
default :
System.out.println("wrong choice");
}
}
}

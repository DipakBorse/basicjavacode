import java.util.Scanner;
import java.util.Random;
/*next number is sum of previous two numbers for ex.0,1,1,2,3,5,8,13,21 */
class ex1{
    public static void main(String args[])
    {
        int n1=0, n2=1,i,n3,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1;
        for(i=2;i<count;++i)//loop will statr from 2 becuz 0 and 1 already printed;
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
/*code for identify prime number.
 * the number which can only be devided by itself and one
 */
class ex2{
    public static void main(String[] args)
    {
        int i,j=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for prime number");
        Integer num = input.nextInt();
        input.close();
        for(i=2;i<num;i++){
            if (num%i==0){
                j=j+1;
                System.out.println(num+" is not prime number, It is divisible by "+i);
                break;
            }
        }if(j==0){
            System.out.println(num+" is prime number.");
        }
    }
}
/*2nd code for primt number 
 * printing whole primt numbers till given number
 */
class ex3{
    public static void main(String args[])
    {
        int i, j,count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here:-");
        Integer num= input.nextInt();
        input.close();
        for(i=1;i<=num;i++){
            count=0;
            for(j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
        }
    }
}

/*code for the number which is same as its reverse 
use int as input
 * ex. 545, 2332,88*/
class ex4{
    public static void main(String[] args)
    {
        int i,sum=0,count;
        int n=545;
        count=n;
        while(n>0){
            i=n%10;
            sum=(sum*10)+i;
            n=n/10;
        }
        if(count==sum){
            System.out.println("same by reversing the number.");
        }else{
            System.out.println("not same by reversing the number.");
        }
    }
}
/*code for string and numbers reversible check
 * ex. 101,ded, deepeed,345543.
 */
class ex5{
    public static void main(String[] args)
    {
        String reverse="";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to manipulate");
        String original=input.nextLine();
        input.close();
        for(int i=original.length()-1;i>=0;i--){
            reverse = reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("Reversible");
        }else{
            System.out.println("irriversible");
        }
        System.out.println(reverse);        
    }
}
/*Factorial program */
class ex6{
    public static void main(String[] args)
    {
        int fact=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number here:-");
        Integer num=input.nextInt();
        input.close();
        for(int i=num;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact+" is Factorial of "+num+".");
    }
}
/*code for armstrong number
 * 1,2,3,407.
 */
class ex7{
    public static void main(String[] args)
    {
        int i=407,t1=i,t2=t1,len=0,arm=0,rem;
        while(t1>0){
            t1=t1/10;
            len=len+1;
        }
        while(t2>0){
            rem=t2%10;
            t2=t2/10;
            int mul=1;
            for(int k=1;k<=len;k++){
                mul=mul*rem;
            }arm=arm+mul;
        }
        if(arm==i){
            System.out.println(arm+" is Armstrong number");
        }else{
            System.out.println(i+" is not armstrong number");
        }
    }
}
class ex8{
    public static void main(String[] args){
        String i="aausssshddk";
        int k=i.length();
        for(int j=0;j<k;j++){
            int count=0;
            for(int n=j;n<k;n++)
            {
                if(i.charAt(n)==i.charAt(j)){
                    count=count+1;
                    System.out.print(i.charAt(j));
                }
            }
            System.out.print(count);
        }
    }
}

/*get random variables
 * int
 * boolean
 * float
 */
class ex9{
    public static void main(String[] args)
    {
        Random random = new Random();
        //print random intigers till ex. 1)49, 2)999.
        int a = random.nextInt(50);
        int b = random.nextInt(1000);
        System.out.println(a);
        System.out.println(b);
        //print random boolean value.
        boolean i = random.nextBoolean();
        boolean k= random.nextBoolean();
        System.out.println(i);
        System.out.println(k);
        //print random float value
        float c = random.nextFloat();
        float d = random.nextFloat();
        System.out.println(c);
        System.out.println(d);

    }
}
//by second method print random value
class ex10{
    public static void main(String[] args)
    {
        System.out.println("PRO PLAYER bolte vrooo!!");
        //printing randpm numbers from here
        System.out.println(Math.random()+" is First random number");
        System.out.println(Math.random()+" is Second random number");
        System.out.println(Math.random()+" is Third random number");
        System.out.println(Math.random()+" is Forth random number");
        System.out.println(Math.random()+" is Fifth random number");
    }
}
/*printing pattern of stars
 * * * *
 * * *
 * *
 */
/* *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 */
class ex11{
    public static void main(String[] args)
    {
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }for(int n=0;n<=5;n++){
                for(int v=0;v<n;v++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
class ex12{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no of rows for printing here:-");
        Integer k = input.nextInt();
        input.close();
        for(int i=0;i<k;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int n=k;n>0;n--){
            for(int p=0;p<n;p++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class ex13{
    public static void main(String[] args)
    {
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*code for ascii value
 * a=97
 */
class asciival1{
    public static void main(String[] args){
        char ch ='a';
        int asciivalue = ch;
        System.out.println(asciivalue);
    }
}


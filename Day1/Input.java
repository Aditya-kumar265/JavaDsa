import java.util.*;
public class Input {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); //here sc is object
        //next
        String input = sc.next();
        System.out.println(input);
        sc.nextLine();
        //nextLine
        String give = sc.nextLine();
        System.out.println(give);
        //nextInt
        int number = sc.nextInt();
        System.out.println(number);
        //nextByte
        byte b = sc.nextByte();
        System.out.println(b);
        //nextFloat
        float f = sc.nextFloat();
        System.out.println(f);
        //nextDouble
        double d = sc.nextDouble();
        System.out.println(d);
        //nextBoolean
        boolean bool = sc.nextBoolean();
        System.out.println(bool);
        //nextShort 
        short sh = sc.nextShort();
        System.out.println(sh);
        //nextLong
        long l= sc.nextLong();
        System.out.println(l);
        
    }
    
}

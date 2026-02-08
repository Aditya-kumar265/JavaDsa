public class TypePromotion {
    public static void main (String [] args){
        char a = 'a';
        char b = 'b';
        char c= 99;
        System.out.println((int)(b));
        System.out.println((int)a);
        System.out.println(c);
        System.out.println(b-a);
        short d = 5;
        byte e = 25;
        char f = 'c';
        System.out.println("end");
        byte g = (byte)(a+b+c); //because by rule 1 a+b+c is converted to int
        System.out.println(g);

        long h = 78l;
        long i = d+e+f+h;
        System.out.println(i);

    }
    
}

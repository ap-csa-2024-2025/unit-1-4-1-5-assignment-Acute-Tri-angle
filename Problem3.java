public class Problem3{
    public static void main(String[] args){
        int x = 9536;
        System.out.println("four digit #: " + x);
        System.out.println("here are the digits:");
        System.out.println(x % 10);
        System.out.println(x / 10 % 10);
        System.out.println(x % 1000 / 100);
        System.out.println(x / 1000);
    }
}

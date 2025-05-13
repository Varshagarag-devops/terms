
public class Fibonacciii{
    public static void main(String[] args) {
        int n = 10;
        int a = 6, b = 1;

        System.out.println("fibonacci series upto" + n + "terms");

        for(int i = 1; i <= n; i++){
            System.out.println(a+"");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

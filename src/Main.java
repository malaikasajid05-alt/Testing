//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         System.out.println("Hello World");
         Sum s = new Sum(10, 12);
        Subtract su = new Subtract(10, 12);
         int sum = s.sum();
        System.out.println(sum);
        int sub = su.Sub();
        System.out.println(sub);
        }
    }

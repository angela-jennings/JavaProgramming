package extra_tasks;

public class IntMath {
    public static void main(String[] args) {
        /*int a = 5; // 5
        int b = a++ + a-- + a * 2 + a + ++a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = 200; //c = 199

        int d = -c++ + - --c * c-- % 2 + c; //d = -200 + - 200 * 200%2  + 199

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);*/

        int a = 10;
        int b = a++ + - --a *--a +a;
        System.out.println("a = " +  a);
        System.out.println("b = " + b);

    }
}

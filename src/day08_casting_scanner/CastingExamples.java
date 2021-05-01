package day08_casting_scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CastingExamples {
    public static void main(String[] args) {
        // byte, short, int, long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;
        int num4 = 50;
        long num5 = num4;
        float num6 = 123.45F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;

        System.out.println(num8);
        System.out.println("num 9 = " + num9);

        System.out.println(num1 + " " + num2 + " " + num3);
        System.out.println(num4 + " " + num5);

        int num10 = 22;
        byte num11 = (byte)num10;
        short num12 = (short)num10;
        System.out.println(num10 + " " + num11 + " " + num12);
        
        double num13 = 55.3;
        float num14 =(float)num13;
        System.out.println("num14 = " + num14);
        
        double num15 = 123.45;
        int num16 =(int)num15;
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);

        int num17 = 300;
        byte num18 = (byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);

        char letter = 'A';
        int letter1 = letter;
        System.out.println("letter1 = " + letter1);

    }

}

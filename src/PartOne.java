public class PartOne {
    public static void main(String[] args) {

        System.out.println("Задание 3.1");
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = false;

        boolean resultA1 = a1 || b1;
        boolean resultB1 = a1 && b1;
        boolean resultC1 = b1 || c1;

        System.out.println("a = " + a1 + ", b = " + b1 + ", c = " + c1);
        System.out.println("a || b = " + resultA1 + "\na && b = " + resultB1 + "\nb || c = " + resultC1);

        System.out.println();

        System.out.println("Задание 3.2");
        boolean x1 = false;
        boolean y1 = true;
        boolean z1 = false;

        boolean resultA2 = x1 || z1;
        boolean resultB2 = z1 && y1;
        boolean resultC2 = x1 && z1;

        System.out.println("x = " + x1 + ", y = " + y1 + ", z = " + z1);
        System.out.println("x || y = " + resultA2 + "\nz && y = " + resultB2 + "\nx && z = " + resultC2);

        System.out.println();

        System.out.println("Задание 3.3");
        boolean a2 = false;
        boolean b2 = true;
        boolean c2 = true;

        boolean resultA3 = !a2 && b2;
        boolean resultB3 = a2 || !b2;
        boolean resultC3 = a2 && b2 || c2;

        System.out.println("a = " + a2 + ", b = " + b2 + ", c = " + c2);
        System.out.println("!a && b = " + resultA3 + "\na || !b = " + resultB3 + "\na && b || c = " + resultC3);

        System.out.println();

        System.out.println("Задание 3.4");
        boolean x2 = true;
        boolean y2 = true;
        boolean z2 = false;

        boolean resultA4 = !x2 && y2;
        boolean resultB4 = x2 || !y2;
        boolean resultC4 = x2 || y2 && z2;

        System.out.println("x = " + x2 + ", y = " + y2 + ", z = " + z2);
        System.out.println("!x && y = " + resultA4 + "\nx || !y = " + resultB4 + "\nx || y && z = " + resultC4);

        System.out.println();

        System.out.println("Задание 3.5");
        boolean a3 = true;
        boolean b3 = false;
        boolean c3 = false;

        boolean resultA5 = a3 || b3 && !c3;
        boolean resultB5 = !a3 && !b3;
        boolean resultC5 = !(a3 && c3) || b3;
        boolean resultD5 = a3 && !b3 || c3;
        boolean resultE5 = a3 && (!b3 || c3);
        boolean resultF5 = a3 || (!(b3 && c3));

        System.out.println("a = " + a3 + ", b = " + b3 + ", c = " + c3);
        System.out.println("a || b && !c = " + resultA5 + "\n!a && !b = " + resultB5 + "\n!(a && c) || b = " + resultC5 + "\na && !b || c = " + resultD5 + "\na && (!b || c) = " + resultE5 + "\na || (!(b && c)) = " + resultF5);

        System.out.println();

        System.out.println("Задание 3.6");
        boolean x3 = false;
        boolean y3 = false;
        boolean z3 = true;

        boolean resultA6 = x3 || y3 && !z3;
        boolean resultB6 = !x3 && !y3;
        boolean resultC6 = !(x3 && z3) || y3;
        boolean resultD6 = x3 && !y3 || z3;
        boolean resultE6 = x3 && (!y3 || z3);
        boolean resultF6 = x3 || (!(y3 || z3));

        System.out.println("x = " + x3 + ", y = " + y3 + ", z = " + z3);
        System.out.println("x || y && !z = " + resultA6 + "\n!x && !y = " + resultB6 + "\n!(x && z) || y = " + resultC6 + "\nx && !y || z = " + resultD6 + "\nx && (!y || z) = " + resultE6 + "\nx || (!(y || z)) = " + resultF6);

        System.out.println();

        System.out.println("Задание 3.7");
        boolean a4 = true;
        boolean b4 = false;
        boolean c4 = false;

        boolean resultA7 = a4 || !(a4 && b4) || c4;
        boolean resultB7 = !a4 || a4 && (b4 || c4);
        boolean resultC7 = (a4 || b4 && !c4) && c4;

        System.out.println("a = " + a4 + ", b = " + b4 + ", c = " + c4);
        System.out.println("a || !(a && b) || c = " + resultA7 + "\n!a || a && (b || c) = " + resultB7 + "\n(a || b && !c) && c = " + resultC7);

        System.out.println();

        System.out.println("Задание 3.8");
        boolean x4 = false;
        boolean y4 = true;
        boolean z4 = false;

        boolean resultA8 = x4 && !(z4 || y4) && !z4;
        boolean resultB8 = !x4 || x4 && (y4 ||z4);
        boolean resultC8 = (x4 || y4 && !z4) && z4;

        System.out.println("x = " + x4 + ", y = " + y4 + ", z = " + z4);
        System.out.println("x && !(z || y) && !z = " + resultA8 + "\n!x || x && (y ||z) = " + resultB8 + "\nx || y && !z) && z = " + resultC8);

        System.out.println();

        System.out.println("Задание 3.9");
        boolean x5 = true;
        boolean y5 = false;
        boolean z5 = false;

        boolean resultA9 = !x5 || !y5 || z5;
        boolean resultB9 = (!x5 || !y5) && (x5 || z5);
        boolean resultC9 = x5 && y5 || x5 && z5 || !z5;

        System.out.println("x = " + x5 + ", y = " + y5 + ", z = " + z5);
        System.out.println("!x || !y || z = " + resultA9 + "\n(!x || !y) && (x || z) = " + resultB9 + "\nx && y || x && z || !z = " + resultC9);

        System.out.println();

        System.out.println("Задание 3.10");
        boolean a5 = false;
        boolean b5 = false;
        boolean c5 = true;

        boolean resultA10 = (!a5 || !b5) && !c5;
        boolean resultB10 = (!a5 || !b5) && (a5 || b5);
        boolean resultC10 = a5 && b5 || a5 && c5 || !c5;

        System.out.println("x = " + a5 + ", y = " + b5 + ", z = " + c5);
        System.out.println("(!a || !b) && !c = " + resultA10 + "\n(!a || !b) && (a || b) = " + resultB10 + "\na && b || a && c || !c = " + resultC10);
    }
}

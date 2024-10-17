package A_Java_Basics;

public class D_Operators {
    public static void main(String[] args) {

        //Arithmetic
        System.out.println("------------------Arithmetic-----------------------");

        int num = 10;
        int num2 = 20;

        System.out.println(num + num2);
        System.out.println(num - num2);
        System.out.println(num * num2);
        System.out.println(num2 / num);
        System.out.println(num2 % num);

        //Relational
        System.out.println("------------------Relational-----------------------");

        int a = 10;
        int b = 20;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        //Logical
        System.out.println("------------------Logical-----------------------");

        int x = 10;
        int y = 20;
        int z = 30;

        boolean condition1 = (x > y);
        boolean condition2 = (y < z);
        boolean condition3 = (x < z);

        boolean answer1 = condition1 && condition2 && condition3;
        System.out.println(answer1);

        boolean answer2 = condition1 || condition2 || condition3;
        System.out.println(answer2);

        boolean answer3 = !condition1;
        System.out.println(answer3);

        //Assignment
        System.out.println("------------------Assignment-----------------------");

        int age = 12;

        //age = age+8;
        age += 8;
        System.out.println(age);

        //age = age -1
        age -= 1;
        System.out.println(age);

        //age = age *10
        age *= 10;
        System.out.println(age);

        //age = age /10
        age /= 10;
        System.out.println(age);

        //age = age %5
        age %= 5;
        System.out.println(age);

        //Assignment
        System.out.println("------------------Unary-----------------------");

        //Increment--> ++
        int value = 5;
        //Pre Increment
        System.out.println(++value);
        //Post Increment
        System.out.println(value++);

        //Decrement--> --
        int values = 10;
        //Pre Decrement
        System.out.println(--values);
        //Post Decrement
        System.out.println(values--);

    }
}

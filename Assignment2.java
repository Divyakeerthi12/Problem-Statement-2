import java.util.*;
public class Assignment2 {

    public static void main(String args[]) {
        System.out.println("Tax Calculator App");
        System.out.println("----------WELCOME-----------");
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.println("Enter Total person count");
        count = sc.nextInt();
//        String[] a = new String[count];
        String[] name = new String[count];
        long[] income = new long[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name");
            name[i] = sc.next();
            System.out.println("Enter salary");
            income[i] = sc.nextLong();
        }
        System.out.println("Names with liable tax");
        System.out.println("----------------------");
        for(int j=0;j<count;j++)
        {
            calculateTax(name[j],income[j]);
        }

    }
    public static void calculateTax(String name, Long income)

    {

        if(income>=300000)
        {
            double a=(income*20)/100;
            System.out.println(name + ": \u20B9"+a);
        }
        else if(income>=100000&&income<300000)
        {
            double b=(income*10)/100;
            System.out.println(name + ": \u20B9"+b);
        }
        else if(income<100000)
        {
            Long c=income;
            System.out.println(name + ": \u20B9"+c);
        }
    }
}


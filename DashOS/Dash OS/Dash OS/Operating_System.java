/**
* Dash OS
* Operating_System
*
* Created by Aryan Dinakaran on 07/02/20.
* Copyright © 2020 Aryan Dinakaran. All rights reserved.
**/

import java.util.Scanner;
public class Operating_System
{   
    String fname;
    String sname;
    
    static Scanner scan = new Scanner(System.in);
    static void add()
    {
        System.out.println("========");
        System.out.println("ADDITION");
        System.out.println("========");
        
        System.out.println("");
        
        System.out.println("Enter First Number\n>> ");
        double fnum = scan.nextDouble();
        
        System.out.println("");
        
        System.out.println("Enter Second Number\n>> ");
        double snum = scan.nextDouble();
        
        System.out.println("");
        
        System.out.println("Answer: "+(fnum+snum));
        cal();
    }
    static void sub()
    {
        System.out.println("===========");
        System.out.println("SUBTRACTION");
        System.out.println("===========");
        
        System.out.println("");
        
        System.out.println("Enter First Number\n>> ");
        double fnum = scan.nextDouble();
        
        System.out.println("");
        
        System.out.println("Enter Second Number\n>> ");
        double snum = scan.nextDouble();
        
        System.out.println("");
        
        System.out.println("Answer: "+(fnum-snum));
        cal();
    }
    static void mul()
    {
        System.out.println("==============");
        System.out.println("MULTIPLICATION");
        System.out.println("==============");
        
        System.out.println("");
        
        System.out.println("Enter First Number\n>> ");
        double fnum = scan.nextDouble();
        
        System.out.println("");
        
        System.out.println("Enter Second Number\n>> ");
        double snum = scan.nextDouble();
        
        System.out.println("");
        
        System.out.println("Answer: "+(fnum*snum));
        cal();
    }
    static void div()
    {
        System.out.println("========");
        System.out.println("DIVISION");
        System.out.println("========");
        
        System.out.println("");
        
        System.out.println("Enter First Number\n>> ");
        double fnum = scan.nextDouble();
        
        System.out.println("");
        
        System.out.println("Enter Second Number\n>> ");
        double snum = scan.nextDouble();
        
        System.out.println("");
        
        System.out.println("Answer: "+(fnum/snum));
        System.out.println("Remainder: "+(fnum%snum));
        cal();
    }
    static void cal()
    {   
        System.out.println("Type 'b' to go back to the last screen");
        System.out.println("Enter an operaor (+, -, * or /)\n>> ");
        char condition = scan.next().charAt(0);
        
        switch (condition)
        {
            case '+':
            add();
            break;
            
            case '-':
            sub();
            break;
            
            case '*':
            mul();
            break;
            
            case '/':
            div();
            break;
            
            case 'b':
            calculator();
            break;
            
            default:
            System.out.println("choose the correct operator");
            cal();
            break;
        }
    }
    static void page1()
    {
        System.out.println("Do you want to find simple interest again (y/n)");
        char con = scan.next().charAt(0);
        
        switch(con)
        {
            case 'y':
            si();
            break;
            
            case 'n':
            interest();
            break;
            
            default:
            System.out.println("Choose the correct option");
            page1();
            break;
        }   
    }
    static void page2()
    {
        System.out.println("Do you want to find principal again (y/n)");
        char con = scan.next().charAt(0);
        
        switch(con)
        {
            case 'y':
            p();
            break;
            
            case 'n':
            interest();
            break;
            
            default:
            System.out.println("Choose the correct option");
            page2();
            break;
        }   
    }
    static void page3()
    {
        System.out.println("Do you want to find rate again (y/n)");
        char con = scan.next().charAt(0);
        
        switch(con)
        {
            case 'y':
            r();
            break;
            
            case 'n':
            interest();
            break;
            
            default:
            System.out.println("Choose the correct option");
            page3();
            break;
        }   
    }
    static void page4()
    {
        System.out.println("Do you want to find Time again (y/n)");
        char con = scan.next().charAt(0);
        
        switch(con)
        {
            case 'y':
            t();
            break;
            
            case 'n':
            interest();
            break;
            
            default:
            System.out.println("Choose the correct option");
            page4();
            break;
        }   
    }
    static void si()
    {
        System.out.println("====== ========");
        System.out.println("SIMPLE INTEREST");
        System.out.println("====== ========\n");        
        
        System.out.println("Enter Principal\n>> ");
        double p = scan.nextDouble();
        
        System.out.println("\nEnter Rate\n>> ");
        double r = scan.nextDouble();
        
        System.out.println("Enter Time\n>> ");
        double t = scan.nextDouble();
        
        System.out.println("\nSimple Interest: "+((p*r*t)/100));
        
        page1();
    }
    static void p()
    {
        System.out.println("==== =========");
        System.out.println("FIND PRINCIPAL");
        System.out.println("==== =========\n");        
        
        System.out.println("Enter Simple Interest\n>> ");
        double si = scan.nextDouble();
        
        System.out.println("\nEnter Rate\n>> ");
        double r = scan.nextDouble();
        
        System.out.println("Enter Time\n>> ");
        double t = scan.nextDouble();
        
        System.out.println("\nPrincipal: "+((si*100)/r*t));
        
        page2();
    }
    static void r()
    {
        System.out.println("==== =====");
        System.out.println("FIND RATE");
        System.out.println("==== =====\n");        
        
        System.out.println("Enter Simple Interest\n>> ");
        double si = scan.nextDouble();
        
        System.out.println("\nEnter Principal\n>> ");
        double p = scan.nextDouble();
        
        System.out.println("Enter Time\n>> ");
        double t = scan.nextDouble();
        
        System.out.println("\nRate: "+((si*100)/p*t));
        
        page3();
    }
    static void t()
    {
        System.out.println("==== ====");
        System.out.println("FIND TIME");
        System.out.println("==== ====\n");        
        
        System.out.println("Enter Simple Interest\n>> ");
        double si = scan.nextDouble();
        
        System.out.println("\nEnter Principal\n>> ");
        double p = scan.nextDouble();
        
        System.out.println("Enter Rate\n>> ");
        double r = scan.nextDouble();
        
        System.out.println("\nTime: "+((si*100)/p*r));
        
        page4();
    }
    static void interest()
    {
        int condition;
        
        System.out.println("========");
        System.out.println("INTEREST");
        System.out.println("========\n");
        
        System.out.println("Type 5 to go back to the last screen\n");
        
        System.out.println("What do you want to Find ->\n");
        System.out.println("1] Simple Interest");
        System.out.println("2] Principal");
        System.out.println("3] Rate");
        System.out.println("4] Time");
        System.out.println("5] Back");
        condition = scan.nextInt();
        
        switch (condition)
        {
            case 1:
            si();
            break;
            
            case 2:
            p();
            break;
            
            case 3:
            r();
            break;
            
            case 4:
            t();
            break;
            
            case 5:
            calculator();
            break;
            
            default:
            System.out.println("Choose the correct option");
            interest();
            break;
        }
    }
    static void rec()
    {
        System.out.println("========="+"\n");
        System.out.println("RECTANGLE"+"\n");
        System.out.println("========="+"\n\n");
        
        System.out.println("What do you want to find (Area: a, Perimeter: p)");
        char con1 = scan.next().charAt(0);
        
        System.out.println("\n");
        
        switch(con1)
        {
            case 'a':
            System.out.println("Enter Length"+"\n>> ");
            double l = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("Enter Breadth"+"\n>> ");
            double b = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("Area of Rectangle: "+(l*b));
            break;
            
            case 'p':
            System.out.println("Enter Length"+"\n>> ");
            double l1 = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("Enter Breadth"+"\n>> ");
            double b1 = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("Perimeter of Rectangle: "+(2*(l1+b1)));
            break;
        }
    }
    static void sq()
    {
        System.out.println("======"+"\n");
        System.out.println("SQUARE"+"\n");
        System.out.println("======"+"\n\n");
        
        System.out.println("What do you want to find (Area: a, Perimeter: p)"+"\n>> ");
        char con1 = scan.next().charAt(0);

        System.out.println("\n");
        
        switch (con1)
        {
            case 'a':
            System.out.println("Enter side of the square"+"\n>> ");
            double side = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("The area of square is "+(side*side));
            break;
            
            case 'p':
            System.out.println("Enter perimeter of the square"+"\n>> ");
            double perimeter = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("The perimeter of the square is "+(perimeter/4));
            break;
        }
    }
    static void tri()
    {
        System.out.println("========"+"\n");
        System.out.println("Triangle"+"\n");
        System.out.println("========"+"\n\n");
        
        System.out.println("\n");
        
        System.out.println("What do you want find (Area: a, Perimeter: p)"+"\n>> ");
        char con2 = scan.next().charAt(0);
        
        System.out.println("\n");
        
        switch (con2)
        {
            case 'a':
            System.out.println("Enter base"+"\n>> ");
            double base = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("Enter height"+"\n>> ");
            double height = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("Area od triangle: "+((1/2)*base*height));
            break;
            
            case 'p':
            System.out.println("Enter first side"+"\n>> ");
            double a = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("Enter second side"+"\n>> ");
            double b = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("Enter base"+"\n>> ");
            double c = scan.nextDouble();
            
            System.out.println("\n");
            
            System.out.println("The perimeter of triangle is "+(a+b+c));
            break;
        }
    }
    static void shapes()
    {   
        System.out.println("Which shape do you want (Rectangle: r, Square: s, Triangle: t)");
        char shape = scan.next().charAt(0);
        
        System.out.println("\n");
        
        switch (shape)
        {
            case 'r':
            rec();
            break;
            
            case 's':
            sq();
            break;
            
            case 't':
            tri();
            break;
        }
    }                
    static void calculator()
    {   
        System.out.println("==========");
        System.out.println("CALCULATOR");
        System.out.println("==========\n");       
        
        System.out.println("What do you want to Find ->\n");
        System.out.println("1] Calcultor");
        System.out.println("2] Interest");
        System.out.println("3] Shapes");
        System.out.println("4] Back");
        
        System.out.println("\n>> ");
        int condition = scan.nextInt();
        
        switch (condition)
        {
            case 1:
            cal();
            break;
            
            case 2:
            interest();
            break;
            
            case 3:
            shapes();
            break;
            
            case 4:
            home();
            break;
            
            default:
            System.out.println("choose the right app\n");
            calculator();
            break;
        }
    }
    static void help()
    {
        System.out.println("==== ====");
        System.out.println("DASH HELP");
        System.out.println("==== ====\n");
        
        System.out.println("A] Choose the right number to open an app.");
        
        System.out.println("B] You can only stop the program when you are on the home page.");
        
        System.out.println("C] 'Back' number is not same in all apps and functions.");
        
        home();
    }
    static void about()
    {
        System.out.println("===== ==== ==");
        System.out.println("ABOUT DASH OS");
        System.out.println("===== ==== ==\n");
        
        System.out.println("Dash OS");
        
        System.out.println("Operating_System");    
        
        System.out.println("Created by Aryan Dinakaran on 07/02/20.");
        
        System.out.println("Copyright © 2020 Aryan Dinakaran. All rights reserved.\n"); 
        
        home();
    }
    static void stop()
    {
        System.out.println("Good,bye!");
    }
    static void home()
    {
        int condition;
        
        System.out.println("======= == ==== ==");
        System.out.println("WELCOME TO DASH OS");
        System.out.println("======= == ==== ==\n");
        
        System.out.println("Choose the App by Number\n");
        
        System.out.println("1] Caculator");
        System.out.println("2] Help");
        System.out.println("3] About");
        System.out.println("4] Stop");
        
        System.out.println("\n>> ");
        condition = scan.nextInt();
        
        switch (condition)
        {
            case 1:
            calculator();
            break;
            
            case 2:
            help();
            break;
            
            case 3:
            about();
            break;
            
            case 4:
            stop();
            break;
            
            default:
            System.out.println("Choose the right app");
            home();
            break;
        }
    }    
    public void run()
    {
        home();
    }
}
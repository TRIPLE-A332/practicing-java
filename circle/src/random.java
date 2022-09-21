import java.util.Scanner;

public class random {
    public static void main(String[] args) {
      /*  String str = "programmer@gmail.com";
        System.out.println("does the mailID has gmail in it ");
        int i = str.indexOf('@');
        System.out.print("username - ");
        System.out.println(str.substring( 0,i) );
        System.out.print("Domain name- ");
        String domain = str.substring(i);
        System.out.println(domain);
        System.out.println(  domain.startsWith("@gmail.com"));


        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ( year%4==0)
        { if (year %100==0)
            {
                if (year%400==0){
                    System.out.println("a leap year");
                }else { System.out.println("not"); }

            } else {System.out.println(" a leap year");}

        }else {
            System.out.println("not");
        }
    }

        System.out.println("Enter a no. between 1-7");
        int number = sc.nextInt();
        switch (number){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println();
            case 3 -> System.out.println();
            case 4 -> System.out.println();
            case 5 -> System.out.println();
            case 6 -> System.out.println();
            case 7 -> System.out.println();
            case 8 if (number <= 8) -> System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL");
        String url = sc.nextLine();

        String str = url.substring(0, url.indexOf(":"));
        if (str.equals("https")) {
            System.out.println("hyper text transfer protocol");
        } else {
            System.out.println(" protocol");
        }

       */
        String str="2";
        switch (str) {
            case "1" -> System.out.println("One");
            case "2" -> System.out.println("Two");
            case "3" -> System.out.println("Three");
            default -> System.out.println("Invalid");
        }



    }
}


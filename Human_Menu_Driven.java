import java.util.Scanner;

public class Human_Menu_Driven
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name,gender;
        Human h=new Human();
        int choice=0;
        do {

            if (h.display_Human(null)) {
                System.out.print("\nOperations");
                System.out.print("\n--------------------------------------");
                System.out.print("\n1.Human object ");
                System.out.print("\n0.Exit the system. ");
                System.out.print("\n--------------------------------------");
                System.out.print("\n:");
                choice=sc.nextInt();//choice
            }else{
                System.out.print("\nOperations");
                System.out.print("\n--------------------------------------");
                System.out.print("\n1.Human object ");
                System.out.print("\n2.Display already set human details. ");
                System.out.print("\n3.Update details.");
                System.out.print("\n0.Exit the system. ");
                System.out.print("\n--------------------------------------");
                System.out.print("\n:");
                choice=sc.nextInt();//choice
            }
            //menu
            //switch
            switch(choice)
            {
                case 1:
                    System.out.print("\nEnter name:");
                    name=sc.next();
                    System.out.print("\nEnter gender:");
                    gender=sc.next();
                    h.set_Human(name,gender);
                    System.out.print("\ninput save...");
                    break;
                case 2:
                    h.display_Human();
                    break;
                case 3:
                    h.display_Human();
                    System.out.print("\n1.change name\n2.change gender\n:");
                    int ch=sc.nextInt();
                    if(ch==1)
                    {
                        System.out.print("\nEnter name:");
                        name=sc.next();
                        gender=h.get_gender();
                        h.set_Human(name,gender);
                        System.out.print("\nUpdated");

                    }
                    else if(ch==2)
                    {
                        System.out.print("\nEnter gender:");
                        gender=sc.next();
                        name=h.get_name();
                        h.set_Human(name,gender);
                        System.out.print("\nUpdated");
                    }
                    else
                    {
                        System.out.print("\nWrong option");
                    }
                    break;
                case 0:
                    System.out.print("\nExiting the system ");
                    break;
                default:
                    System.out.print("\nWrong option");
                    break;
            }

        }while(choice!=0);

        sc.close();

    }
}

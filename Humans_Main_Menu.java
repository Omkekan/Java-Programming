import java.util.Scanner;

public class Humans_Main_Menu {

    public static void main(String[] args)
    {
        Humans1 h[]=new Humans1[10];//We created an array of objects but each object did not get its own memory.
        Scanner sc = new Scanner(System.in);
        int index=0;
        String name,gender,adhar;
        int choice=0;
        do {
            System.out.print("\nHuman management system ");
            System.out.print("\n--------------------------------------");
            System.out.print("\n1.New Human Registration");
            System.out.print("\n2.Display List");
            System.out.print("\n3.Search Human by Adhar");
            System.out.print("\n4.Delete Human by Adhar");
            System.out.print("\n0.Exit the system. ");
            System.out.print("\n--------------------------------------");
            System.out.print("\n:");
            choice=sc.nextInt();//choice
            //switch
            switch(choice)
            {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter name:");
                    name=sc.nextLine();
                    sc.nextLine();//escape line use enter to go to next
                    System.out.println("Enter gender:");
                    gender=sc.next();
                    System.out.println("Enter adhar card number:");
                    adhar=sc.next();
                    h[index]=new Humans1();//We allocated a memory block for a human object.
                    h[index].set_Humans(name,gender,adhar);
                    index++;
                    break;
                case 2:
                    for(int i=0;i<index;i++)
                        h[i].display_Humans();
                    break;
                case 3:
                    //read adhar
                    //search is found then display else not found
                    System.out.println("Enter adhar card number to search:");
                    adhar=sc.next();
                    boolean found=false;
                    for(int i=0;i<index;i++)
                    {
                        if(adhar.equals(h[i].get_adhar()))//adhar==h[i].get_adhar()
                        {
                            h[i].display_Humans();
                            found = true;
                        }
                    }
                    if(found==false)
                        System.out.print("\nGiven details not found in record. ");
                    break;
                case 4:
                    System.out.println("Enter adhar card number to search:");
                    adhar=sc.next();
                    boolean deleted=false;
                    for(int i=0;i<index;i++)
                    {
                        if(adhar.equals(h[i].get_adhar()))//adhar==h[i].get_adhar()
                        {
                            for(int j=i; j< index-1; j++){
                                h[j] = h[j + 1];
                                
                            }
                            
                            // h[index - 1] = null;
                            index--;
                            deleted= true;
                            System.out.println("\nRecord deleted successfully.");
                            break;
                        }
                    }
                    if(deleted==false)
                        System.out.print("\nGiven details not found in record. ");
                    break;
                case 0:
                    System.out.print("\nExiting the system...... ");
                    break;
                default:
                    System.out.print("\nWrong option");
                    break;
            }


        }while(choice!=0);

        sc.close();

    }

}
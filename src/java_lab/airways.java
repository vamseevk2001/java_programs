package java_lab;
import java.util.Scanner;
public class airways {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            Boolean[]r=new Boolean[10];
            int first_class=0;
            int economy_class=5;
            int exit;
            do{
                System.out.print("Please type 1 for First Class and Please type 2 for Economy: ");
                int section=input.nextInt();

                switch(section){
                    case 1:
                        System.out.println();
                        System.out.println("YOUR SEATS IS IN THE FIRST CLASS SECTION.");
                        first_class++;
                        if (first_class<=5){
                            System.out.println("Your seat number is "+first_class);
                        }
                        else{
                            System.out.println();
                            System.out.println("The first class section is full.");
                            System.out.println("Do you want to be placed at the economy section?(1.yes\t2.no)");
                            int full=input.nextInt();
                            if (full==1){
                                System.out.println("Press 1 to go to the main menu.");
                            }
                            else{
                                System.out.println("next flight leaves in 3 hours.");
                            }
                        }
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("YOUR SEATS IS IN THE ECONOMY SECTION.");
                        economy_class++;
                        if ((economy_class>5)&&(economy_class<=10)){

                            System.out.println("Your seat number is "+economy_class);
                            System.out.println();
                        }

                        else{
                            System.out.println();
                            System.out.println("The economy class section is full.");
                            System.out.println("Do you want to be placed at the first class section?(1.yes\t2.no)");
                            int full=input.nextInt();
                            if (full==1){
                                System.out.println("Press 1 to go to the main menu.");
                            }
                            else{
                                System.out.println("next flight leaves in 3 hours.");
                            }
                        }
                }
                System.out.println();
                System.out.println("1.main menu\t2.exit");
                exit=input.nextInt();
            }while (exit==1);
            System.out.println();
            System.out.println("~~~~Enjoy your journey!!~~~~~~");
        }
    }


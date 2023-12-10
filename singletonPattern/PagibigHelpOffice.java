package singletonPattern;
import java.util.Scanner;

public class PagibigHelpOffice {

    public static void main(String[] args) {

        CentralizedQueuingSystem queueSystem = CentralizedQueuingSystem.getInstance();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nPag-Ibig Help Desk");
            System.out.println("Please Choose From The Option Below: ");
            System.out.println("\n1. Display Queue of...");
            System.out.println("2. Reset Queue Number of...");
            System.out.println("3. Add Number to Queue of...");
            System.out.println("4. Shutdown Control Panel");
            System.out.print("Enter Choice: ");
            int choice = input.nextInt();

            switch (choice) {

                case 1: {

                    System.out.println("\nDisplaying Queue number of Helpdesk...");
                    System.out.println("\n1. Helpdesk 1");
                    System.out.println("2. Helpdesk 2");
                    System.out.println("3. Helpdesk 3");
                    System.out.print("Enter Choice: ");
                    choice = input.nextInt();

                    if (choice == 1) {

                        queueSystem.displayQueueNumber(choice);

                    }

                    if (choice == 2) {

                        queueSystem.displayQueueNumber(choice);

                    }

                    if (choice == 3) {

                        queueSystem.displayQueueNumber(choice);

                    }

                    break;

                }

                case 2: {

                    System.out.println("\nReset Queue Number of Helpdesk...");
                    System.out.println("\n1. Helpdesk 1");
                    System.out.println("2. Helpdesk 2");
                    System.out.println("3. Helpdesk 3");
                    System.out.print("Enter Choice: ");
                    choice = input.nextInt();

                    if (choice == 1) {

                        queueSystem.resetQueueNumber(choice);

                    }

                    if (choice == 2) {

                        queueSystem.resetQueueNumber(choice);

                    }

                    if (choice == 3) {

                        queueSystem.resetQueueNumber(choice);

                    }

                    break;

                }

                case 3: {

                    System.out.println("\nAdd Number to Queue of Helpdesk...");
                    System.out.println("\n1. Helpdesk 1");
                    System.out.println("2. Helpdesk 2");
                    System.out.println("3. Helpdesk 3");
                    System.out.print("Enter Choice: ");
                    choice = input.nextInt();

                    if (choice == 1) {

                        queueSystem.increaseQueueNumber(choice);

                    }

                    if (choice == 2) {

                        queueSystem.increaseQueueNumber(choice);

                    }

                    if (choice == 3) {

                        queueSystem.increaseQueueNumber(choice);

                    }

                    break;

                }

                case 4: {

                    System.exit(0);

                }

            }
        }

    }
}

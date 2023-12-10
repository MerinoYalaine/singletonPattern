package singletonPattern;

public class CentralizedQueuingSystem {
    private static CentralizedQueuingSystem instance;
    private int helpdeskAQueue;
    private int helpdeskBQueue;
    private int helpdeskCQueue;

    private CentralizedQueuingSystem(){

        helpdeskAQueue = 0;
        helpdeskBQueue = 0;
        helpdeskCQueue = 0;

    }

    public static synchronized CentralizedQueuingSystem getInstance() {

        if (instance == null) {

            instance = new CentralizedQueuingSystem();

        }

        return instance;

    }

    public synchronized void displayQueueNumber(int choice) {

        switch (choice) {

            case 1: {

                System.out.println("Number of Queued Today for Help Desk A: " + helpdeskAQueue);
                break;

            }

            case 2: {

                System.out.println("Number of Queued Today for Help Desk B: " + helpdeskBQueue);
                break;

            }

            case 3: {

                System.out.println("Number of Queued Today for Help Desk C: " + helpdeskCQueue);
                break;

            }

        }

    }

    public synchronized void resetQueueNumber(int helpdesk) {

        switch (helpdesk) {

            case 1: {

                helpdeskAQueue = 0;
                System.out.println("Number of Queued Today for Help Desk C is Resetted: " + helpdeskAQueue);
                break;

            }

            case 2: {

                helpdeskBQueue = 0;
                System.out.println("Number of Queued Today for Help Desk C is Resetted: " + helpdeskBQueue);
                break;

            }

            case 3: {

                helpdeskCQueue = 0;
                System.out.println("Number of Queued Today for Help Desk C is Resetted: " + helpdeskCQueue);
                break;

            }

        }

    }

    public synchronized void increaseQueueNumber(int choice) {

        switch (choice) {

            case 1: {

                helpdeskAQueue++;
                System.out.println("\nQueue Number has increased.");
                System.out.println("Number of Queued Today for Help Desk A: " + helpdeskAQueue + "\n");
                break;

            }

            case 2: {

                helpdeskBQueue++;
                System.out.println("\nQueue Number has increased.");
                System.out.println("Number of Queued Today for Help Desk B: " + helpdeskBQueue + "\n");
                break;

            }

            case 3: {

                helpdeskCQueue++;
                System.out.println("\nQueue Number has increased.");
                System.out.println("Number of Queued Today for Help Desk C: " + helpdeskCQueue + "\n");
                break;

            }

        }

    }

}

import Models.Workers.Worker;
import Database.Workers;

import java.util.Scanner;


public class MainClass {

    public static void main(String[] args) throws InterruptedException {


        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------------");
            System.out.println("Welcome to the Company Panel. Please select an action.");
            System.out.println("------------------------------------");
            System.out.println("1-Employee Transactions\n" +
                    "2-View All Employees\n" +
                    "3-View All Employees in the Department\n" +
                    "4-Exit");
            System.out.println("------------------------------------");
            System.out.print("Process :");
            int vote1 = input.nextInt();
            System.out.println("Your transaction is being processed, please wait...");
            Thread.sleep(1500);
            if (vote1 == 1) {
                while (true) {
                    System.out.println("---------------------------------");
                    System.out.println("Welcome to the Employee Transactions Panel, please select a transaction.");
                    System.out.println("1-Add Employee\n" +
                            "2-Delete Employee\n" +
                            "3-Give a raise\n" +
                            "4-Previous Menu");
                    System.out.print("Process :");
                    int vote2 = input.nextInt();
                    System.out.println("Your transaction is being processed, please wait...");
                    Thread.sleep(1000);
                    if (vote2 == 1) {
                        System.out.print("Please enter your name and surname:");
                        String workerNameSurname = stringInput.nextLine();
                        System.out.print("Please enter salary:");
                        int workerWage = input.nextInt();
                        System.out.print("Please enter the department code:");
                        String workerDepartmentCode = stringInput.nextLine();
                        new Worker(workerNameSurname, workerWage, workerDepartmentCode);
                        System.out.println("The employee was added successfully. You are transferred to the previous menu...");
                        Thread.sleep(1000);
                        break;
                    } else if (vote2 == 2) {
                        System.out.print("Please enter the ID of the employee you want to delete:");
                        String workerId = stringInput.nextLine();
                        Workers.deleteWorkerWithId(workerId);
                        System.out.println(workerId + " It was deleted successfully. You are transferred to the Previous Menu....");
                        Thread.sleep(1000);
                        break;
                    } else if (vote2 == 3) {
                        System.out.print("Please enter the ID of the employee you want to give a raise to:");
                        String workerId = stringInput.nextLine();
                        Worker.raise(workerId);
                        System.out.println("The operation was completed successfully, you are transferred to the previous menu.");
                        Thread.sleep(1000);
                        break;
                    } else if (vote2 == 4) {
                        System.out.println("Your transaction is being processed, please wait...\n");
                        Thread.sleep(1000);
                        break;
                    } else {
                        System.out.println("You made a wrong choice, please try again.");
                    }
                }
            } else if (vote1 == 2) {
                System.out.print("All employees are listed...");
                for (int i = 0; i < 20; i++) {
                    Thread.sleep(100);
                    System.out.print(">");
                }
                System.out.println(" ");

                System.out.println("------------------------------------");
                Workers.printWorkers();
                System.out.println("------------------------------------");
            } else if (vote1 == 3) {
                System.out.print("Please enter the department code:");
                String departmentCode = stringInput.nextLine();
                System.out.print("All employees are listed...");
                for (int i = 0; i < 20; i++) {
                    Thread.sleep(100);
                    System.out.print(">");
                }
                System.out.println(" ");
                System.out.println("------------------------------------");
                Workers.printDepartmentWorkers(departmentCode);
                System.out.println("------------------------------------");
            } else {
                System.out.print("You have logged out successfully, we wish you a good day.");
                break;
            }

        }

    }

}

package Database;

import Models.Workers.Worker;
import Models.Departments.Department;

import java.util.ArrayList;

public class Workers {

    private static ArrayList<Worker> workerList = new ArrayList<>();

    // Get the all workers
    public static ArrayList<Worker> getWorkerList() {
        return workerList;
    }

    // Worker add
    public static void addWorker(Worker worker) {
        Workers.workerList.add(worker);
    }


    // Delete worker
    public static void deleteWorkerWithId(String workerId) {
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getWorkerıd().equals(workerId)) {
                workerList.remove(workerList.get(i));
            }
        }
    }

    // By giving the department code, you can print the employees in that department on the console.
    public static void printDepartmentWorkers(String departmentCode) {

        Department d = null;
        for (Department department : Departments.getDepartmanList()) {
            if (department.getDepartmentCode().equals(departmentCode)) {
                d = department;
            }
        }
        for (Worker worker : workerList) {
            if (worker.getDepartman() == d) {
                System.out.println(worker);
            }
        }
    }


    // To print employees to the console
    public static void printWorkers() {
        for (Worker worker : workerList) {
            System.out.println(worker.toString());
        }
    }


}

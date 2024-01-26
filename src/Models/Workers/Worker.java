package Models.Workers;

import Models.Departments.Department;
import Database.Workers;
import Database.Departments;

import java.util.ArrayList;

public class Worker {

    private String workerıd;
    private String nameSurname;
    private int wage;
    private Department Department;
    private String nameCode = "";

    public Worker(String nameSurname, int wage, String departmentCode) {
        this.workerıd = nameSurname;
        this.wage = wage;
        this.setDepartment(departmentCode);
        this.setworkerıd();
        Workers.addWorker(this);
    }

    private void setDepartment(String depKodu) {
        for (Department d : Departments.getDepartmanList()) {
            if (d.getDepartmentCode().equals(depKodu)) {
                this.Department = d;
            }
        }
    }


    private void setworkerıd() {
        this.workerıd = this.Department.getDepartmentCode() + (Workers.getWorkerList().size() + 1) + this.getWorkerNameCode();
    }

    private String getWorkerNameCode() {
        this.nameCode += this.nameSurname.charAt(0);

        for (int i = 0; i < this.nameSurname.length(); i++) {
            if (nameSurname.charAt(i) == ' ') {
                this.nameCode += nameSurname.charAt(i + 1);
            }
        }
        return this.nameCode;
    }


    public String getWorkerıd() {
        return this.workerıd;
    }

    public Department getDepartman() {
        return this.Department;
    }

    // For give a department name
    public String getDepartmentName() {
        String department = "";
        if (this.Department.getDepartmentCode().equals("YD")) {
            department = "Yönetim Departmanı";
        } else if (this.Department.getDepartmentCode().equals("BTD")) {
            department = "Bilişim Teklonojileri Departmani";
        } else if (this.Department.getDepartmentCode().equals("IKD")) {
            department = "Insan Kaynaklari Departmani";
        }
        return department;
    }

    public static void raise(String workerıd) {
        ArrayList<Worker> workerList = Workers.getWorkerList();
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getWorkerıd().equals(workerıd)) {
                workerList.get(i).wage += (workerList.get(i).wage * workerList.get(i).Department.getRaiseRate()) / 100;
            }
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerıd='" + workerıd + '\'' +
                ", nameSurname='" + nameSurname + '\'' +
                ", wage=" + wage +
                ", Department=" + Department +
                ", nameCode='" + nameCode + '\'' +
                '}';
    }
}


































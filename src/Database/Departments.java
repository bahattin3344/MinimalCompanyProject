package Database;

import Models.Departments.InformationTechnologiesDepartment;
import Models.Departments.Department;
import Models.Departments.HumanResourcesDepartment;
import Models.Departments.ManagementDepartment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Departments {


    //We should think of this as a database,so when the project runs, the database must be created first.
    //so we can easily add and remove, so we give it static and departmentList

    static private final Department INFORMATION_TECHNOLOGIES_DEPARTMENT = new InformationTechnologiesDepartment();
    static private final Department MANAGEMENT_DEPARTMENT = new ManagementDepartment();
    static private final Department HUMAN_RESOURCES_DEPARTMENT = new HumanResourcesDepartment();
    static private List<Department> departmentList = new ArrayList<>(Arrays.asList(INFORMATION_TECHNOLOGIES_DEPARTMENT, MANAGEMENT_DEPARTMENT, HUMAN_RESOURCES_DEPARTMENT));

    public static List<Department> getDepartmanList() {
        return departmentList;
    }


}

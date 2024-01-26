package Models.Departments;

public class ManagementDepartment implements Department {

    final String departmentCode = "YD";
    final int raiseRate = 30;

    @Override
    public int getRaiseRate() {
        return raiseRate;
    }

    @Override
    public String getDepartmentCode() {
        return departmentCode;
    }
}

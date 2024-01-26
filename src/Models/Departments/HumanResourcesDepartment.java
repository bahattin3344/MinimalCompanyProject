package Models.Departments;

public class HumanResourcesDepartment implements Department {

    final String departmentCode = "IKD";
    final int zamOrani = 20;

    @Override
    public int getRaiseRate() {
        return zamOrani;
    }

    @Override
    public String getDepartmentCode() {
        return departmentCode;
    }
}

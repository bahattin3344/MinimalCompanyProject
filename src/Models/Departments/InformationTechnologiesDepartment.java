package Models.Departments;

public class InformationTechnologiesDepartment implements Department {

    final String departmentCode = "BTD";
    final int raieseRate = 25;


    @Override
    public int getRaiseRate() {
        return raieseRate;
    }

    @Override
    public String getDepartmentCode() {
        return departmentCode;
    }
}

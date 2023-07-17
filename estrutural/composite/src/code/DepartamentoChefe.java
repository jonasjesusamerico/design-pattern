package code;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoChefe implements Departamento {

    private Integer id;
    private String name;

    private List<Departamento> childDepartments;

    public DepartamentoChefe(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }


    @Override
    public void imprimirNomeDepartamento() {
        System.out.println(getClass().getSimpleName());
        childDepartments.forEach(Departamento::imprimirNomeDepartamento);
    }

    public void addDepartment(Departamento departamento) {
        childDepartments.add(departamento);
    }

    public void removeDepartment(Departamento departamento) {
        childDepartments.remove(departamento);
    }

}

import code.*;

public class Main {
    public static void main(String[] args) {

        Departamento departamentoVedas = new DepartamentoVendas(1, "departamentoVedas");
        Departamento departamentoFinanceiro = new DepartamentoFinanceiro(2, "departamentoFinanceiro");
        DepartamentoChefe departamentoChefe = new DepartamentoChefe(3, "departamentoChefe");

        DepartamentoChefeMaior departamentoChefeMaior = new DepartamentoChefeMaior(1, "Departamento chefe maior");

        departamentoChefe.addDepartment(departamentoVedas);
        departamentoChefe.addDepartment(departamentoFinanceiro);

        departamentoChefeMaior.addDepartment(departamentoChefe);
        departamentoChefeMaior.imprimirNomeDepartamento();
    }

}
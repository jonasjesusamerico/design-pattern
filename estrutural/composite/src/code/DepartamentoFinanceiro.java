package code;

public class DepartamentoFinanceiro implements Departamento {

    private Integer id;
    private String name;

    public DepartamentoFinanceiro(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void imprimirNomeDepartamento() {
        System.out.println(getClass().getSimpleName());
    }
}

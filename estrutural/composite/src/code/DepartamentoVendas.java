package code;

public class DepartamentoVendas implements Departamento {

    private Integer id;
    private String name;

    public DepartamentoVendas(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void imprimirNomeDepartamento() {
        System.out.println(getClass().getSimpleName());
    }
}

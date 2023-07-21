package lazy;

class LazyProdutoDAO implements IProdutoDAO {

    private IProdutoDAO daoReal;

    @Override
    public Object find(long id) {
        inicializaDAO();
        return daoReal.find(id);
    }

    private void inicializaDAO() {
        if (daoReal == null) {
            daoReal = new ProdutoDAO();
        }
    }

}

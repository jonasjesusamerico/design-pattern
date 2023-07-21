package cache;

import java.util.HashMap;

class CacheProdutoDAO extends ProdutoDAO {

    private static final HashMap<Long, Object> CACHE = new HashMap<>();

    @Override
    public Object find(long id) {
        Object o = CACHE.get(id);
        if (o == null) {
            o = super.find(id);
            CACHE.put(id, o);
            return o;
        }
        System.out.println("Busca objeto no cache.");
        return o;
    }

}
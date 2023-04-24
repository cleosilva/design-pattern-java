package dio.gof;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 * @author CLEOSILVA
 * */
public class SingletonLazyHolder {

    private static class InstanceHoler {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHoler.instancia;
    }
}

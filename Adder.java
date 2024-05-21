import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Adder extends UnicastRemoteObject implements AddServerInterface {

    protected Adder() throws RemoteException {
        super();
    }

    @Override
    public int sum(int x, int y) throws RemoteException {
        return x + y;
    }
}


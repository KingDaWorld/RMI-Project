import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddServerInterface extends Remote {
    int sum(int x, int y) throws RemoteException;
}


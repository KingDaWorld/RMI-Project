import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class AddServer {
    public static void main(String args[]) {
        try {
            // Create and start the registry on port 1300
            LocateRegistry.createRegistry(1300);

            // Create an instance of the remote object
            AddServerInterface addService = new Adder();

            // Bind the remote object to the name "AddService"
            Naming.rebind("rmi://localhost:1300/AddService", addService);

            System.out.println("AddServer is ready.");
        } catch (Exception e) {
            System.out.println("AddServer failed: " + e);
        }
    }
}

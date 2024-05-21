import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Look up the remote object from the RMI registry
            AddServerInterface addService = (AddServerInterface) Naming.lookup("rmi://localhost:1300/AddService");

            // Invoke the remote method
            int result = addService.sum(5, 3);
            System.out.println("Sum: " + result);
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}


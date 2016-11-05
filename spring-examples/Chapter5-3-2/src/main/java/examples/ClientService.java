package examples;

public class ClientService {

    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {
        System.out.println("执行了ClientService createInstance（）方法!");
        return clientService;
    }
}

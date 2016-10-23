package examples;

public class DefaultServiceLocator {

    private static ConnectService  connectService = new  ConnectServiceImpl();

    private  static  AccountService  accountService = new  AccountServiceImpl();

    public  DefaultServiceLocator(){}

    public ConnectService  createConnectServiceInstance(){
        System.out.println("factory  instance  method  is created  connectService........");
        return  connectService;
    }

    public  AccountService   createAccountServiceInstance(){
        System.out.println("factory instace method is  created  createAccountServiceInstance...........");
        return    accountService;
    }

}

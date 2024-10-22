import proxy.BankWebService;
import proxy.BankWebService_Service;

public class client {
    public static void main(String[] args) {
       BankWebService bankWebService_middleware = new BankWebService_Service().getBankWebServicePort();

        System.out.println(bankWebService_middleware.convertir(10.0));
    }
}

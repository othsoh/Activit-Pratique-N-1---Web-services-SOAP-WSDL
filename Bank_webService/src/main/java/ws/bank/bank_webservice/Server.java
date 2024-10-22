package ws.bank.bank_webservice;

import jakarta.xml.ws.Endpoint;
import ws.bank.bank_webservice.Bank_WebService;



public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/", new Bank_WebService());
    }
}

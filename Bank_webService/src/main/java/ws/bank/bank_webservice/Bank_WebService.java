package ws.bank.bank_webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService (serviceName = "BankWebService")
public class Bank_WebService {
    @WebMethod (operationName = "Convertir")
    public double Convertir(@WebParam double montant){
        return montant * 10.0;
    }

    @WebMethod
    public Account getAccount(@WebParam(name = "code") Long id){
        return new Account(id,Math.random()*1000,new Date());
    }

    @WebMethod
    public List<Account> getAccounts(){
        return List.of(new Account(1L,Math.random()*1000,new Date()),
                new Account(2L,Math.random()*1000,new Date()),
                new Account(3L,Math.random()*1000,new Date()));
    }
}

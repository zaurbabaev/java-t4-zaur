package az.edu.itbrains.atm2.model;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    public static double amount=0;

    public Map<String, Customer> customerMap;

   public Bank(){
        customerMap=new HashMap<String,Customer>();
    }

}

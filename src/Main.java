import com.ajay.customer.Bank;
import com.ajay.customer.Customer;
import com.ajay.customer.FileHandler;

import javax.imageio.IIOException;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileHandler fh=new FileHandler();
        try {
            fh.initialize();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(Customer cus: Bank.customers){
            System.out.println(cus.Name);
        }
    }
}
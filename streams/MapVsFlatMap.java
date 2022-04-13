package streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();

        //Data Transformation : List<Customer> => List<String>
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail() : one to one mapping
        List<String> emails = customers
                .stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println("map operation output:");
        System.out.println(emails);

        //customer -> customer.getPhoneNumbers() : one to many mapping
        List<List<String>> phoneNos = customers
                .stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNos);

        List<String> phoneNumbers = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("flatMap operation output:");
        System.out.println(phoneNumbers);
    }
}

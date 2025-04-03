// The purpose of this class is to load in customer data


package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner {

    private CustomerRepository customerRepository;

    private DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer customer1 = new Customer();
        customer1.setFirstName("Spongebob");
        customer1.setLastName("Squarepants");
        customer1.setPostal_code("11111");
        customer1.setAddress("103 Bikini Bottom Road");
        customer1.setPhone("(713)111-1111");
        customer1.setDivision(divisionRepository.findAll().get(1));
        customer1.setCreate_date(new Date());
        customer1.setLast_update(new Date());
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstName("Peter");
        customer2.setLastName("Griffin");
        customer2.setPostal_code("22222");
        customer2.setAddress("888 Spooner Street");
        customer2.setPhone("(713)222-2222");
        customer2.setDivision(divisionRepository.findAll().get(2));
        customer2.setCreate_date(new Date());
        customer2.setLast_update(new Date());
        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        customer3.setFirstName("Hank");
        customer3.setLastName("Hill");
        customer3.setPostal_code("33333");
        customer3.setAddress("333 Rainey Street");
        customer3.setPhone("(713)333-3333");
        customer3.setDivision(divisionRepository.findAll().get(3));
        customer3.setCreate_date(new Date());
        customer3.setLast_update(new Date());
        customerRepository.save(customer3);

        Customer customer4 = new Customer();
        customer4.setFirstName("Homer");
        customer4.setLastName("Simpson");
        customer4.setPostal_code("44444");
        customer4.setPhone("(713)444-4444");
        customer4.setAddress("742 Evergreen Terrace");
        customer4.setDivision(divisionRepository.findAll().get(4));
        customer4.setCreate_date(new Date());
        customer4.setLast_update(new Date());
        customerRepository.save(customer4);

        Customer customer5 = new Customer();
        customer5.setFirstName("Randy");
        customer5.setLastName("Marsh");
        customer5.setPostal_code("55555");
        customer5.setAddress("555 Tegrity Farms");
        customer5.setPhone("(713)555-3141");
        customer5.setDivision(divisionRepository.findAll().get(5));
        customer5.setCreate_date(new Date());
        customer5.setLast_update(new Date());
        customerRepository.save(customer5);

        System.out.println("Started om Bootstrap");
        System.out.println("Number of Customers: !" + customerRepository.count());
    }
}

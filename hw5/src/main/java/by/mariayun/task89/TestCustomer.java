package by.mariayun.task89;

import by.mariayun.task89.bean.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Customer customer = context.getBean("customer", Customer.class);
        customer.topUp();
        customer.withdraw();

    }
}

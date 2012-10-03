package com.bitblend.wtt;

import com.bitblend.wtt.domain.ServiceItem;
import com.bitblend.wtt.persistence.ServiceItemRepository;
import java.util.Iterator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = 
    		new ClassPathXmlApplicationContext("repository-context.xml");

        ServiceItemRepository repository = context.getBean(ServiceItemRepository.class);

//        ServiceItem serviceItem = new ServiceItem();
//        serviceItem.setId("1");
//        serviceItem.setDescription("Test-INC");
//        serviceItem.setNumber("401-02-999999");
//
//        repository.save(serviceItem);
//        
//        ServiceItem si = repository.findOne("1");
//        System.out.println("[Salida] " + si.toString());
        
        for (Iterator<ServiceItem> it = repository.findAll().iterator(); it.hasNext();) {
            ServiceItem s2 = it.next();
            System.out.println(s2.toString());
        }
    }
}

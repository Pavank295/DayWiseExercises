package com.wipro.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wipro.example.AppConfig;
import com.wipro.model.Mobile;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Mobile mobile = context.getBean(Mobile.class);
        System.out.println(mobile);
    }
}

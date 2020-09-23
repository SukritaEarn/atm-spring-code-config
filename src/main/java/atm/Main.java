package atm;

import atm.config.ATMConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);
        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
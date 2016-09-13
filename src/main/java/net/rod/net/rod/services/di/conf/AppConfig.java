package net.rod.net.rod.services.di.conf;

import net.rod.services.MessagePrintServices;
import net.rod.services.net.rod.services.impl.ConsoleMessagePrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Rod on 9/13/2016.
 */
@Configuration
public class AppConfig {

    @Bean
    public MessagePrintServices messagePrintServices(){
        return new ConsoleMessagePrinter();
    }
}

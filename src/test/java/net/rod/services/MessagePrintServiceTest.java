package net.rod.services;

import net.rod.demo.vo.MessageVO;
import net.rod.services.net.rod.services.impl.ConsoleMessagePrinter;

/**
 * Created by Rod on 9/13/2016.
 */
public class MessagePrintServiceTest {

    @Test
    public void testPrintMessage(){
        MessagePrintServices services = new ConsoleMessagePrinter();
        services.printMessage(new MessageVO("Hello","World"));
    }
}

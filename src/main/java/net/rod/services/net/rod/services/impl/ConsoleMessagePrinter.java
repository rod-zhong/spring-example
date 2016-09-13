package net.rod.services.net.rod.services.impl;

import net.rod.demo.vo.MessageVO;
import net.rod.services.MessagePrintServices;

/**
 * Created by Rod on 9/13/2016.
 */
public class ConsoleMessagePrinter implements MessagePrintServices {
    public void printMessage(MessageVO messageVO) {
        println(messageVO.getMessageTitle()+"=>"+messageVO.getMessageContent());
    }
}

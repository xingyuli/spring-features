package org.swordess.toy.spring.internationalization;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class Example {

    private MessageSource messages;

    public void setMessages(MessageSource messages) {
        this.messages = messages;
    }

    public void execute() {
        String message = messages.getMessage("greeting", new Object[]{ "Internationalization" }, Locale.getDefault());
        System.out.println(message);
    }

}

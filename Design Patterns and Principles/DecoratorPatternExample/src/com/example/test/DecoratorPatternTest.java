package com.example.test;

import com.example.notifier.*;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        // Create an EmailNotifier instance
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the EmailNotifier with SMS and Slack notifications
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackSmsAndEmailNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);

        // Send notifications via multiple channels
        slackSmsAndEmailNotifier.send("Hello, World!");
    }
}
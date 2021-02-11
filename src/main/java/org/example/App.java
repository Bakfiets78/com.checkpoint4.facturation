package org.example;

import org.example.controller.InvoiceControllerInterface;
import org.example.controller.InvoiceControllerKeyboard;
import org.example.controller.InvoiceControllerDouchette;
import org.example.controller.InvoiceControllerWeb;
import org.example.repository.InvoiceRepositoryInterface;
import org.example.repository.InvoiceRepositoryMemory;
import org.example.repository.InvoiceRepositoryDatabase;
import org.example.service.InvoiceServiceInterface;
import org.example.service.InvoiceServiceNumber;
import org.example.service.InvoiceServicePrefix;
import sun.tools.java.ClassPath;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext (configLocation: "applicationContext.xml");
        context.getBean()

        invoiceController.createInvoice();
}}
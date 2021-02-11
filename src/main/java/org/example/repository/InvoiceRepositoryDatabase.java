package org.example.repository;

import org.example.entity.Invoice;

import java.sql.SQLOutput;


public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface{


    public void create(Invoice invoice){
        System.out.println("Database: Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());

    }
}

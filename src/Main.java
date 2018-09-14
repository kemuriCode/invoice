import model.Invoice;
import model.InvoicePosition;
import model.Product;

public class Main {

    public static void main(String[] args) {

        Invoice invoice = new Invoice();
        invoice.addPosition(new Product("ABC123", "Tv", 10000));
        invoice.addPosition(new Product("ABC123", "Tv", 10000));
        invoice.addPosition(new Product("CBA321", "Radio", 500));
        invoice.addPosition(new Product("ABC123", "Tv", 10000));
        invoice.addPosition(new Product("CBA321", "Radio", 500));
        printoutInvoice(invoice);

/*
        Product product = new Product("ABC123","TV",1000);
        InvoicePosition position = new InvoicePosition(product);
        Invoice invoice = new Invoice();
        invoice.addPosition(position);
        printoutInvoice(invoice);
*/

/*        System.out.println("Code: " + product.getCode());
        System.out.println("Name: " + product.getName());
        System.out.println("Prize: " + product.getPrice());

        System.out.println("Stawka VAT: " + InvoicePosition.TAX_5);
        System.out.println("Stawka VAT: " + InvoicePosition.TAX_8);
        System.out.println("Stawka VAT: " + InvoicePosition.TAX_23);*/

    }

    public static void printoutInvoice(Invoice invoice){
        System.out.println("NAZWA\t|ILOŚĆ\t|CENA NETTO\t|CEMA BRUTTO\t|STAWKA VAT\t|PODATEK");
        System.out.println("******************************************************************");
        for(InvoicePosition p: invoice.getPositions()) {
            System.out.print("|" + p.getProduct().getName() + "\t|");
            System.out.print(p.getCount() + "\t|");
            System.out.print(p.getNettoPrice() + "\t\t|");
            System.out.print(p.getGrossPrice() + "\t\t|");
            System.out.print(p.getTax() + "\t\t|");
            System.out.println(p.getTaxValue());
            System.out.println("------------------------------------------------------------------");
        }
    }
    }

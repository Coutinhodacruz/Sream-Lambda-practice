package chapter17.excersise;

import java.util.Comparator;
import java.util.stream.Stream;

public class InvoiceStreamManipulation {
    public static void main(String[] args) {
        Invoice[] invoices = {
                new Invoice("83", "Electric Sander", 7, 57.98),
                new Invoice("24", "Power Saw", 18, 99.99),
                new Invoice("7", "Sledge Hammer", 11, 21.50),
                new Invoice("77", "Hammer", 76, 11.99),
                new Invoice("39", "Lawn Mower", 3, 79.50),
                new Invoice("68", "Screwdriver", 106, 6.99),
                new Invoice("56", "Jig Saw", 21, 11.00),
                new Invoice("3", "Wrench", 34, 7.50)
        };

        System.out.println("Sorted by partDescription:");
        sortByPartDescription(invoices);

        System.out.println("\nSorted by pricePerItem:");
        sortByPricePerItem(invoices);

        System.out.println("\nSorted by quantity:");
        sortByQuantity(invoices);

        System.out.println("\nMapped to partDescription and quantity, sorted by quantity:");
        mapAndSortByQuantity(invoices);

        System.out.println("\nMapped to partDescription and value, sorted by value:");
        mapAndSortByValue(invoices);

        System.out.println("\nFiltered by value range of $200 to $500:");
        filterByValueRange(invoices);

        System.out.println("\nInvoice with partDescription containing the word \"saw\":");
        findInvoiceByPartDescription(invoices);
    }

    private static void sortByPartDescription(Invoice[] invoices) {
        Stream.of(invoices)
                .sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(System.out::println);
    }

    private static void sortByPricePerItem(Invoice[] invoices) {
        Stream.of(invoices)
                .sorted(Comparator.comparing(Invoice::getPricePerItem))
                .forEach(System.out::println);
    }

    private static void sortByQuantity(Invoice[] invoices) {
        Stream.of(invoices)
                .sorted(Comparator.comparingInt(Invoice::getQuantity))
                .forEach(System.out::println);
    }

    private static void mapAndSortByQuantity(Invoice[] invoices) {
        Stream.of(invoices)
                .sorted(Comparator.comparing(Invoice::getQuantity))
                .map(invoice -> invoice.getPartDescription() + " - " + invoice.getQuantity())
                .forEach(System.out::println);
    }


    private static void mapAndSortByValue(Invoice[] invoices) {
        Stream.of(invoices)
                .sorted(Comparator.comparingDouble(invoice -> invoice.getQuantity() * invoice.getPrice()))
                .map(invoice -> invoice.getPartDescription() + " - $" + invoice.getValue())
                .forEach(System.out::println);
    }


    private static void filterByValueRange(Invoice[] invoices) {
        Stream.of(invoices)
                .filter(invoice -> invoice.getValue() >= 200 && invoice.getValue() <= 500)
                .forEach(System.out::println);
    }

    private static void findInvoiceByPartDescription(Invoice[] invoices) {
        Stream.of(invoices)
                .filter(invoice -> invoice.getPartDescription().toLowerCase().contains("saw"))
                .findAny()
                .ifPresent(System.out::println);
    }
}

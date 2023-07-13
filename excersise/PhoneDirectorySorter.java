package chapter17.excersise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class PhoneDirectorySorter {
    public static void main(String[] args) {
        String inputFile = "test.txt";
        String outputFileByPhoneNumber = "directory_by_phone.txt";
        String outputFileAlphabetical = "directory_alphabetical.txt";

        List<PhoneRecord> phoneRecords = new ArrayList<>();


        try (Scanner scanner = new Scanner(new File(inputFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(" ");
                    if (parts.length == 3) {
                        String firstName = parts[0];
                        String lastName = parts[1];
                        String phoneNumber = parts[2];
                        PhoneRecord record = new PhoneRecord(firstName, lastName, phoneNumber);
                        phoneRecords.add(record);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }


        Collections.sort(phoneRecords, Comparator.comparing(PhoneRecord::getPhoneNumber));


        writeRecordsToFile(outputFileByPhoneNumber, phoneRecords);


        Collections.sort(phoneRecords, Comparator.comparing(PhoneRecord::getLastName)
                .thenComparing(PhoneRecord::getFirstName));


        writeRecordsToFile(outputFileAlphabetical, phoneRecords);
    }

    private static void writeRecordsToFile(String filePath, List<PhoneRecord> records) {
        try (PrintWriter writer = new PrintWriter(new File(filePath))) {
            for (PhoneRecord record : records) {
                writer.println(record.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static class PhoneRecord {
        private final String firstName;
        private final String lastName;
        private final String phoneNumber;

        public PhoneRecord(String firstName, String lastName, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        @Override
        public String toString() {
            return lastName + ", " + firstName + " - " + phoneNumber;
        }
    }
}

public class Demo024A {
    public static void main(String[] args) {
        String[] names = {"Anusha", "Keerthi", "Bindhu", "Ashwitha", "Sahitha"};
        String[] phoneNumbers = {"123-456-7890", "987-654-3210", "456-789-1230", "789-123-4560", "321-654-9870"};
        String[] addresses = {"123 sec", "456 idpl", "789 hyd", "101 ameerpet", "202 balnagar"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Phone: " + phoneNumbers[i]);
            System.out.println("Address: " + addresses[i]);
            System.out.println();
        }
    }
}
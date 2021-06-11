public class ShowPhonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook("Sam Johnson");
        phonebook.addContact(new Contact("Kelly Wong", "(02) 12345678"));
        phonebook.addContact(new Contact("Richard Jackson", "(02) 87654321"));
        phonebook.show();
    }
}

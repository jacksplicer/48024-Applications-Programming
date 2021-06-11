public class LookupPhonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook("Sam Johnson");
        phonebook.addContact(new Contact("Kelly Wong", "(02) 12345678"));
        phonebook.addContact(new Contact("Richard Jackson", "(02) 87654321"));
        phonebook.show();
        
        String name = Input.askString("Enter a contact name:");
        Contact cont = phonebook.findContactByName(name);
        if(cont != null){
            System.out.println("Phone number is " + cont.getPhone());
        } else{
            System.out.println(name + " not found");
        }
    }
}

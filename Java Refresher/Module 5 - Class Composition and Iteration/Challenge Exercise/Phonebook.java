import java.util.*;

public class Phonebook {
    private String owner; 
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    
    public Phonebook(String owner){
        this.owner = owner;
    }
    
    public void addContact(Contact c){
        contacts.add(c);
    }
    
    public void show(){
        System.out.println(this.owner + "'s phonebook");
        for(Contact contact: contacts){
            System.out.println(contact.getName() + ": " + contact.getPhone());
        }
    }
    
    public Contact findContactByName(String name){
        for(Contact contact: contacts){
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }
    
    
}

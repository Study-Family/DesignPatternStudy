package profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    private final String name;
    private final String email;
    private final Map<String, List<String>> contacts;

    public Profile(String email, String name, String... contacts) {
        this.email = email;
        this.name = name;
        this.contacts = new HashMap<>();

        addContacts(contacts);
    }

    private void addContacts(String[] contacts) {
        for (String contact : contacts) {
            addContact(contact);
        }
    }

    private void addContact(String contact) {
        String[] parts = contact.split(":");

        String contactType = "friend";
        String contactEmail = parts[0];
        if (parts.length != 1) {
            contactType = parts[0];
            contactEmail = parts[1];
        }

        if (!this.contacts.containsKey(contactType)) {
            this.contacts.put(contactType, new ArrayList<>());
        }
        this.contacts.get(contactType).add(contactEmail);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getContacts(String contactType) {
        if (!contacts.containsKey(contactType)) {
            this.contacts.put(contactType, new ArrayList<>());
        }
        return contacts.get(contactType);
    }
}

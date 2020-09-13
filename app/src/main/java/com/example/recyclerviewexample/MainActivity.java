package com.example.recyclerviewexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexample.adapter.ContactsAdapter;
import com.example.recyclerviewexample.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lookup the recyclerview in activity layout
        RecyclerView rvContacts = findViewById(R.id.rvContacts);

        // Create adapter passing in the sample user data
        ContactsAdapter adapter = new ContactsAdapter(generateContacts());
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(adapter);
        // Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<Contact> generateContacts() {

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Angel", "Online"));
        contacts.add(new Contact("Bob ", "Offline"));
        contacts.add(new Contact("Gates", "Online"));
        contacts.add(new Contact("Steve", "Offline"));
        contacts.add(new Contact("Allen", "Offline"));
        contacts.add(new Contact("Woz", "Online"));
        contacts.add(new Contact("Richie", "Offline"));
        contacts.add(new Contact("Bill", "Online"));
        contacts.add(new Contact("Jeff", "Online"));
        contacts.add(new Contact("Dell", "Online"));

        return contacts;
    }
}

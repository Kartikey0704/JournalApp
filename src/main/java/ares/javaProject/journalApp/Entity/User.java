package ares.javaProject.journalApp.Entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
@Data
public class User {
    @Id
    private ObjectId id;
    @Indexed(unique = true)//for checking username to be unique
    @NonNull//lambok annotation throughs NPE if null
    private String userName;
    @NonNull
    private String password;
    @DBRef//to map journal_entries, act lies a foreign key b/w the two collections
    private List<JournalEntry> journalEntries = new ArrayList<>();

}

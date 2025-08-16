package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.ObjectInputStream;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {
}

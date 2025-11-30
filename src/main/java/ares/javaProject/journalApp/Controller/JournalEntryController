//package ares.javaProject.journalApp.Controller;
//
//import Entity.ares.javaProject.journalApp.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal")
//public class JournalEntryController {
//    private Map<Long, JournalEntry> journalEntries=new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myentry){
//        journalEntries.put(myentry.getId(), myentry);
//        return true;
//    }
//    @GetMapping("id/{myId}")
//    public JournalEntry getEntryById(@PathVariable long myId){
//        return journalEntries.get(myId);
//    }
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteEntryById(@PathVariable long myId){
//        return journalEntries.remove(myId);
//    }
//    @PutMapping("id/{myId}")
//    public JournalEntry updateEntry(@PathVariable Long myId ,@RequestBody JournalEntry myEntry){
//        return journalEntries.put(myId, myEntry);
//    }
//}
//
//*****************************************
//second updated code
//        package ares.javaProject.journalApp.Controller;
//
//import Entity.ares.javaProject.journalApp.JournalEntry;
//import Service.ares.javaProject.journalApp.JournalEntryService;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDateTime;
//import java.util.*;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryControllerV2 {
//
//    @Autowired
//    private JournalEntryService journalEntryService;
//
//    @GetMapping
//    public ResponseEntity<?>getAll(){
//        List<JournalEntry> all = journalEntryService.getAll();
//        if(all !=null && !all.isEmpty()){
//            return new ResponseEntity<>(all, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//    @PostMapping
//    public ResponseEntity<JournalEntry> createEntry(@RequestBody JournalEntry myEntry){
//        try {
//            myEntry.setDate(LocalDateTime.now());
//            journalEntryService.saveEntry(myEntry);
//            return new ResponseEntity<>(myEntry, HttpStatus.CREATED);
//        }catch (Exception e){
//            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
//        }
//    }
//    @GetMapping("id/{myId}")
//    public ResponseEntity<JournalEntry> getEntryById(@PathVariable ObjectId myId){
//        Optional<JournalEntry> journalEntry = journalEntryService.findById(myId);
//        if(journalEntry.isPresent()){
//            return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
//        }else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//    @DeleteMapping("id/{myId}")
//    public ResponseEntity<?> deleteEntryById(@PathVariable ObjectId myId){
//        journalEntryService.deleteById(myId);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//    @PutMapping("id/{myId}")
//    public ResponseEntity<?> updateEntry(@PathVariable ObjectId myId ,@RequestBody JournalEntry newEntry){
//        JournalEntry oldEntry = journalEntryService.findById(myId).orElse(null);
//        if(oldEntry != null) {
//            oldEntry.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : oldEntry.getTitle());
//            oldEntry.setContent(newEntry.getContent() != null && !newEntry.getContent().equals("") ? newEntry.getContent() : oldEntry.getContent());
//            journalEntryService.saveEntry(oldEntry);
//            return new ResponseEntity<>(oldEntry,HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//}


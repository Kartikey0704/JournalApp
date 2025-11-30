package ares.javaProject.journalApp.service;
import ares.javaProject.journalApp.repository.UserRepository;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class UserServiceTests {
    @Autowired
    private UserRepository userRepository;
    @ParameterizedTest
//    @CsvSource||@EnumSource
    @ValueSource(strings ={
            "Ram",
            "Kartik",
            "asim"
    })
    public void testFindByUserName(String name) {
        assertNotNull(userRepository.findByUserName(name), "failed for username " + name);
    }
//    @Test
//    public void testFindByUserName() {
//        User user = userRepository.findByUserName("Ram");
//        assertTrue(!user.getJournalEntries().isEmpty());
//        assertNotNull(userRepository.findByUserName("admin"));
//    }

}

package ares.javaProject.journalApp.service;
import static org.mockito.Mockito.*;
import ares.javaProject.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;


public class UDSImpTests {
    @InjectMocks
    private UDSImp userDetailsService;

    @BeforeEach
    void setuo(){
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    private UserRepository userRepository;

    @Test
    void loadUserByUsernameTest() {
        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(org.springframework.security.core.userdetails.User.builder().username("Ram").password("sham").roles(new ArrayList<>()).build());
        UserDetails user = userDetailsService.loadUserByUsername("Ram");
        Assertions.assertNotNull(user);
    }
}

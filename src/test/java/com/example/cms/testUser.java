package com.example.cms;

import com.example.cms.controller.EmailController;
import com.example.cms.model.entity.SleepData;
import com.example.cms.model.entity.User;
import com.example.cms.model.repository.SleepDataRepository;
import com.example.cms.model.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class testUser {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private SleepDataRepository sleepDataRepository;
    @MockBean
    private EmailController emailController;
    @MockBean
    private UserRepository userRepository;
    @Test
    public void testAddSleep() throws Exception {
        User newUser = new User("testUser", "John", "Doe", "john.doe@example.com", 1, 1, 1990, "securePassword123");

        mockMvc.perform(post("/users/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(newUser)))
                .andExpect(content().string(containsString("User created successfully, please continue to login page.")));

        Optional<User> savedUser = userRepository.findById("testUser");

        assertTrue(savedUser.isPresent());
        assertEquals("testUser", savedUser.get().getUsername());
        userRepository.save(new User("testUser", "John", "Doe", "john.doe@example.com", 1, 1, 1990, "password"));

        SleepData sleepData = new SleepData(
                newUser,
                22,  // startHour
                30,  // startMinute
                7,   // endHour
                45,  // endMinute
                1,   // startDay
                2,   // endDay
                3,   // startMonth
                4,   // endMonth
                2023,  // startYear
                2023,  // endYear
                5,   // startTiredness
                2,   // endTiredness
                "Sweet dreams!"  // dream
        );

        when(sleepDataRepository.save(any(SleepData.class))).thenReturn(sleepData);

        mockMvc.perform(post("/sleep/create/{username}", "testUser")
                        .contentType(MediaType.APPLICATION_JSON)
                        .contentType(new ObjectMapper().writeValueAsString(sleepData)))
                .andExpect(content().string(containsString("Sleep data saved successfully")));

        verify(sleepDataRepository, times(1)).save(any(SleepData.class));
        }



    @Test
    public void testGetSleepData() throws Exception {
        // Mock the behavior of repository.sleepDataDuration
        List<SleepData> sleepDataList = Arrays.asList(new SleepData(), new SleepData());
        when(sleepDataRepository.sleepDataDuration(anyString(), anyString(), anyString())).thenReturn(sleepDataList);

        mockMvc.perform(get("/sleep/{username}/{start}/{end}", "testUser", "2022-01-01", "2022-02-01"))
                .andExpect(jsonPath("$", hasSize(2)));

        // Verify that repository.sleepDataDuration was called
        verify(sleepDataRepository, times(1)).sleepDataDuration(anyString(), anyString(), anyString());
    }

    // Add similar tests for other controller methods

    // ...
}
package com.alexswd.todos.restservice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class HealthControllerTest {

  @Test
  void healthEndpointReturnsUp() throws Exception {
    MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new HealthController()).build();

    mockMvc.perform(get("/api/health")).andExpect(status().isOk())
        .andExpect(content().string("UP"));
  }
}

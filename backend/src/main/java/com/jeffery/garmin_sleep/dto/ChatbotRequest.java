package com.jeffery.garmin_sleep.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatbotRequest {
    private LocalDate date;
    private String question;
}

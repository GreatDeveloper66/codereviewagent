package com.adamshaffer.codereviewagent.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CodeReviewDTO {
    private Long id;
    private String fileName;
    private String language;
    private String reviewSummary;
    private LocalDateTime createdAt;
}

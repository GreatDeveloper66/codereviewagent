package com.adamshaffer.codereviewagent.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CodeReviewDTO {
    public CodeReviewDTO(long l, String fileName2, String language2, String codeReview, LocalDateTime now) {
        //TODO Auto-generated constructor stub
    }
    private Long id;
    private String fileName;
    private String language;
    private String reviewSummary;
    private LocalDateTime createdAt;
}

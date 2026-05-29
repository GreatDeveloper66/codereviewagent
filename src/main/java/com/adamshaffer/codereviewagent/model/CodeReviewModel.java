package com.adamshaffer.codereviewagent.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CodeReview")
@Data
public class CodeReviewModel {
    public CodeReviewModel(String fileName, String language2, String codeReview, LocalDateTime now) {
        //TODO Auto-generated constructor stub
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<String> files;
    private String language;
    private String reviewSummary;
    private LocalDateTime createdAt;
    
}

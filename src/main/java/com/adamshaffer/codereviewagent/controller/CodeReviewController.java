package com.adamshaffer.codereviewagent.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adamshaffer.codereviewagent.dto.CodeReviewDTO;
import com.adamshaffer.codereviewagent.service.CodeReviewService;

@Controller
@RequestMapping("/api/codeReview")
public class CodeReviewController {
    private final CodeReviewService codeReviewService;

    public CodeReviewController(CodeReviewService codeReviewService) {
        this.codeReviewService = codeReviewService;
    }

    public CodeReviewDTO getCodeReview(String fileName, String language) {
        return codeReviewService.getCodeReview(fileName, language);
    }

    @PostMapping("/analyze")
    public ResponseEntity<CodeReviewDTO> analyzeCode(@RequestBody AnalyzeRequest request) {
        CodeReviewDTO result = codeReviewService.getCodeReview(request.getFileName(), request.getLanguage());
        return ResponseEntity.ok(result);
    }
    
}

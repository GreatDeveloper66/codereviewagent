package com.adamshaffer.codereviewagent.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adamshaffer.codereviewagent.dto.CodeReviewDTO;
import com.adamshaffer.codereviewagent.service.CodeReviewService;

@RestController
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
    public ResponseEntity<CodeReviewDTO> analyzeCode(@RequestBody CodeReviewRequest request) {
        CodeReviewDTO result = getCodeReview(request.getFileName(), request.getLanguage());
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getHistory")
    public ResponseEntity<List<CodeReviewDTO>> getHistory() {
        List<CodeReviewDTO> history = codeReviewService.getHistory();
        return ResponseEntity.ok(history);
    }
    
}

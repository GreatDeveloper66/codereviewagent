package com.adamshaffer.codereviewagent.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adamshaffer.codereviewagent.dto.CodeReviewDTO;
import com.adamshaffer.codereviewagent.model.CodeReviewModel;
import com.adamshaffer.codereviewagent.repository.CodeReviewRepository;

@Service
public class CodeReviewService {
    private final CodeReviewRepository codeReviewRepository;
    private final AIClientService aiClientService;
    public CodeReviewService(CodeReviewRepository codeReviewRepository, AIClientService aiClientService) {
        this.codeReviewRepository = codeReviewRepository;
        this.aiClientService = aiClientService;
    }

    public CodeReviewDTO getCodeReview(String fileName, String language) {
        String codeReview = aiClientService.getCodeReview(fileName, language);
        codeReviewRepository.save(new CodeReviewModel(fileName, language, codeReview, LocalDateTime.now()));
        return new CodeReviewDTO(1L, fileName, language, codeReview, LocalDateTime.now());
    }

    public List<CodeReviewDTO> getHistory() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHistory'");
    }
}

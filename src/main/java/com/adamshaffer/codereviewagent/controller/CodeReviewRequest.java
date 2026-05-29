package com.adamshaffer.codereviewagent.controller;

import lombok.Data;

@Data
public class CodeReviewRequest {
    private String fileName;
    private String language;
    private String content;


    public String getContent() {
        // TODO Auto-generated method stub
        return "not implemented";
    }

    public String getLanguage() {
        // TODO Auto-generated method stub
        return "not implemented";
    }

    public String getFileName() {
        // TODO Auto-generated method stub
        return "not implemented";
    }

}

package com.scriptcasters.pdfparser.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ParseAndSearchRequest {
    private List<String> searchInputs;
    private String outputMethod;
    private MultipartFile fileToSearch;
}

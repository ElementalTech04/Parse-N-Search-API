package com.scriptcasters.pdfparser.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ParseAndSearchResponse {

    private List<String> searchInputs;
    private boolean isFileOutput;
    private MultipartFile fileOutput;
    private List<String> stringOutput;
}

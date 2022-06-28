package com.scriptcasters.pdfparser.service;

import com.scriptcasters.pdfparser.dto.ParseAndSearchResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ParseAndSearchService {

    ParseAndSearchResponse searchPdfToList(List<String> searchInputs, MultipartFile fileToSearch, boolean isCaseSensitiveSearch);

    ParseAndSearchResponse searchPdfToCSV(List<String> searchInputs, MultipartFile fileToSearch, boolean isCaseSensitiveSearch, String outputFileName);
}

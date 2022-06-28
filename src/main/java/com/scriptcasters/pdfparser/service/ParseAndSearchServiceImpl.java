package com.scriptcasters.pdfparser.service;

import com.scriptcasters.pdfparser.dto.ParseAndSearchResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ParseAndSearchServiceImpl implements ParseAndSearchService {


    @Override
    public ParseAndSearchResponse searchPdfToList(List<String> searchInputs, MultipartFile fileToSearch, boolean isCaseSensitiveSearch) {
        return null;
    }

    @Override
    public ParseAndSearchResponse searchPdfToCSV(List<String> searchInputs, MultipartFile fileToSearch, boolean isCaseSensitiveSearch, String outputFileName) {
        return null;
    }
}

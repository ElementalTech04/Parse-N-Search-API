package com.scriptcasters.pdfparser.controller;

import com.scriptcasters.pdfparser.dto.ParseAndSearchRequest;
import com.scriptcasters.pdfparser.service.ParseAndSearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pas")
public class PdfParseAndSearchController {

    @Resource
    private ParseAndSearchService pasService;

    @GetMapping(consumes="application/multipart", produces="application/pdf")
    public ResponseEntity<?> parseAndSearchPDF(@RequestBody ParseAndSearchRequest pasRequest){

        return ResponseEntity.accepted().build();
    }
}

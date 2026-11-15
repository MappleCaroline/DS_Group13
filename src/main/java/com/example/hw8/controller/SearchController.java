
package com.example.hw8.controller;

import com.example.hw8.service.TavilySearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SearchController {

    private final TavilySearchService searchService;

    public SearchController(TavilySearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/api/search")
    public Map<String, String> search(
            @RequestParam("query") String query) {

        return searchService.search(query);
    }
}

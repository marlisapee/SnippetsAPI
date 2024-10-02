package com.snipper.SnipperSnippetsAPI.Snippet;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SnippetController {
    private SnippetService snippetService;

    public SnippetController(SnippetService snippetService) {
        this.snippetService = snippetService;
    }

    @GetMapping("/snippets")
    public List<Snippet> getAllSnippets() throws IOException {
        return snippetService.getAllSnippets();
    }

    @GetMapping("/snippets/{id}")
    public Optional<Snippet> getSnippetById(@PathVariable("id") int id) throws IOException {
      return snippetService.getSnippetById(id);
    }

    @PostMapping("/snippets")
    public void createSnippet(@RequestBody Snippet snippet) throws IOException {
        snippetService.createSnippet(snippet);
    }

}

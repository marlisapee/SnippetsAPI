package com.snipper.SnipperSnippetsAPI.Snippet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SnippetService {
    private final SnippetRepository snippetRepository;

    @Autowired
    public SnippetService(SnippetRepository snippetRepository) {
        this.snippetRepository = snippetRepository;
    }

    public List<Snippet> getAllSnippets() {
        return snippetRepository.findAll();
    }

    Optional<Snippet> getSnippetById(int id) {
        return snippetRepository.findById(id);
    }

    public void createSnippet(Snippet snippet) {
        snippetRepository.save(snippet);
    }
}

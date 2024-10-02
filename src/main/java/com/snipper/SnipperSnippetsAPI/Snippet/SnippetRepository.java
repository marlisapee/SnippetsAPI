package com.snipper.SnipperSnippetsAPI.Snippet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SnippetRepository extends JpaRepository<Snippet, Integer> {
}

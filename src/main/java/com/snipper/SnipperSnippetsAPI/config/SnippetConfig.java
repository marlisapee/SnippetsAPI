package com.snipper.SnipperSnippetsAPI.config;

import com.snipper.SnipperSnippetsAPI.Snippet.Snippet;
import com.snipper.SnipperSnippetsAPI.Snippet.Snippet;
import com.snipper.SnipperSnippetsAPI.User.User;
import com.snipper.SnipperSnippetsAPI.Snippet.SnippetRepository;
import com.snipper.SnipperSnippetsAPI.User.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SnippetConfig {

    @Bean
    CommandLineRunner commandLineRunner(SnippetRepository snippetRepository, UserRepository userRepository) {
        return args -> {
            List<Snippet> snippets = List.of(
                    new Snippet("Python", "print('Hello, World!')"),
                    new Snippet("Python", "def add(a, b):\n    return a + b"),
                    new Snippet("Python", "class Circle {\n    def __init__(self, radius):\n        self.radius = radius;\n    }\n\n    def area() {\n        return 3.14 * self.radius ** 2; }"),
                    new Snippet("JavaScript", "console.log('Hello, World!');"),
                    new Snippet("JavaScript", "function multiply(a, b) {\n    return a * b; }"),
                    new Snippet("JavaScript", "const square = num => num * num;"),
                    new Snippet("Java", "public class HelloWorld {\n    public static void main(String[] args) {\n        System.out.println(\"Hello, World!\");\n    }\n}"),
                    new Snippet("Java", "public class Rectangle {\n    private int width;\n    private int height;\n\n    public Rectangle(int width, int height) {\n        this.width = width;\n        this.height = height;\n    }\n\n    public int getArea() {\n        return width * height;\n    }\n}")
            );

            List<User> users = List.of(
                    new User("jane@email.com", "password"),
                    new User("john@email.com", "password")
            );

            snippetRepository.saveAll(snippets);
            userRepository.saveAll(users);
        };
    }
}

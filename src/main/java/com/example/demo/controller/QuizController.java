package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;

@RestController
@RequestMapping("/api")
public class QuizController {

    @Autowired
    private QuestionRepository repository;

    // Get all 15 questions
    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return repository.findAll();
    }
}

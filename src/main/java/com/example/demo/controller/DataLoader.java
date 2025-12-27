package com.example.demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(QuestionRepository repo) {
        return args -> {
            if (repo.count() == 0) {

                repo.save(new Question(null,"What is Java?",
                        "Operating System","Browser","Programming Language","Database",2));

                repo.save(new Question(null,"Which keyword is used to inherit a class?",
                        "this","super","extends","implements",2));

                repo.save(new Question(null,"Main method return type?",
                        "int","void","String","float",1));

                repo.save(new Question(null,"JVM stands for?",
                        "Java Variable Machine","Virtual Machine","Java Virtual Machine","Compiler",2));

                repo.save(new Question(null,"Which is not an OOP concept?",
                        "Inheritance","Encapsulation","Compilation","Polymorphism",2));

                repo.save(new Question(null,"Which keyword is used to create object?",
                        "class","new","object","create",1));

                repo.save(new Question(null,"Which loop runs at least once?",
                        "for","while","do-while","foreach",2));

                repo.save(new Question(null,"Which package contains Scanner?",
                        "java.io","java.util","java.lang","java.sql",1));

                repo.save(new Question(null,"Which access specifier is most restrictive?",
                        "public","protected","default","private",3));

                repo.save(new Question(null,"Which keyword is used to handle exception?",
                        "catch","throw","throws","try",0));

                repo.save(new Question(null,"Which is not a primitive data type?",
                        "int","float","String","char",2));

                repo.save(new Question(null,"Which keyword refers to current object?",
                        "this","super","static","final",0));

                repo.save(new Question(null,"Which collection allows duplicates?",
                        "Set","Map","List","None",2));

                repo.save(new Question(null,"Which interface is implemented by ArrayList?",
                        "List","Set","Queue","Map",0));

                repo.save(new Question(null,"Which keyword prevents inheritance?",
                        "static","final","abstract","private",1));

                repo.save(new Question(null,"Which exception is unchecked?",
                        "IOException","SQLException","NullPointerException","ClassNotFound",2));

                repo.save(new Question(null,"Which Java version introduced lambda?",
                        "Java 5","Java 6","Java 7","Java 8",3));

                repo.save(new Question(null,"Which method is used to start a thread?",
                        "run()","execute()","start()","init()",2));

                repo.save(new Question(null,"Which keyword is used to define constant?",
                        "static","final","const","define",1));

                repo.save(new Question(null,"Which class is parent of all classes?",
                        "Object","Class","Main","System",0));
            }
        };
    }
}

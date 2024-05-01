package com.example.bookmanagementsystem.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Author {
    private String name;
    private List<Genre> genres;
}

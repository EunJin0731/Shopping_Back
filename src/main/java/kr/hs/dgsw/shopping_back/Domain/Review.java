package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Review {
    private String name;
    private String title;
    private String account;
    private String content;
    private LocalTime created;
}

package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

@Data
public class Product {
    private String name;
    private String content;
    private String price;
    private String category;
    private String filename;
    private String file;
    private String detail;
}

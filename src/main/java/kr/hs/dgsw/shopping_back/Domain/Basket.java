package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

@Data
public class Basket {
    private String product;
    private String price;
    private int count;
    private int total;
}

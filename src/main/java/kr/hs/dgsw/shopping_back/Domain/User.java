package kr.hs.dgsw.shopping_back.Domain;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String account;
    private String password;
    private String name;
    private String phone;
    private String mobile;
    private String zipcode;
    private String address;
}

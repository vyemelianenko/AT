package com.provectus.rest.entities;

import lombok.*;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class User {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Integer userStatus;

}

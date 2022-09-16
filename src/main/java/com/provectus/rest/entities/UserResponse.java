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
@AllArgsConstructor //add all constructors

public class UserResponse {
    private Integer code;
    private String type;
    private String message;

}

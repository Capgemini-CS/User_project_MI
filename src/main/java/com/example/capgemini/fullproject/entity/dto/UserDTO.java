package com.example.capgemini.fullproject.entity.dto;

import lombok.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDTO {

    @NotNull
    private Integer user_id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String gender;
    @NotNull
    private String status;
}

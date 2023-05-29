package com.blog_back.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "User")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Email(message = "유효한 이메일 주소를 입력해주세요.")
    @Column(unique = true)
    private String username;

    private String password;

    private Date create_at;

    private Date update_at;

}

package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class User {
    private int id;
    @Email(message = "Некорректный формат электронной почты")
    private String email;
    @NotNull(message = "Логин не может быть null")
    @NotBlank(message = "Логин не может быть пустым")
    @NotNull(message = "Имя пользователя не может быть пустым")
    @NotBlank(message = "Логин пользователя не может быть пустым")
    private String login;
    private String name;
    @Past(message = "Дата рождения должна быть в прошлом")
    private LocalDate birthday;
}












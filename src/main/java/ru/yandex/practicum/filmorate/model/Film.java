package ru.yandex.practicum.filmorate.model;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder(toBuilder = true)

public class Film {
    private int id;
    @NotNull(message = "Название фильма не может быть пустым")
    @NotEmpty(message = "Не должно быть пустой строки")
    private String name;
    @Size(max = 200, message = "Описание фильма не может превышать 200 символов")
    private String description;
    @Past(message = "Дата релиза должна быть в прошлом")
//    @Min(value = LocalDate.of(1985, 12, 28),
//            message = "Дата релиза не может быть раньше 28 декабря 1895 года")
    private LocalDate releaseDate;
    @Positive(message = "Продолжительность фильма должна быть положительным числом")
    private int duration;
}







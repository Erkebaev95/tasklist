package com.example.tasklist.web.dto.user;

import com.example.tasklist.web.dto.validation.OnCreate;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


@Data
@Schema(description = "User DTO")
public class UserDto {

    @Schema(description = "User id", example = "1")
    @NotNull(message = "id must be not null.", groups = OnUpdate.class)
    private Long id;

    @Schema(description = "User name", example = "John Doe")
    @NotNull(message = "Name must be not null.", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Name length must be smaller than 255 symbol", groups = {OnUpdate.class, OnCreate.class})
    private String name;

    @Schema(description = "User username", example = "john@gmail.com")
    @NotNull(message = "Username must be not null.", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Username length must be smaller than 255 symbol", groups = {OnUpdate.class, OnCreate.class})
    private String username;

    @Schema(description = "User password", example = "$2a$10$eYGJBOz2kg70hTYKmifYiuwoUOUaRkDi06rkat.k2QcrTy3JetLGm")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must be not null.", groups = {OnCreate.class, OnUpdate.class})
    private String password;

    @Schema(description = "User passwordConfirmation", example = "$2a$10$eYGJBOz2kg70hTYKmifYiuwoUOUaRkDi06rkat.k2QcrTy3JetLGm")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "PasswordConfirmation must be not null.", groups = {OnCreate.class})
    private String passwordConfirmation;

}

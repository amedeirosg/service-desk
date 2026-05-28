package dev.medeiros.service_desk.dto.user;

import dev.medeiros.service_desk.entity.Department;
import dev.medeiros.service_desk.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserCreateDTO {

    @NotNull
    private String name;
    @Column(unique = true)
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private Department department;
    @NotNull
    private Role role;

}

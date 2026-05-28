package dev.medeiros.service_desk.dto.user;

import dev.medeiros.service_desk.enums.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserCreateDTO {

    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String department;
    @NotBlank
    private Role role;

}

package dev.medeiros.service_desk.dto.user;

import dev.medeiros.service_desk.entity.Department;
import dev.medeiros.service_desk.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class UserResponseDTO {

    private String name;
    private String email;
    private Department department;
    private Role role;

}

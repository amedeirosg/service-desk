package dev.medeiros.service_desk.service;


import dev.medeiros.service_desk.dto.user.UserCreateDTO;
import dev.medeiros.service_desk.dto.user.UserResponseDTO;
import dev.medeiros.service_desk.entity.Department;
import dev.medeiros.service_desk.entity.User;
import dev.medeiros.service_desk.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final DepartmentService departmentService;

    public UserResponseDTO createUser(UserCreateDTO dto){

        Department dep = departmentService.findByName(dto.getDepartment());

        User user = new User(dto.getName(), dto.getEmail(), passwordEncoder.encode(dto.getPassword()), dep, dto.getRole());

        userRepository.save(user);

        return toDTO(user);

    }

    public UserResponseDTO toDTO(User user){

        return new UserResponseDTO(user.getName(), user.getEmail(), user.getDepartment(), user.getRole());

    }

}

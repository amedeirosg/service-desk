package dev.medeiros.service_desk.controller;

import dev.medeiros.service_desk.dto.user.UserCreateDTO;
import dev.medeiros.service_desk.dto.user.UserResponseDTO;
import dev.medeiros.service_desk.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    public ResponseEntity<UserResponseDTO> createUser(@RequestBody @Valid UserCreateDTO dto){

        return ResponseEntity.ok(userService.createUser(dto));

    }

}

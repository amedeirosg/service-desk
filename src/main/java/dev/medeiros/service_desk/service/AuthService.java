package dev.medeiros.service_desk.service;

import dev.medeiros.service_desk.dto.auth.LoginRequestDTO;
import dev.medeiros.service_desk.entity.User;
import dev.medeiros.service_desk.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void login(LoginRequestDTO dto){

        User user = userRepository.findUserByEmail(dto.getEmail())
                .orElseThrow(() -> new RuntimeException("E-mail ou senha invalido"));

        boolean passwordMatches = passwordEncoder.matches(
                dto.getPassword(),
                user.getPassword()
        );

        if (!passwordMatches) {
            throw new RuntimeException("E-mail ou senha invalida");
        }

    }


}

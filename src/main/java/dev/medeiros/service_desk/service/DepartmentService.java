package dev.medeiros.service_desk.service;

import dev.medeiros.service_desk.entity.Department;
import dev.medeiros.service_desk.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;


    public Department findByName(String name) {
        return departmentRepository.findByName(name).orElseThrow(() -> new RuntimeException("Departamento não encontrado"));
    }

}

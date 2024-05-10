package com.jota.sanfelipe.services;

import com.jota.sanfelipe.entities.AvalaibleService;
import com.jota.sanfelipe.entities.Car;
import com.jota.sanfelipe.entities.Employee;
import com.jota.sanfelipe.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee registerEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}

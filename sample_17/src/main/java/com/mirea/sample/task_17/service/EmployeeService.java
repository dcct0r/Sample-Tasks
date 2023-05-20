package com.mirea.sample.task_17.service;

import com.mirea.sample.task_17.model.Employee;
import com.mirea.sample.task_17.model.EmployeePage;
import com.mirea.sample.task_17.model.EmployeeSearchCriteria;
import com.mirea.sample.task_17.repository.EmployeeCriteriaRepository;
import com.mirea.sample.task_17.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                           EmployeeCriteriaRepository employeeCriteriaRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee> getEmployees(EmployeePage employeePage,
                                       EmployeeSearchCriteria employeeSearchCriteria){
        log.info("Getting employer.........");
        return employeeCriteriaRepository.findAllWithFilters(employeePage, employeeSearchCriteria);
    }

    public Employee addEmployee(Employee employee){
        log.info("Adding new employer...............");
        return employeeRepository.save(employee);
    }
}

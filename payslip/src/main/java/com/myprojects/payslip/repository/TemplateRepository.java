package com.myprojects.payslip.repository;

import com.myprojects.payslip.entity.Template;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateRepository extends JpaRepository<Template, Integer> {
}

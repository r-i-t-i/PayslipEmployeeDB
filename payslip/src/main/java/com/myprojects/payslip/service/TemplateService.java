package com.myprojects.payslip.service;

import com.myprojects.payslip.entity.Template;
import com.myprojects.payslip.exception.Response;
import com.myprojects.payslip.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TemplateService {

    @Autowired
    private TemplateRepository templateRepository;

    public Response createTemplate(Template temp){
        Template template = this.templateRepository.save(temp);
        if(template == null){
            return new Response(500, "Cannot create Employee", System.currentTimeMillis(), false);
        }
        return new Response(200, "Ok", System.currentTimeMillis(), true);
    }

    public List<Template> getAllTemplate(){
        return this.templateRepository.findAll();
    }

    public Template getTemplateById(int id){
        Template template = this.templateRepository.findById(id).orElse(null);
        return template;
    }
}
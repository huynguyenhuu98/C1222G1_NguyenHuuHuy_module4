package com.example.ss4_program_save_email.controller;

import com.example.ss4_program_save_email.model.Program;
import com.example.ss4_program_save_email.service.IProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("program")
public class ProgramController {
    @Autowired
    private IProgramService iProgramService;

    @GetMapping("")
    public String display(Model model) {
        model.addAttribute("program", iProgramService.getProgram());
        return "list";
    }

    @GetMapping("update-form")
    public String getFormUpdate(Model model) {
        model.addAttribute("program", iProgramService.getProgram());
        model.addAttribute("languages", iProgramService.getLanguages());
        model.addAttribute("pageSize", iProgramService.getPageSize());
        return "update";
    }

    @PostMapping
    public String updateProgram(@ModelAttribute Program program, RedirectAttributes redirectAttributes) {
        iProgramService.update(program);
        redirectAttributes.addFlashAttribute("mess", "Update program successful!");
        return "redirect:program";
    }
}

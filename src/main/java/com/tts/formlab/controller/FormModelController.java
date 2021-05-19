package com.tts.formlab.controller;


import com.tts.formlab.model.FormModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormModelController {
    @GetMapping("/create")
    public String createFormModel(Model model) {
        model.addAttribute("formModel", new FormModel());
        return "create";
    }

    @PostMapping("/save")
    public String saveFormModelSubmission(
            @ModelAttribute FormModel formModel) {
        return "result";
    }
}

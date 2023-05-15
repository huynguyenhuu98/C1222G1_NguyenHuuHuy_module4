package com.example.ss2_dictionary.controller;

import com.example.ss2_dictionary.model.Dictionary;
import com.example.ss2_dictionary.repository.DictionaryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DictionaryController {
    private DictionaryRepository dictionaryRepository = new DictionaryRepository();
    @GetMapping("/dictionary")
    public String search() {
        return "listDictionary";
    }
    @PostMapping("/result")
    public String meaning(@RequestParam String english, Model model){
        List<Dictionary> dictionaries = this.dictionaryRepository.findAll();
        for (int i = 0; i < dictionaries.size(); i++) {
            if (english.equalsIgnoreCase(dictionaries.get(i).getEnglishWord())) {
                model.addAttribute("vietnamese", dictionaries.get(i).getVietnamese());
                model.addAttribute("english", english);
                return "listDictionary";
            }
        }
        return "listDictionary";
    }
}

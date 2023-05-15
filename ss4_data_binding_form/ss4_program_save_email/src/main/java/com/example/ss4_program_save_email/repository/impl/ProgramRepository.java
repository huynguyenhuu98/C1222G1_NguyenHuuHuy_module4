package com.example.ss4_program_save_email.repository.impl;

import com.example.ss4_program_save_email.model.Program;
import com.example.ss4_program_save_email.repository.IProgramRepository;

import java.util.ArrayList;
import java.util.List;

public class ProgramRepository implements IProgramRepository {
    private Program program = new Program("English" , 5 , false,"Thor");
    private static List<String> listLanguages = new ArrayList<>();
    static {
        listLanguages.add("English");
        listLanguages.add("Vietnamese");
        listLanguages.add("Japanese");
        listLanguages.add("Chinese");
    }
    private static List<Integer> listPageSize = new ArrayList<>();
    static {
        listPageSize.add(5);
        listPageSize.add(10);
        listPageSize.add(15);
        listPageSize.add(25);
        listPageSize.add(50);
        listPageSize.add(100);
    }

    @Override
    public List<String> getLanguages() {
        return listLanguages;
    }

    @Override
    public List<Integer> getPageSize() {
        return listPageSize;
    }

    @Override
    public Program getProgram() {
        return program;
    }

    @Override
    public void update(Program program) {
        this.program = program;
    }
}

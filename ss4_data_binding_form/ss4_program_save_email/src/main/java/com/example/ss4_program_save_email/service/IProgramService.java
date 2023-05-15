package com.example.ss4_program_save_email.service;

import com.example.ss4_program_save_email.model.Program;

import java.util.List;

public interface IProgramService {
    void update(Program program);
    Program getProgram();
    List<String> getLanguages();
    List<Integer> getPageSize();
}

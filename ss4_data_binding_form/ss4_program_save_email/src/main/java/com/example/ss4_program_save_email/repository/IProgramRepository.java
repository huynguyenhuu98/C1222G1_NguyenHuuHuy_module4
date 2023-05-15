package com.example.ss4_program_save_email.repository;

import com.example.ss4_program_save_email.model.Program;

import java.util.List;

public interface IProgramRepository {
    List<String> getLanguages();
    List<Integer> getPageSize();
    Program getProgram();
    void update(Program program);
}

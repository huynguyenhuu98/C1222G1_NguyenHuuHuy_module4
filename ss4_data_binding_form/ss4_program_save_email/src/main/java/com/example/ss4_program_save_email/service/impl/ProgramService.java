package com.example.ss4_program_save_email.service.impl;

import com.example.ss4_program_save_email.model.Program;
import com.example.ss4_program_save_email.repository.IProgramRepository;
import com.example.ss4_program_save_email.repository.impl.ProgramRepository;
import com.example.ss4_program_save_email.service.IProgramService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService implements IProgramService {

    private IProgramRepository iProgramRepository = new ProgramRepository();
    @Override
    public List<String> getLanguages() {
        return iProgramRepository.getLanguages();
    }

    @Override
    public List<Integer> getPageSize() {
        return iProgramRepository.getPageSize();
    }

    @Override
    public Program getProgram() {
        return iProgramRepository.getProgram();
    }

    @Override
    public void update(Program program) {
        iProgramRepository.update(program);
    }
}

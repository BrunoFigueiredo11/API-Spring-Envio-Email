package com.servico.service;

import com.servico.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private EmailRepository emailRepository;
}

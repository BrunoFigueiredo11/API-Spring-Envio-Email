package com.servico.repository;

import com.servico.model.EmailModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmailRepository extends MongoRepository<EmailModel, String> {

}

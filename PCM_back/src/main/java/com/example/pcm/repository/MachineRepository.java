package com.example.pcm.repository;
import com.example.pcm.model.Machine;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineRepository extends MongoRepository<Machine, String>{
    
    public Machine findBynameMachine(String nameMachine);
}
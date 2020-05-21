package com.example.pcm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.pcm.model.Machine;
import com.example.pcm.model.Paradas;
import com.example.pcm.model.Request;
import com.example.pcm.repository.MachineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MachineService {
    
    @Autowired
    private MachineRepository machineRepository;

    public Machine create(Request request){
        ArrayList<Paradas> paradas_iniciais = new ArrayList<>();
        Machine machine = new Machine(request.getName_machine() ,paradas_iniciais);
        return machineRepository.save(machine);
    }

    public Optional<Machine> getById(String id) {
        return machineRepository.findById(id);
    }

    public List<Machine> getAll(){
        return machineRepository.findAll();
    }

    public void deleteMachine(String id){
        machineRepository.deleteById(id);
    }
    
    public void updateMachine(String nome,Paradas parada){
        Machine r = machineRepository.findByName(nome);
        ArrayList<Paradas> paradas = r.getParadas();
        paradas.add(parada);
        r.setParadas(paradas);
        machineRepository.save(r);
    }
}
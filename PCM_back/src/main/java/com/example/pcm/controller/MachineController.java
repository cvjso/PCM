package com.example.pcm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.pcm.model.Machine;
import com.example.pcm.model.Parada;
import com.example.pcm.model.Request_machine;
import com.example.pcm.model.Request_user;
import com.example.pcm.model.Response;
import com.example.pcm.service.MachineService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("PCM")
public class MachineController {
    
    @Autowired
    private MachineService machineService;

    public MachineController(MachineService machineService){
        this.machineService = machineService;
    }

    @PostMapping("/machine")
    public Response controller_machine(@RequestBody Request_machine request){
        String param = request.getOperation();
        Response response = new Response();

        if(param.equals("create")){
            machineService.create(request);
            response.setMsg("Maquina criada");
        }

        else if(param.equals("get")){
            String nameMachine = request.getName_machine();
            Machine desiredMachine = machineService.getById(nameMachine);
            ArrayList<Machine> machines = new ArrayList<Machine>();
            machines.add(desiredMachine);
            response.setMachines(machines);
        }

        else if(param.equals("getAll")){
            response.setMachines(machineService.getAll());
        }

        else if(param.equals("delete")){
            machineService.deleteMachine(request.getName_machine());
            response.setMsg("Maquina deletada");
        }

        else if(param.equals("update")){
            Machine desired_machine = machineService.getById(request.getName_machine());
            if(desired_machine != null){
                machineService.updateMachine(request.getName_machine(), request.getParada(), request.getEstado());
                response.setMsg("Maquina atualizada");
            }
            else{
                response.setMsg("Maquina inexistente");
            }
        }
        else{
            response.setMsg("Nenhum 'operation' para ser feito");
        }
        return response;
    }
}
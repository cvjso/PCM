package com.example.pcm.controller;

import com.example.pcm.model.Machine;
import com.example.pcm.model.Request;
import com.example.pcm.model.Response;
import com.example.pcm.service.MachineService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("PCM")
public class MachineController {
    
    @Autowired
    private MachineService machineService;

    public MachineController(MachineService machineService){
        this.machineService = machineService;
    }

    
    @PostMapping("/machine")
    public Response controller_machine(@RequestBody Request request){
        String param = request.getOperation();
        Response response = new Response();

        if(param.equals("create")){
            machineService.create(request);
        }

        else if(param.equals("get")){
            response.setOptional_machine(machineService.getById(request.getName_machine()));
        }

        else if(param.equals("getAll")){
            response.setMachines(machineService.getAll());
        }

        else if(param.equals("delete")){
            machineService.deleteMachine(request.getName_machine());
            response.setMsg("Machine deleted");
        }

        //consertar esse erro aki
        //request eh uma string e em reques.getSenha tem q receber um Paradas
        else if(param.equals("update")){
            machineService.updateMachine(request.getName_machine(),request.getSenha());
            response.setMsg("Machine updated");
        }

        else{
            response.setMsg("Nenhum 'operation' para ser feito");
        }


        return response;
    }
}
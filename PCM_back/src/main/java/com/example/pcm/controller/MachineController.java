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
        // Necessário implementar tudo que está no /user para o /machine adaptando

        return response;
    }
}
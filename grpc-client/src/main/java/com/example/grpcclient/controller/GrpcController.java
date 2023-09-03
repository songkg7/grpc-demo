package com.example.grpcclient.controller;

import com.example.grpcclient.service.GrpcClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcController {

    private final GrpcClientService grpcClientService;

    public GrpcController(GrpcClientService grpcClientService) {
        this.grpcClientService = grpcClientService;
    }

    @GetMapping("/grpc/{name}")
    public String grpc(@PathVariable String name) {
        return this.grpcClientService.sendMessage(name);
    }


}

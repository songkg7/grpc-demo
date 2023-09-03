package com.example.grpcclient.service;

import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.examples.lib.HelloRequest;
import net.devh.boot.grpc.examples.lib.MyServiceGrpc;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {

    @GrpcClient("test")
    private MyServiceGrpc.MyServiceBlockingStub myService;

    public String sendMessage(String name) {
        return this.myService.sayHello(
                HelloRequest.newBuilder().setName(name).build()
        ).getMessage();
    }

}

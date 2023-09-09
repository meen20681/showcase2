package com.example.admin.gRPC;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfig {
/*
    @Bean
    public ManagedChannel managedChannel() {

        return ManagedChannelBuilder.forAddress("grpc_server_host", grpc_server_port).usePlaintext().build();
    }

    @Bean
    public RolePermissionServiceGrpc.RolePermissionServiceBlockingStub rolePermissionServiceBlockingStub(ManagedChannel channel) {
        return RolePermissionServiceGrpc.newBlockingStub(channel);
    }

*/

}

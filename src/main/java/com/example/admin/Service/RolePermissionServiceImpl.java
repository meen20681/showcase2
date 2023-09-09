package com.example.admin.Service;


import com.example.admin.Repository.RolePermissionRepository;
import com.example.admin.Repository.UserRepository;
import com.example.admin.modelEntity.RolePermissions;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePermissionServiceImpl  implements  RolePermissionService{



    @Autowired
    private RolePermissionRepository rolePermissionRepository;

    @Override
    public RolePermissions saveRolePermissions(RolePermissions rolePermissions) {
        return null;
    }

    @Override
    public List<RolePermissions> fecthRolePermissionList() {
        return(List<RolePermissions>) rolePermissionRepository.findAll();
    }


    ////grpc check /////
    /*    private final ManagedChannel channel;
    private final RolePermissionServiceGrpc.RolePermissionServiceBlockingStub blockingStub;

    public RolePermissionClient() {
        channel = ManagedChannelBuilder.forAddress("localhost", 8080) // Replace with the gRPC server address
                .usePlaintext()
                .build();
        blockingStub = RolePermissionServiceGrpc.newBlockingStub(channel);
    }

    public boolean checkRoleExists(String roleId) {
        RoleRequest request = RoleRequest.newBuilder()
                .setRoleId(roleId)
                .build();

        RoleResponse response = blockingStub.checkRoleExists(request);
        return response.getExists();
    }
}
    * */

    //////


}

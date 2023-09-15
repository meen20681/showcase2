package com.example.admin.Service;


import com.example.admin.Repository.RolePermissionRepository;
import com.example.admin.Repository.RoleRepository;
import com.example.admin.Repository.UserRepository;
import com.example.admin.modelEntity.RolePermissions;
import com.example.admin.modelEntity.User;
import com.example.admin.payload.respone.RolePermissionRespone;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolePermissionServiceImpl  implements  RolePermissionService{



    @Autowired
    private RolePermissionRepository rolePermissionRepository;

    private RoleRepository roleRepository;

    @Override
    public RolePermissions saveRolePermissions(RolePermissions rolePermissions) {
        return null;
    }

    @Override
    public List<RolePermissions> fecthRolePermissionList() {
        return(List<RolePermissions>) rolePermissionRepository.findAll();
    }

        public RolePermissions getRolePermissionsById(Long roleId, RolePermissionRespone rolePermissionRespone){
            Optional<RolePermissions> optionalRolePermissions =  rolePermissionRepository.findById(roleId);

            if(optionalRolePermissions.isPresent()){
                RolePermissions user1 = optionalRolePermissions.get();
                user1.getRoleId();
               // user1.getPermissionId(RolePermissionRespone.get());

                user1.setRoleId(optionalRolePermissions.get().getRoleId());

                //return rolePermissionRepository.findById(user1);
            }else {
                //throw new UserNotFoundException("User with ID " + userid + " not found");
            }

        return null;

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

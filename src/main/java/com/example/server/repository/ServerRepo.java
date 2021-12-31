package com.example.server.repository;

import com.example.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

// This grants the Sever model a ton of methods to find/update from database.

public interface ServerRepo extends JpaRepository<Server, Long> {
    // Naming is very important here. findBy tells the repo that you are finding by whatever the next part of the methodName is
    // IpAddress will be what is finding by.
    // Supply the ipAddress
    // Make sure that whatever value will be unique or JPA will blow an error.
    Server findByIpAddress(String ipAddress);
}

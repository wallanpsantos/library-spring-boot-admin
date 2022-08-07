package com.br.libraryspringbootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class LibrarySpringBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarySpringBootAdminApplication.class, args);

    }
}

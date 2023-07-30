package com.example.LibrarySystem.rest;

import com.example.LibrarySystem.services.RolPrivilegioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RolPrivilegio/")
public class RolPrivilegioRest {
    @Autowired
    private RolPrivilegioService rolPrivilegioService;
}

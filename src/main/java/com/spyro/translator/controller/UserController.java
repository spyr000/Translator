package com.spyro.translator.controller;


import com.spyro.translator.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

//    @GetMapping("/{username}/projects")
//    public ResponseEntity<?> getUserProjects(
//            @RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader,
//            @PathVariable(name = "username") String username
//    ) {
//
//        var user = userService.getUser(username);
//
//        return ResponseEntity.ok()
//                .body(projectService.getAllUserProjects(user));
//    }
}

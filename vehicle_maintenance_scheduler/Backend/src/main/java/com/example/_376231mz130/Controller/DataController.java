package com.example._376231mz130.Controller;

import com.example._376231mz130.Service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/fetch")
    public ResponseEntity<String> getData() {
        String data = apiService.fetchData();
        return ResponseEntity.ok(data);
    }
}

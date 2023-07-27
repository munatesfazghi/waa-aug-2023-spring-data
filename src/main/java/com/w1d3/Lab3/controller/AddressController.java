package com.w1d3.Lab3.controller;

import com.w1d3.Lab3.dto.AddressDto;
import com.w1d3.Lab3.impl.AddressServiceImpl;
import com.w1d3.Lab3.repository.AddressRepository;
import com.w1d3.Lab3.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public void save(@RequestBody AddressDto addressDto){
        addressService.save(addressDto);
    }
    @GetMapping("/{id}")
    public AddressDto getOne(@PathVariable Long id){
        return addressService.getOne(id);
    }
    @GetMapping
    public List<AddressDto> getAll(){
        return addressService.getAll();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        addressService.delete(id);
    }
}

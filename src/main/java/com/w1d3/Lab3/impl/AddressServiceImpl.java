package com.w1d3.Lab3.impl;

import com.w1d3.Lab3.dto.AddressDto;
import com.w1d3.Lab3.model.Address;
import com.w1d3.Lab3.repository.AddressRepository;
import com.w1d3.Lab3.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void save(AddressDto addressDto) {
      Address address = modelMapper.map(addressDto, Address.class);
       addressRepository.save(address);
    }

    @Override
    public AddressDto getOne(Long id) {
        Address address= addressRepository.findById(id).get();
        AddressDto addressDto = modelMapper.map(address, AddressDto.class);
        return addressDto;
    }

    @Override
    public List<AddressDto> getAll() {
        List<Address> addresses = addressRepository.findAll();
        List<AddressDto> addressDtos = new ArrayList<>();
        addresses.forEach(address -> {
           AddressDto addressDto =  modelMapper.map(address, AddressDto.class);
            addressDtos.add(addressDto);
        });
        return addressDtos;
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

}

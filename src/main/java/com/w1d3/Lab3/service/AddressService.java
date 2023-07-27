package com.w1d3.Lab3.service;

import com.w1d3.Lab3.dto.AddressDto;
import com.w1d3.Lab3.model.Address;

import java.util.List;

public interface AddressService {
    void save(AddressDto address);

    AddressDto getOne(Long id);

    List<AddressDto> getAll();

    void delete(Long id);
}

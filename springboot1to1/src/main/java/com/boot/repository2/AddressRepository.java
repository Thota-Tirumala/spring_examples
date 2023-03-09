package com.boot.repository2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model2.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}

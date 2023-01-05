package com.masai.service;

import java.util.List;

import com.masai.exceptions.AddressException;
import com.masai.model.Address;

public interface AddressService {
	
	public Address addAddress(Address address)throws AddressException;
	
	public Address updateAddress(Address address)throws AddressException;
	
	public Address deleteAddressId(Integer addressId) throws AddressException;
	
	public List<Address> getAllAddress() throws AddressException;
	
//	public List<Address> getAllAddressByState(String state) throws AddressException;
	
	public Address viewAddressById(Integer addressId)throws AddressException;
}

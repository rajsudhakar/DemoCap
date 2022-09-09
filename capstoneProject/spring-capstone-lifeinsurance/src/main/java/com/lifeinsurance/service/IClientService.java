package com.lifeinsurance.service;

import java.util.List;

import com.lifeinsurance.model.Client;

public interface IClientService {

	void addClient(Client client);
	void updateClient(int clientId, long phoneNumber);
	void deleteClient(int clientId);
	
//	
//	List<Client> getByClientName(String clientName);
//	List<Client> getByClientId(int clientId);
}


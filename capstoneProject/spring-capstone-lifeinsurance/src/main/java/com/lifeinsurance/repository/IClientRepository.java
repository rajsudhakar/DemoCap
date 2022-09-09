package com.lifeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Client;
import com.lifeinsurance.model.Nominee;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {
//	List<Client> findByName(String clientName);
//	List<Client> findById(int clientId);
//	List<Client> getByNameAndId(String clientName,int clientId);
//	List<Client> getByIdAndNominee(int  clientId,Nominee nominee);

}

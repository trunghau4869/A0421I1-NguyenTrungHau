package com.example.cesutudy.repository.contract;

import com.example.cesutudy.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepo extends JpaRepository<Contract,Integer> {
}

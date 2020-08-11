package com.lambdaschool.getorder.repositories;


import com.lambdaschool.getorder.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agent, Long> {
}

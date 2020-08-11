package com.lambdaschool.getorder.services;


import com.lambdaschool.getorder.models.Agent;
import com.lambdaschool.getorder.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "agentService")
public class AgentServiceImpl implements AgentServices {
    @Autowired
    private AgentRepository agentrepos;


    @Override
    public Agent save(Agent agent) {
        return agentrepos.save(agent);
    }
}
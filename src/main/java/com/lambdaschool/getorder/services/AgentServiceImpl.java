package com.lambdaschool.getorder.services;


import com.lambdaschool.getorder.models.Agent;
import com.lambdaschool.getorder.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service(value = "agentService")
public class AgentServiceImpl implements AgentServices {
    @Autowired
    private AgentRepository agentrepos;

    @Override
    public Agent findAgentsById(long id) {
        return agentrepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Agent " + id + "Not Found!"));
    }

    @Transactional
    @Override
    public Agent save(Agent agent) {
        return agentrepos.save(agent);
    }
}
package com.lambdaschool.getorder.services;


import com.lambdaschool.getorder.models.Agent;

public interface AgentServices {

    Agent findAgentsById(long id);


    Agent save(Agent agent);

}

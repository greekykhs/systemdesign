package com.loadbalancing;

import com.loadbalancing.model.Node;
import com.loadbalancing.model.Request;

public interface Router {
    void addNode(Node node);
    void removeNode(Node node);
    Node getAssignedNode(Request request);
}
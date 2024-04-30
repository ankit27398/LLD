package org.example;

import java.util.ArrayList;
import java.util.List;

public class AgentManager {
    private static List<CustomerServiceAgent> agentsInSystem = new ArrayList<>();

    public static void addAgent(String emailId, String name, List<IssueType> issueTypes) {
        CustomerServiceAgent createdAgent = new CustomerServiceAgent(emailId, name, issueTypes);
        agentsInSystem.add(createdAgent);
    }

    public static CustomerServiceAgent getAvailableAgent(IssueType issueType) {
        CustomerServiceAgent minAssignedAgent = null;
        int minAssigned = Integer.MAX_VALUE;
        for(CustomerServiceAgent agent : agentsInSystem) {
            if(agent.getKnownIssueTypes().contains(issueType) && agent.getOpenIssue() == null) {
                return agent;
            } else {
                List<Integer> queuedIssues = agent.getQueuedIssues();
                if(queuedIssues.size() < minAssigned) {
                    minAssigned = queuedIssues.size();
                    minAssignedAgent = agent;
                }
            }
        }
        return minAssignedAgent;
    }

    public static IssueState assignIssue(CustomerServiceAgent csa, int issueId) {
        return csa.assignIssue(issueId);
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class IssueManager {


    public abstract Issue createIssue(int tranId, String subject,
                                   String desc, String email);

    /*
     Can be implemented in individual Issue managers where it can provide own implementation of assigning agents
     */
    public IssueState assignIssue(int issueId) {
        IssueType isType = IssueCrudUtil.getIssueType(issueId);
        CustomerServiceAgent applicableAgent = AgentManager.getAvailableAgent(isType);
        IssueState assignStatus = AgentManager.assignIssue(applicableAgent, issueId);
        IssueCrudUtil.updateIssueState(issueId, assignStatus);
        System.out.println("Issue "+issueId+" has been "+assignStatus.toString()+" to "+applicableAgent.getName());
        return assignStatus;
    }


}

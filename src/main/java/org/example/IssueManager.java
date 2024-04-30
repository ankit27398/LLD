package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class IssueManager {
    private List<Issue> issuesInSystem = new ArrayList<>();

    public abstract Issue createIssue(int tranId, String subject,
                                   String desc, String email);

    public void addIssueToList(Issue createIssue) {
        issuesInSystem.add(createIssue);
    }

    public void assignIssue(int issueId) {

        // CustomerServiceAgent applicableAgent = AgentManager.getAvailableAgent()
    }



}

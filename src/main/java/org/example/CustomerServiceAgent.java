package org.example;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceAgent {
    private String emailId;
    private String name;
    private List<IssueType> knownIssueTypes;
    private Integer openIssue;
    private List<Integer> queuedIssues;

    public CustomerServiceAgent(String emailId, String name, List<IssueType> issueTypes) {
        this.emailId = emailId;
        this.name = name;
        this.knownIssueTypes = issueTypes;
        this.queuedIssues = new ArrayList<>();
    }

    public List<IssueType>  getKnownIssueTypes() {
        return this.knownIssueTypes;
    }

    public Integer getOpenIssue() {
        return this.openIssue;
    }

    public List<Integer> getQueuedIssues() {
        return this.queuedIssues;
    }

    public String getName() {
        return this.name;
    }

    public IssueState assignIssue(int issueId) {
        if (openIssue == null) {
            openIssue = issueId;
            return IssueState.ASSIGNED;
        } else {
            queuedIssues.add(issueId);
            return IssueState.QUEUED;
        }
    }
}

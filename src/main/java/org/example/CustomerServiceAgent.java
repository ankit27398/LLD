package org.example;

import java.util.List;

public class CustomerServiceAgent {
    private String emailId;
    private String name;
    private List<Issue> assignedIssues;
    private List<IssueType> knownIssueTypes;
    private Issue openIssue;
    private List<Issue> queuedIssues;

    public CustomerServiceAgent(String emailId, String name, List<IssueType> issueTypes) {
        this.emailId = emailId;
        this.name = name;
        this.knownIssueTypes = issueTypes;
    }

    public List<IssueType>  getKnownIssueTypes() {
        return this.knownIssueTypes;
    }

    public Issue getOpenIssue() {
        return this.openIssue;
    }

    public List<Issue> getQueuedIssues() {
        return this.queuedIssues;
    }
}

package org.example;

public interface Issue {
    public IssueState getIssueState();

    public boolean updateIssueState(IssueState tgtIssueState);

    public IssueType getIssueType();

    public String getCustEmail();

    public int getIssueId();

    public String getAssignedCSAName();

    public IssueDetails getIssueDetails();

    public int getTrandId();

}

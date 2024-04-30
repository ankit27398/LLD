package org.example;

public interface Issue {
    public IssueState getIssueState();

    public void updateIssueState(StateContext tgtIssueContext);

    public IssueType getIssueType();

    public String getCustEmail();

    public int getIssueId();

    public String getAssignedCSAName();

    public IssueDetails getIssueDetails();

    public int getTrandId();

    //public void changeStateContext(StateContext tgtStateContext);
}
package org.example;

public interface StateContext {
    public void updateIssueState(Issues issue, StateContext tgtIssueContext);

    public IssueState getIssueState();
}

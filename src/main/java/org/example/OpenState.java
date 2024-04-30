package org.example;

public class OpenState implements StateContext {
    public void updateIssueState(Issues issue, StateContext tgtIssueContext) {
        // Add logic to validate the transition here
        issue.changeStateContext(tgtIssueContext);
    }

    public IssueState getIssueState() {
        return IssueState.OPEN;
    }
}

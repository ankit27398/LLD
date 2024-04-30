package org.example;
import java.util.Random;

public abstract class Issues implements Issue {
    private StateContext stateContext;
    private String assignedCSAName;
    private IssueType issueType;
    private String custEmailId;
    private IssueDetails issueDetails;
    private int id;
    private int tranId;

    public Issues(int tranId, String subject,
                  String desc, String email, IssueType issueType) {
        this.tranId = tranId;
        this.issueDetails = new IssueDetails(subject, desc);
        this.custEmailId = email;
        this.issueType = issueType;
        createIssueId();
        stateContext = new OpenState();
    }

    private void createIssueId() {
        Random rand = new Random();
        this.id = rand.nextInt(100);
    }

    protected void changeStateContext(StateContext tgtStateContext) {
        this.stateContext = tgtStateContext;
    }

    public IssueType getIssueType() {
        return this.issueType;
    }

    public int getTrandId() {
        return this.tranId;
    }

    public IssueState getIssueState() {
        return this.stateContext.getIssueState();
    };

    public void updateIssueState(StateContext tgtIssueContext) {
        this.stateContext.updateIssueState(this, tgtIssueContext);
    };

    public String getCustEmail() {
        return this.custEmailId;
    }

    public int getIssueId() {
        return this.id;
    }

    public String getAssignedCSAName() {
        return this.assignedCSAName;
    }

    public IssueDetails getIssueDetails() {
        return this.issueDetails;
    }
}

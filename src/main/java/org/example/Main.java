package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello world!");
        Integer issueId1 = createIssue(1, IssueType.PAYMENT_RELATED, "test-issue-1", "test issue 1", "test1@gmail.com");
        Integer issueId2 = createIssue(2, IssueType.PAYMENT_RELATED, "test-issue-2", "test issue 2", "test2@gmail.com");
        Integer issueId3 = createIssue(3, IssueType.PAYMENT_RELATED, "test-issue-3", "test issue 3", "test3@gmail.com");

        createAgent("agent1@gmail.com", "Agent1", Arrays.asList(IssueType.PAYMENT_RELATED));
        createAgent("agent2@gmail.com", "Agent2", Arrays.asList(IssueType.PAYMENT_RELATED));

        assignIssue(issueId1);
        assignIssue(issueId2);
        assignIssue(issueId3);
    }

    public static Integer createIssue(int tranId, IssueType issueType, String subject,
    String desc, String email) {
        try {
            IssueManager issueManager = getIssueManager(issueType);
            Issue createdIssue = issueManager.createIssue(tranId, subject, desc, email);
            System.out.println("Issue created with ID: "+createdIssue.getIssueId());
            return createdIssue.getIssueId();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static IssueManager getIssueManager(IssueType issueType) throws Exception {
        if(issueType == IssueType.PAYMENT_RELATED) {
            return new PaymentRelatedIssueManager();
        } else {
            throw new Exception("issue type not recognized");
        }
    }

    public static void createAgent(String emailId, String name, List<IssueType> issueTypes) {
        AgentManager.addAgent(emailId, name, issueTypes);
        System.out.println("Agent "+name+" created");
    }

    public static void assignIssue(int issueId) {
        try {
            IssueManager issueManager = getIssueManager(IssueCrudUtil.getIssueType(issueId));
            IssueState assignState = issueManager.assignIssue(issueId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getIssues(Map<FilterTypes, String> filterInput) {

        // ToDo: Use chain of responsibility to create handlers for different FiltrTypes
    }

    public static void updateIssue(int issueId, IssueState tgtState, String resolution) {
        // Use issueCrudUtil to make a call to update to desired state
    }

    public static void resolveIssue(int issueId, String resolution) {
        updateIssue(issueId, IssueState.RESOLVED, resolution);
    }




}
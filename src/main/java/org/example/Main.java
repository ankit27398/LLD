package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static void createIssue(int tranId, IssueType issueType, String subject,
    String desc, String email) throws Exception {
        IssueManager issueManager;
        if(issueType == IssueType.PAYMENT_RELATED) {
            issueManager = new PaymentRelatedIssueManager();
        } else {
            throw new Exception("issue type not recognized");
        }
        issueManager.createIssue(tranId, subject, desc, email);
    }

    public static void createAgent(String emailId, String name, List<IssueType> issueTypes) {
        AgentManager.addAgent(emailId, name, issueTypes);
    }


}
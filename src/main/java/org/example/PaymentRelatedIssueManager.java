package org.example;

public class PaymentRelatedIssueManager extends IssueManager{
    public Issue createIssue(int tranId, String subject,
                            String desc, String email) {
        Issue createdIssue =  new PaymentRelatedIssue(tranId, subject, desc, email);
        IssueCrudUtil.addIssueToList(createdIssue);
        return createdIssue;
    }
}

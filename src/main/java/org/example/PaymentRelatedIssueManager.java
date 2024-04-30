package org.example;

public class PaymentRelatedIssueManager extends IssueManager{
    public Issue createIssue(int tranId, String subject,
                            String desc, String email) {
        Issue createIssue =  new PaymentRelatedIssue(tranId, subject, desc, email);
        addIssueToList(createIssue);
        return createIssue;
    }
}

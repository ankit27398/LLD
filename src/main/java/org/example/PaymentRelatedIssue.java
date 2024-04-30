package org.example;

public class PaymentRelatedIssue extends Issues {

    public PaymentRelatedIssue(int tranId, String subject,
                               String desc, String email) {
        super(tranId, subject, desc, email, IssueType.PAYMENT_RELATED);

    }
}

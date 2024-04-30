package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IssueCrudUtil {
    private static Map<Integer, Issue> issuesMap = new HashMap<>();

    public static void addIssueToList(Issue createdIssue) {
        issuesMap.put(createdIssue.getIssueId(), createdIssue);
    }

    private static Issue getIssue(int issueId) {
        return issuesMap.get(issueId);
    }

    public static IssueType getIssueType(int issueId) {
        Issue is = getIssue(issueId);
        return is.getIssueType();
    }

    public static void updateIssueState(int issueId, IssueState tgtIssueState) {
        Issue is = getIssue(issueId);

        // is.updateIssueState(tgtIssueState);
    }

    public static List<Issue> getIssuesOfCertainType(IssueType filterType) {
        return issuesMap.values().stream().filter(entry -> entry.getIssueType().equals(filterType)).collect(Collectors.toList());
    }
}

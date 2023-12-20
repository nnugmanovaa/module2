package task2;

public class Main {
    public static void main(String[] args) {
        Task work = new Task("desk", "normal", "assignee", "issuer", "issueDat");
        Task work2 = new Task("desk", "normal", "assignee", "issuer", "issueDat");
        Task work3 = new Task("desk", "normal", "assignee", "issuer", "issueDat");

        System.out.println(work.getDescription());
        System.out.println(work.getType());
        System.out.println(work.getAssignee());
        System.out.println(work.getIssuer());
        System.out.println(work.getIssueDate());

        System.out.println(work2.getDescription());
        System.out.println(work2.getType());
        System.out.println(work2.getAssignee());
        System.out.println(work2.getIssuer());
        System.out.println(work2.getIssueDate());

        System.out.println(work3.getDescription());
        System.out.println(work3.getType());
        System.out.println(work3.getAssignee());
        System.out.println(work3.getIssuer());
        System.out.println(work3.getIssueDate());
    }
}

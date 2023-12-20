package task2;

public class Task {
    //Данный класс состоит из данных атрибутов: description, type, assignee, issuer, issueDate. Все атрибуты имеют тип String.
    //Скажем что для атрибута type у нас могут быть только эти значения: normal, major, critical.
    private String description;
    private String type;
    private String assignee;
    private String issuer;
    private String issueDate;

    public Task(String description, String type, String assignee, String issuer, String issueDate) {
        this.description = description;
        setType(type);
        this.assignee = assignee;
        this.issuer = issuer;
        this.issueDate = issueDate;
    }

    public Task() {
        this.description = null;
        setType(null);
        this.assignee = null;
        this.issuer = null;
        this.issueDate = null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        if (type.equalsIgnoreCase("normal") || type.equalsIgnoreCase("major") || type.equalsIgnoreCase("critical")) {
            this.type = type.toLowerCase();
        } else {
            System.out.println("Недопустимое значение для типа задачи. Используйте 'normal', 'major' или 'critical'.");
        }
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
}

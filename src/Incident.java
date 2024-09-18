public class Incident {
    private String id;
    private String description;
    private String priority;
    private String status;
    private String resolutionNotes;

    // Constructor
    public Incident(String id, String description, String priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.status = "New";  // Default status
        this.resolutionNotes = "";  // No notes initially
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResolutionNotes() {
        return resolutionNotes;
    }

    public void setResolutionNotes(String resolutionNotes) {
        this.resolutionNotes = resolutionNotes;
    }

    @Override
    public String toString() {
        return "Incident ID: " + id + ", Description: " + description +
                ", Priority: " + priority + ", Status: " + status +
                ", Resolution Notes: " + resolutionNotes;
    }
}




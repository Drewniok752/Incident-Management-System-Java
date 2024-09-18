import java.util.ArrayList;
import java.util.List;

public class IncidentManager {
    private List<Incident> incidents;

    public IncidentManager() {
        incidents = new ArrayList<>();
    }

    public void addIncident(Incident incident) {
        incidents.add(incident);
    }

    public void updateIncident(String id, String status, String resolutionNotes) {
        for (Incident incident : incidents) {
            if (incident.getId().equals(id)) {
                incident.setStatus(status);
                incident.setResolutionNotes(resolutionNotes);
                return;
            }
        }
    }

    public List<Incident> getIncidents() {
        return incidents;
    }

    public Incident getIncidentById(String id) {
        for (Incident incident : incidents) {
            if (incident.getId().equals(id)) {
                return incident;
            }
        }
        return null;
    }

    public List<Incident> filterByPriority(String priority) {
        List<Incident> filtered = new ArrayList<>();
        for (Incident incident : incidents) {
            if (incident.getPriority().equals(priority)) {
                filtered.add(incident);
            }
        }
        return filtered;
    }
}


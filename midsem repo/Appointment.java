public class Appointment implements Comparable<Appointment> {
    private String patientName;
    private String symptoms;
    private int urgencyLevel; // 1: Emergency, 2: Urgent, 3: Routine
    private String timeSlot;

    public Appointment(String patientName, String symptoms, String timeSlot) {
        this.patientName = patientName;
        this.symptoms = symptoms;
        this.timeSlot = timeSlot;
        this.urgencyLevel = determineUrgency(symptoms);
    }

    // A simple, rule-based Triage Algorithm (Problem Definition/Algorithm Development)
    private int determineUrgency(String symptoms) {
        String lowerCaseSymptoms = symptoms.toLowerCase();
        if (lowerCaseSymptoms.contains("chest pain") || lowerCaseSymptoms.contains("difficulty breathing")) {
            return 1; // Highest Urgency
        } else if (lowerCaseSymptoms.contains("fever") || lowerCaseSymptoms.contains("severe headache")) {
            return 2; // Urgent
        } else {
            return 3; // Routine
        }
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }

    @Override
    public String toString() {
        String level = switch (urgencyLevel) {
            case 1 -> "EMERGENCY";
            case 2 -> "URGENT";
            case 3 -> "ROUTINE";
            default -> "UNKNOWN";
        };
        return String.format("[%s] Patient: %s, Symptoms: '%s', Time: %s", level, patientName, symptoms, timeSlot);
    }

    // Implementation for Priority Queue (Applying Concepts/Data Structures)
    @Override
    public int compareTo(Appointment other) {
        // Natural ordering is ascending, so to make 1 (EMERGENCY) come first,
        // we compare this.level to other.level. Lower number = higher priority.
        return Integer.compare(this.urgencyLevel, other.urgencyLevel);
    }
}
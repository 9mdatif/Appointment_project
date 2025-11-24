import java.util.PriorityQueue;

public class Scheduler {
    // PriorityQueue ensures the Appointment with the lowest urgencyLevel (1=highest) is at the head.
    private PriorityQueue<Appointment> appointmentQueue; 

    public Scheduler() {
        // Tool/Library Use: Using Java's built-in PriorityQueue
        this.appointmentQueue = new PriorityQueue<>(); 
    }

    // Method to add a new appointment (Implementation)
    public void addAppointment(String patientName, String symptoms, String timeSlot) {
        Appointment newAppointment = new Appointment(patientName, symptoms, timeSlot);
        appointmentQueue.add(newAppointment);
        System.out.printf("\n[SYSTEM] Added Appointment: %s. Urgency Level: %d\n", patientName, newAppointment.getUrgencyLevel());
    }

    // Method to process the next appointment (Automation)
    public void processNextAppointment() {
        if (appointmentQueue.isEmpty()) {
            System.out.println("\n[SYSTEM] No appointments in the queue.");
            return;
        }
        
        // Polling removes the highest priority item (lowest urgencyLevel)
        Appointment nextAppointment = appointmentQueue.poll(); 
        System.out.println("\n--- Processing Next Appointment ---");
        System.out.println("Processing: " + nextAppointment);
        System.out.println("--- Appointment Processed Successfully ---");
    }

    public static void main(String[] args) {
        Scheduler clinicScheduler = new Scheduler();

        // 1. Routine patient registers first
        clinicScheduler.addAppointment("Alice Johnson", "Annual check-up", "10:00 AM");
        
        // 2. Urgent patient registers second
        clinicScheduler.addAppointment("Bob Williams", "Severe headache and vomiting", "10:30 AM");
        
        // 3. Emergency patient registers last
        clinicScheduler.addAppointment("Charlie Brown", "Sudden, crushing chest pain", "11:00 AM");

        // The system will now process them based on urgency, not submission time.
        System.out.println("\n--- STARTING THE DAILY SCHEDULE ---");
        
        // Process 1: Charlie (Emergency) should be first
        clinicScheduler.processNextAppointment(); 
        
        // Process 2: Bob (Urgent) should be second
        clinicScheduler.processNextAppointment(); 
        
        // Process 3: Alice (Routine) should be last
        clinicScheduler.processNextAppointment();
    }
}
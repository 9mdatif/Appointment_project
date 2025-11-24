# Appointment_project
# 📅 Appointment Scheduling System

## 📌 Overview
This project is a simple **Java-based appointment scheduling system** that prioritizes appointments based on urgency. It uses object-oriented programming concepts and Java’s `PriorityQueue` to ensure that **more urgent appointments are handled first**.

The project contains two main files:

- **Appointment.java** – Defines the appointment structure and urgency logic  
- **Scheduler.java** – Handles storage, sorting, and retrieval of appointments

---

## 📁 Project Files

```
Appointment.java  
Scheduler.java
```

---

## 🧩 Features

- ✔️ Automatic urgency detection from symptoms  
- ✔️ Priority-based appointment scheduling  
- ✔️ Clean OOP structure (classes, encapsulation, comparison logic)  
- ✔️ Easily extendable for real-world clinic/hospital usage  

---

## 🧱 Class Descriptions

### **1. Appointment.java**
This class:

- Stores patient details:
  - Name  
  - Symptoms  
  - Urgency Level  
  - Appointment Time  
- Uses an internal method to determine urgency based on symptom keywords  
- Implements `Comparable<Appointment>` to sort by urgency  
- Higher urgency → higher priority in the queue  

---

### **2. Scheduler.java**
This class:

- Manages all appointments using a `PriorityQueue<Appointment>`  
- Adds new appointments  
- Retrieves the highest-priority appointment  
- Displays all appointments in sorted order  
- Acts as the controller of the system  

---

## ▶️ How to Compile & Run

### **1. Compile**
```bash
javac Appointment.java Scheduler.java
```

### **2. Run**
If your `Scheduler` file contains a `main()` method:
```bash
java Scheduler
```

---

## 🧪 Example Main Method (Optional)
Add this inside `Scheduler.java` if you want to test quickly:

```java
public static void main(String[] args) {
    Scheduler scheduler = new Scheduler();

    scheduler.addAppointment("Aman", "Chest pain", "10:00 AM");
    scheduler.addAppointment("Riya", "Cold and fever", "10:15 AM");
    scheduler.addAppointment("Karan", "Heavy bleeding", "10:30 AM");

    System.out.println("Next Appointment:");
    System.out.println(scheduler.getNextAppointment());

    System.out.println("\nAll Appointments:");
    scheduler.viewAllAppointments();
}
```

---

If you want, I can also make:  
✅ UML Diagram  
✅ PDF Documentation  
✅ Well-commented versions of both Java files  
## ScreenShots of Output
<img width="1297" height="528" alt="f7f8715e-b36b-4b2f-ae96-f9e5bb79422d" src="https://github.com/user-attachments/assets/dce30691-2472-4687-86f0-a0162093739f" />

---

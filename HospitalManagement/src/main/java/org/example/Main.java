package org.example;

public class Main {
    public static void main(String[] args) {
        Patient P = new Patient();
        P.setPatientName("Shiva");
        P.setAge(22);
        P.setPatientID("S56");
        P.setAddress("New Delhi");

        Doctor D = new Doctor();
        D.setDoctorName("Narayan");
        D.setExperience(12);
        D.setDocSpecialistIn("Gynecologist");
        System.out.println("Patient Name:" + P.getPatientName());
        System.out.println("Patient Id:" + P.getPatientID());
        System.out.println("Patient address:" + P.getPatientID());
        System.out.println("Patient Age:" + P.getAge());
        System.out.println("Doctor Name:" + D.getDoctorName());
        System.out.println("Doctor Specialist In:" + D.getDocSpecialistIn());
        System.out.println("Doctor Experience:" + D.getExperience());
    }
}
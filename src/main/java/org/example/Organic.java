package org.example;

public class Organic extends Runner {
    String genus;
    public Organic(String type, int maxJump, int maxSprint, String genus) {
        super(type, maxJump, maxSprint);
        this.genus = genus;
    }
}

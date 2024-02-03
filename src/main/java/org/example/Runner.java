package org.example;

abstract class Runner {
    int maxJump;
    int maxSprint;
    String type;
    public Runner(String type, int maxJump, int maxSprint) {
        this.type = type;
        this.maxJump = maxJump;
        this.maxSprint = maxSprint;
    }
    public Runner() {
    }
    void run(int sprint) {
    }
    void jumping(int jump) {
    }
}

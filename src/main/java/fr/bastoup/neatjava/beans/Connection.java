package fr.bastoup.neatjava.beans;

public class Connection {

    private int nodeIn;
    private int nodeOut;
    private double weight;
    private boolean enabled;
    private int innovationId;

    public Connection(int nodeIn, int nodeOut, double weight, boolean enabled, int innovationId) {
        this.nodeIn = nodeIn;
        this.nodeOut = nodeOut;
        this.weight = weight;
        this.enabled = enabled;
        this.innovationId = innovationId;
    }

    public int getNodeIn() {
        return nodeIn;
    }

    public void setNodeIn(int nodeIn) {
        this.nodeIn = nodeIn;
    }

    public int getNodeOut() {
        return nodeOut;
    }

    public void setNodeOut(int nodeOut) {
        this.nodeOut = nodeOut;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getInnovationId() {
        return innovationId;
    }

    public void setInnovationId(int innovationId) {
        this.innovationId = innovationId;
    }
}

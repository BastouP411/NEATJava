package fr.bastoup.neatjava.beans;

public class Node {

    private int id;
    private NodePos nodePos;


    public Node(int id, NodePos nodePos) {
        this.id = id;
        this.nodePos = nodePos;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodePos getNodePos() {
        return nodePos;
    }

    public void setNodePos(NodePos nodePos) {
        this.nodePos = nodePos;
    }
}

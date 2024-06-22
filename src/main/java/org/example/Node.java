package org.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Node {
    private Node parent;
    private final List<Node> children;
    private final Command key;


    public Node(@JsonProperty("parent") final Node parent, @JsonProperty("key") final Command key) {
        this.parent = parent;
        this.key = key;
        children = new ArrayList<>();
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(final Node node) {
        this.parent = node;
    }

    public List<Node> getChildren() {
        return children;
    }
}

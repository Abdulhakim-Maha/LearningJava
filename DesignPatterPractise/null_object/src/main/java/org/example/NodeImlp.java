package org.example;

import lombok.extern.slf4j.Slf4j;

public class NodeImlp implements Node{
    private final String name;
    private final Node left;

    public NodeImlp(String name, Node left, Node right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    private final Node right;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTreeSize() {
        return 1 + left.getTreeSize() + right.getTreeSize();
    }

    @Override
    public Node getLeft() {
        return left;
    }

    @Override
    public Node getRight() {
        return right;
    }

    @Override
    public void walk() {
        if(left.getTreeSize() > 0){
            left.walk();
        }
        if( right.getTreeSize() > 0){
            right.walk();
        }
    }
}

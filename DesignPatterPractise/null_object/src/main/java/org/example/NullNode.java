package org.example;

public class NullNode implements Node{
    private static final NullNode instance = new NullNode();

    private NullNode(){

    }

    public static NullNode getInstance() {
        return instance;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getTreeSize() {
        return 0;
    }

    @Override
    public Node getLeft() {
        return null;
    }

    @Override
    public Node getRight() {
        return null;
    }

    @Override
    public void walk() {

    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        var root = new NodeImlp("1",
                new NodeImlp("11",
                        new NodeImlp("111", NullNode.getInstance(), NullNode.getInstance()),
                        NullNode.getInstance()
                ),
                new NodeImlp("12",
                        NullNode.getInstance(),
                        new NodeImlp("122", NullNode.getInstance(), NullNode.getInstance())
                )
        );
        root.walk();
    }
}
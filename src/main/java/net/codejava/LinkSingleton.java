package net.codejava;

public class LinkSingleton {
    private static LinkSingleton instance = null;
    private Link link;

    private LinkSingleton() {
        link = new Link();
    }

    public static LinkSingleton getInstance() {
        if (instance == null) {
            instance = new LinkSingleton();
        }
        return instance;
    }

    public Link getLink() {
        return link;
    }
}

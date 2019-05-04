package com.felix.design.principle.liskovsubstitution.version_1;

/**
 * Created by geely
 */
public class Rectangle {
    private long length;
    private long width;

    public long getWidth() {
        return width;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}

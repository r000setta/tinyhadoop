package com.jqy.tinyhadoop.io;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class IntWritable implements WritableComparable<IntWritable> {
    private int value;

    public IntWritable(int value) {
        this.value = value;
    }

    public IntWritable() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void write(DataOutput output) throws IOException {
        output.writeInt(value);
    }

    @Override
    public void read(DataInput input) throws IOException {
        value = input.readInt();
        this.setValue(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof IntWritable))
            return false;
        IntWritable intWritable = (IntWritable) obj;
        return this.value == intWritable.value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public int compareTo(IntWritable o) {
        int thisValue = value;
        int thatValue = o.getValue();
        return (thisValue < thatValue ? -1 : (thisValue == thatValue ? 0 : 1));
    }
}

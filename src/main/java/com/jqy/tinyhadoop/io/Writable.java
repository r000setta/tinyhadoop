package com.jqy.tinyhadoop.io;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public interface Writable {
    void write(DataOutput output) throws IOException;

    void read(DataInput input) throws IOException;
}

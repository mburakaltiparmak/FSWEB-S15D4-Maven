package org.example;

import java.util.ArrayList;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class WorkintechList extends ArrayList {
    
    @Override
    public Object[] toArray(IntFunction generator) {
        return super.toArray(generator);
    }

    @Override
    public Stream stream() {
        return super.stream();
    }

    @Override
    public Stream parallelStream() {
        return super.parallelStream();
    }
}

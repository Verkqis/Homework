package io.codelex.oop.summary;

import java.util.function.Supplier;

public class LazyBox<T> {
    private Supplier<T> initializer;
    private T contents;

    public LazyBox(Supplier<T> initializer) {
        this.initializer = initializer;
    }

    public T get() {
        if (contents == null) {
            contents = initializer.get();
        }
        return contents;
    }

}

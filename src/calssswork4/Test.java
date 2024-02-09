package calssswork4;

import java.nio.file.Path;

public class Test {
    public static void main(String[] args) {
        Path path = Path.of("root", "child", "subchild");
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getParent());
    }
}

package DayThree;

/*
In Java, when someone asks for the “actual size of an object”, they’re usually referring to the memory footprint (in bytes) of an object in the JVM heap.
This is a bit tricky because Java does not provide a direct built-in way to get object size.

Let’s break it down cleanly 👇

🧠 1. What determines object size?
An object in Java consists of:

✅ 1. Object Header
    Mark word (hashcode, GC info, etc.)
    Class metadata pointer
    👉 Typically 12–16 bytes (depends on JVM & architecture)
✅ 2. Instance Variables
    Fields defined in the class
    Size depends on data types:
    int → 4 bytes
    long → 8 bytes
    double → 8 bytes
    boolean → 1 byte (but padded)
    Object reference → 4 or 8 bytes
✅ 3. Padding (Alignment)
    JVM aligns objects to 8-byte boundaries
    Extra unused bytes may be added


⚠️ 2. Why Java doesn’t give exact size?
Because:
    JVM implementation varies (HotSpot, OpenJ9, etc.)
    Compressed OOPs (ordinary object pointers) affect size
    Object layout is JVM-dependent
 */
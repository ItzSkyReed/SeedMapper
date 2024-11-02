// Generated by jextract

package com.github.cubiomes;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.*;
import static java.lang.foreign.ValueLayout.*;

/**
 * {@snippet lang=c :
 * struct DoublePerlinNoise {
 *     double amplitude;
 *     OctaveNoise octA;
 *     OctaveNoise octB;
 * }
 * }
 */
public class DoublePerlinNoise {

    DoublePerlinNoise() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        CubiomesHeaders.C_DOUBLE.withName("amplitude"),
        OctaveNoise.layout().withName("octA"),
        OctaveNoise.layout().withName("octB")
    ).withName("DoublePerlinNoise");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfDouble amplitude$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("amplitude"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double amplitude
     * }
     */
    public static final OfDouble amplitude$layout() {
        return amplitude$LAYOUT;
    }

    private static final long amplitude$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double amplitude
     * }
     */
    public static final long amplitude$offset() {
        return amplitude$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double amplitude
     * }
     */
    public static double amplitude(MemorySegment struct) {
        return struct.get(amplitude$LAYOUT, amplitude$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double amplitude
     * }
     */
    public static void amplitude(MemorySegment struct, double fieldValue) {
        struct.set(amplitude$LAYOUT, amplitude$OFFSET, fieldValue);
    }

    private static final GroupLayout octA$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("octA"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * OctaveNoise octA
     * }
     */
    public static final GroupLayout octA$layout() {
        return octA$LAYOUT;
    }

    private static final long octA$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * OctaveNoise octA
     * }
     */
    public static final long octA$offset() {
        return octA$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * OctaveNoise octA
     * }
     */
    public static MemorySegment octA(MemorySegment struct) {
        return struct.asSlice(octA$OFFSET, octA$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * OctaveNoise octA
     * }
     */
    public static void octA(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, octA$OFFSET, octA$LAYOUT.byteSize());
    }

    private static final GroupLayout octB$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("octB"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * OctaveNoise octB
     * }
     */
    public static final GroupLayout octB$layout() {
        return octB$LAYOUT;
    }

    private static final long octB$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * OctaveNoise octB
     * }
     */
    public static final long octB$offset() {
        return octB$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * OctaveNoise octB
     * }
     */
    public static MemorySegment octB(MemorySegment struct) {
        return struct.asSlice(octB$OFFSET, octB$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * OctaveNoise octB
     * }
     */
    public static void octB(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, octB$OFFSET, octB$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

// Generated by jextract

package com.github.cubiomes;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct NetherNoise {
 *     DoublePerlinNoise temperature;
 *     DoublePerlinNoise humidity;
 *     PerlinNoise oct[8];
 * }
 * }
 */
public class NetherNoise {

    NetherNoise() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        DoublePerlinNoise.layout().withName("temperature"),
        DoublePerlinNoise.layout().withName("humidity"),
        MemoryLayout.sequenceLayout(8, PerlinNoise.layout()).withName("oct")
    ).withName("NetherNoise");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout temperature$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("temperature"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DoublePerlinNoise temperature
     * }
     */
    public static final GroupLayout temperature$layout() {
        return temperature$LAYOUT;
    }

    private static final long temperature$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DoublePerlinNoise temperature
     * }
     */
    public static final long temperature$offset() {
        return temperature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DoublePerlinNoise temperature
     * }
     */
    public static MemorySegment temperature(MemorySegment struct) {
        return struct.asSlice(temperature$OFFSET, temperature$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DoublePerlinNoise temperature
     * }
     */
    public static void temperature(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, temperature$OFFSET, temperature$LAYOUT.byteSize());
    }

    private static final GroupLayout humidity$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("humidity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DoublePerlinNoise humidity
     * }
     */
    public static final GroupLayout humidity$layout() {
        return humidity$LAYOUT;
    }

    private static final long humidity$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DoublePerlinNoise humidity
     * }
     */
    public static final long humidity$offset() {
        return humidity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DoublePerlinNoise humidity
     * }
     */
    public static MemorySegment humidity(MemorySegment struct) {
        return struct.asSlice(humidity$OFFSET, humidity$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DoublePerlinNoise humidity
     * }
     */
    public static void humidity(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, humidity$OFFSET, humidity$LAYOUT.byteSize());
    }

    private static final SequenceLayout oct$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("oct"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PerlinNoise oct[8]
     * }
     */
    public static final SequenceLayout oct$layout() {
        return oct$LAYOUT;
    }

    private static final long oct$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PerlinNoise oct[8]
     * }
     */
    public static final long oct$offset() {
        return oct$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PerlinNoise oct[8]
     * }
     */
    public static MemorySegment oct(MemorySegment struct) {
        return struct.asSlice(oct$OFFSET, oct$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PerlinNoise oct[8]
     * }
     */
    public static void oct(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, oct$OFFSET, oct$LAYOUT.byteSize());
    }

    private static long[] oct$DIMS = { 8 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * PerlinNoise oct[8]
     * }
     */
    public static long[] oct$dimensions() {
        return oct$DIMS;
    }
    private static final MethodHandle oct$ELEM_HANDLE = oct$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * PerlinNoise oct[8]
     * }
     */
    public static MemorySegment oct(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)oct$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * PerlinNoise oct[8]
     * }
     */
    public static void oct(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, oct(struct, index0), 0L, PerlinNoise.layout().byteSize());
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


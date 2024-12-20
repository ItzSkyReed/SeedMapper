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
import static java.lang.foreign.ValueLayout.*;

/**
 * {@snippet lang=c :
 * struct SplineStack {
 *     Spline stack[42];
 *     FixSpline fstack[151];
 *     int len;
 *     int flen;
 * }
 * }
 */
public class SplineStack {

    SplineStack() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(42, Spline.layout()).withName("stack"),
        MemoryLayout.sequenceLayout(151, FixSpline.layout()).withName("fstack"),
        Cubiomes.C_INT.withName("len"),
        Cubiomes.C_INT.withName("flen")
    ).withName("SplineStack");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout stack$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("stack"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Spline stack[42]
     * }
     */
    public static final SequenceLayout stack$layout() {
        return stack$LAYOUT;
    }

    private static final long stack$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Spline stack[42]
     * }
     */
    public static final long stack$offset() {
        return stack$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Spline stack[42]
     * }
     */
    public static MemorySegment stack(MemorySegment struct) {
        return struct.asSlice(stack$OFFSET, stack$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Spline stack[42]
     * }
     */
    public static void stack(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, stack$OFFSET, stack$LAYOUT.byteSize());
    }

    private static long[] stack$DIMS = { 42 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * Spline stack[42]
     * }
     */
    public static long[] stack$dimensions() {
        return stack$DIMS;
    }
    private static final MethodHandle stack$ELEM_HANDLE = stack$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * Spline stack[42]
     * }
     */
    public static MemorySegment stack(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)stack$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * Spline stack[42]
     * }
     */
    public static void stack(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, stack(struct, index0), 0L, Spline.layout().byteSize());
    }

    private static final SequenceLayout fstack$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("fstack"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FixSpline fstack[151]
     * }
     */
    public static final SequenceLayout fstack$layout() {
        return fstack$LAYOUT;
    }

    private static final long fstack$OFFSET = 8400;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FixSpline fstack[151]
     * }
     */
    public static final long fstack$offset() {
        return fstack$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FixSpline fstack[151]
     * }
     */
    public static MemorySegment fstack(MemorySegment struct) {
        return struct.asSlice(fstack$OFFSET, fstack$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FixSpline fstack[151]
     * }
     */
    public static void fstack(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, fstack$OFFSET, fstack$LAYOUT.byteSize());
    }

    private static long[] fstack$DIMS = { 151 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * FixSpline fstack[151]
     * }
     */
    public static long[] fstack$dimensions() {
        return fstack$DIMS;
    }
    private static final MethodHandle fstack$ELEM_HANDLE = fstack$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * FixSpline fstack[151]
     * }
     */
    public static MemorySegment fstack(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)fstack$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * FixSpline fstack[151]
     * }
     */
    public static void fstack(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, fstack(struct, index0), 0L, FixSpline.layout().byteSize());
    }

    private static final OfInt len$LAYOUT = (OfInt)$LAYOUT.select(groupElement("len"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int len
     * }
     */
    public static final OfInt len$layout() {
        return len$LAYOUT;
    }

    private static final long len$OFFSET = 9608;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int len
     * }
     */
    public static final long len$offset() {
        return len$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int len
     * }
     */
    public static int len(MemorySegment struct) {
        return struct.get(len$LAYOUT, len$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int len
     * }
     */
    public static void len(MemorySegment struct, int fieldValue) {
        struct.set(len$LAYOUT, len$OFFSET, fieldValue);
    }

    private static final OfInt flen$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int flen
     * }
     */
    public static final OfInt flen$layout() {
        return flen$LAYOUT;
    }

    private static final long flen$OFFSET = 9612;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int flen
     * }
     */
    public static final long flen$offset() {
        return flen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int flen
     * }
     */
    public static int flen(MemorySegment struct) {
        return struct.get(flen$LAYOUT, flen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int flen
     * }
     */
    public static void flen(MemorySegment struct, int fieldValue) {
        struct.set(flen$LAYOUT, flen$OFFSET, fieldValue);
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


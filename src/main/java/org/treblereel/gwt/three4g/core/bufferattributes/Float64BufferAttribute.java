package org.treblereel.gwt.three4g.core.bufferattributes;

import elemental2.core.Float32Array;
import elemental2.core.JsArray;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.core.BufferAttribute;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/29/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class Float64BufferAttribute extends BufferAttribute<Float, Float64BufferAttribute> {

    /**
     * @param array    -- Must be a Float[]. Used to instantiate the buffer.
     *                 This array should have
     *                 itemSize * numVertices elements, where numVertices is the number of vertices in the associated BufferGeometry.
     * @param itemSize -- the number of values of the array that should be associated with a particular vertex. For instance, if this
     *                 attribute is storing a 3-component vector (such as a position, normal, or color), then itemSize should be 3.
     */
    public Float64BufferAttribute(float[] array, int itemSize) {
        super();
    }

    /**
     * @param array    -- Must be a JsArray. Used to instantiate the buffer.
     *                 This array should have
     *                 itemSize * numVertices elements, where numVertices is the number of vertices in the associated BufferGeometry.
     * @param itemSize -- the number of values of the array that should be associated with a particular vertex. For instance, if this
     *                 attribute is storing a 3-component vector (such as a position, normal, or color), then itemSize should be 3.
     */
    public Float64BufferAttribute(JsArray array, int itemSize) {
        super();
    }

    /**
     * @param array    -- Must be a Float32Array. Used to instantiate the buffer.
     *                 This array should have
     *                 itemSize * numVertices elements, where numVertices is the number of vertices in the associated BufferGeometry.
     * @param itemSize -- the number of values of the array that should be associated with a particular vertex. For instance, if this
     *                 attribute is storing a 3-component vector (such as a position, normal, or color), then itemSize should be 3.
     */
    public Float64BufferAttribute(Float32Array array, int itemSize) {
        super();
    }

    /**
     * @param array      -- Must be a Float[]. Used to instantiate the buffer.
     *                   This array should have
     *                   itemSize * numVertices elements, where numVertices is the number of vertices in the associated BufferGeometry.
     * @param itemSize   -- the number of values of the array that should be associated with a particular vertex. For instance, if this
     *                   attribute is storing a 3-component vector (such as a position, normal, or color), then itemSize should be 3.
     * @param normalized -- Indicates how the underlying data in the buffer maps to the values in the GLSL code. For instance, if array is an instance of UInt16Array, and normalized is true, the values 0 - +65535 in the array data will be mapped to 0.0f - +1.0f in the GLSL attribute. An Int16Array (signed) would map from -32767 - +32767 to -1.0f - +1.0f. If normalized is false, the values will be converted to floats which contain the exact value, i.e. 32767 becomes 32767.0f.
     */
    public Float64BufferAttribute(float[] array, int itemSize, boolean normalized) {
        super();
    }

    /**
     * @param array      -- Must be a JsArray. Used to instantiate the buffer.
     *                   This array should have
     *                   itemSize * numVertices elements, where numVertices is the number of vertices in the associated BufferGeometry.
     * @param itemSize   -- the number of values of the array that should be associated with a particular vertex. For instance, if this
     *                   attribute is storing a 3-component vector (such as a position, normal, or color), then itemSize should be 3.
     * @param normalized -- Indicates how the underlying data in the buffer maps to the values in the GLSL code. For instance, if array is an instance of UInt16Array, and normalized is true, the values 0 - +65535 in the array data will be mapped to 0.0f - +1.0f in the GLSL attribute. An Int16Array (signed) would map from -32767 - +32767 to -1.0f - +1.0f. If normalized is false, the values will be converted to floats which contain the exact value, i.e. 32767 becomes 32767.0f.
     */
    public Float64BufferAttribute(JsArray array, int itemSize, boolean normalized) {
        super();
    }

    /**
     * @param array      -- Must be a Float32Array. Used to instantiate the buffer.
     *                   This array should have
     *                   itemSize * numVertices elements, where numVertices is the number of vertices in the associated BufferGeometry.
     * @param itemSize   -- the number of values of the array that should be associated with a particular vertex. For instance, if this
     *                   attribute is storing a 3-component vector (such as a position, normal, or color), then itemSize should be 3.
     * @param normalized -- Indicates how the underlying data in the buffer maps to the values in the GLSL code. For instance, if array is an instance of UInt16Array, and normalized is true, the values 0 - +65535 in the array data will be mapped to 0.0f - +1.0f in the GLSL attribute. An Int16Array (signed) would map from -32767 - +32767 to -1.0f - +1.0f. If normalized is false, the values will be converted to floats which contain the exact value, i.e. 32767 becomes 32767.0f.
     */
    public Float64BufferAttribute(Float32Array array, int itemSize, boolean normalized) {
        super();
    }
}

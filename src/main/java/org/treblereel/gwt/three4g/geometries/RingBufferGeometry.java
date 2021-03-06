package org.treblereel.gwt.three4g.geometries;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.core.BufferGeometry;
import org.treblereel.gwt.three4g.geometries.parameters.RingGeometryParameters;

/**
 * This is the BufferGeometry port of RingGeometry.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/3/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class RingBufferGeometry extends BufferGeometry<RingBufferGeometry> {

    public RingGeometryParameters parameters; //TODO CHECK if empty

    /**
     * @param innerRadius   — Default is 0.5.
     * @param outerRadius   — Default is 1.
     * @param thetaSegments — Number of segments. A higher number means the ring will be more round. Minimum is 3. Default is 8.
     */
    public RingBufferGeometry(float innerRadius, float outerRadius, int thetaSegments) {

    }

    /**
     * @param innerRadius   — Default is 0.5.
     * @param outerRadius   — Default is 1.
     * @param thetaSegments — Number of segments. A higher number means the ring will be more round. Minimum is 3. Default is 8.
     * @param phiSegments   — Minimum is 1. Default is 1.
     */
    public RingBufferGeometry(float innerRadius, float outerRadius, int thetaSegments, int phiSegments) {

    }

    /**
     * @param innerRadius   — Default is 0.5.
     * @param outerRadius   — Default is 1.
     * @param thetaSegments — Number of segments. A higher number means the ring will be more round. Minimum is 3. Default is 8.
     * @param phiSegments   — Minimum is 1. Default is 1.
     * @param thetaStart    — Starting angle. Default is 0.
     */
    public RingBufferGeometry(float innerRadius, float outerRadius, int thetaSegments, int phiSegments, float thetaStart) {

    }

    /**
     * @param innerRadius   — Default is 0.5.
     * @param outerRadius   — Default is 1.
     * @param thetaSegments — Number of segments. A higher number means the ring will be more round. Minimum is 3. Default is 8.
     * @param phiSegments   — Minimum is 1. Default is 1.
     * @param thetaStart    — Starting angle. Default is 0.
     * @param thetaLength   — Central angle. Default is Math.PI * 2.
     */
    public RingBufferGeometry(float innerRadius, float outerRadius, int thetaSegments, int phiSegments, float thetaStart, float thetaLength) {

    }
}

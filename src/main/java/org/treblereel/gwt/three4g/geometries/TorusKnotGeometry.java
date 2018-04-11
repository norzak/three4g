package org.treblereel.gwt.three4g.geometries;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.core.Geometry;

/**
 * Creates a torus knot, the particular shape of which is defined by a pair of coprime integers, p and q. If p and q are
 * not coprime, the result will be a torus link.
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 4/11/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class TorusKnotGeometry extends Geometry{

    /**
     * Radius of the torus. Default is 1
     */
    public float radius;

    /**
     * Radius of the tube. Default is 0.4
     */
    public float tube;

    /**
     * Default is 64
     */
    public int tubularSegments;

    /**
     * Default is 8
     */
    public int radialSegments;

    /**
     * This value determines, how many times the geometry winds around its axis of rotational symmetry. Default is 2
     */
    public int p;

    /**
     * This value determines, how many times the geometry winds around a circle in the interior of the torus. Default is 3.
     */
    public int q;

    /**
     *
     * @param radius - Radius of the torus. Default is 1.
     * @param tube — Radius of the tube. Default is 0.4.
     * @param tubularSegments — Default is 64.
     * @param radialSegments — Default is 8.
     */
    @JsConstructor
    public TorusKnotGeometry(float radius,float tube, int tubularSegments, int radialSegments){

    }

    /**
     *
     * @param radius - Radius of the torus. Default is 1.
     * @param tube — Radius of the tube. Default is 0.4.
     * @param tubularSegments — Default is 64.
     * @param radialSegments — Default is 8.
     * @param p — This value determines, how many times the geometry winds around its axis of rotational symmetry. Default is 2.
     */
    @JsConstructor
    public TorusKnotGeometry(float radius,float tube, int tubularSegments, int radialSegments, int p){

    }

    /**
     *
     * @param radius - Radius of the torus. Default is 1.
     * @param tube — Radius of the tube. Default is 0.4.
     * @param tubularSegments — Default is 64.
     * @param radialSegments — Default is 8.
     * @param p — This value determines, how many times the geometry winds around its axis of rotational symmetry. Default is 2.
     * @param q — This value determines, how many times the geometry winds around a circle in the interior of the torus. Default is 3.
     */
    @JsConstructor
    public TorusKnotGeometry(float radius,float tube, int tubularSegments, int radialSegments, int p, int q){

    }
}

package org.treblereel.gwt.three4g.math;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 3/1/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class Spherical {

    public float radius;

    public float phi;

    public float theta;

    @JsConstructor
    public Spherical() {

    }

    /**
     * The poles (phi) are at the positive and negative y axis. The equator (theta) starts at positive z.
     *
     * @param radius - the radius, or the Euclidean distance (straight-line distance) from the point to the origin. Default is 1.0.
     */
    @JsConstructor
    public Spherical(float radius) {

    }

    /**
     * The poles (phi) are at the positive and negative y axis. The equator (theta) starts at positive z.
     *
     * @param radius - the radius, or the Euclidean distance (straight-line distance) from the point to the origin. Default is 1.0.
     * @param phi    - polar angle from the y (up) axis. Default is 0.
     */
    @JsConstructor
    public Spherical(float radius, float phi) {

    }

    /**
     * The poles (phi) are at the positive and negative y axis. The equator (theta) starts at positive z.
     *
     * @param radius - the radius, or the Euclidean distance (straight-line distance) from the point to the origin. Default is 1.0.
     * @param phi    - polar angle from the y (up) axis. Default is 0.
     * @param theta  - equator angle around the y (up) axis. Default is 0.
     */
    @JsConstructor
    public Spherical(float radius, float phi, float theta) {

    }

    /**
     * Returns a new plane with the same radius, phi and theta properties as this one.
     *
     * @return instance of Spherical
     */
    public native Spherical clone();

    /**
     * Copies the values of the passed Spherical's radius, phi and theta properties to this spherical.
     *
     * @param s targeting Spherical
     * @return instance of Spherical
     */
    public native Spherical copy(Spherical s);

    /**
     * Restricts the polar angle phi to be between 0.000001 and pi - 0.000001.
     *
     * @return instance of Spherical
     */
    public native Spherical makeSafe();

    /**
     * Sets values of this spherical's radius, phi and theta properties.
     *
     * @param radius as float
     * @param phi    as float
     * @param theta  as float
     * @return instance of Spherical
     */
    public native Spherical set(float radius, float phi, float theta);

    /**
     * Sets values of this spherical's radius, phi and theta properties from the Vector3.
     * The radius is set the vector's Vector3.length, while the phi and theta properties are set from its direction.
     *
     * @param vec3 source Vector3
     * @return instance of Spherical
     */
    public native Spherical setFromVector3(Vector3 vec3);

    /**
     * Sets values of this spherical's radius, phi and theta properties from Cartesian coordinates.
     *
     * @param x - coordinate x
     * @param y - coordinate x
     * @param z - coordinate x
     * @return instance of Spherical
     */
    public native Spherical setFromCartesianCoords(float x, float y, float z);

}

package org.treblereel.gwt.three4g.cameras;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.core.Object3D;
import org.treblereel.gwt.three4g.math.Matrix4;
import org.treblereel.gwt.three4g.math.Vector3;

/**
 * Creates a new Camera. Note that this class is not intended to be called directly; you probably want a PerspectiveCamera or OrthographicCamera instead.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 12/6/17.
 */
@JsType(namespace = "THREE", isNative = true)
public class Camera extends Object3D {

    /**
     * Used to check whether this or derived classes are cameras. Default is true.
     * You should not change this, as it used internally by the renderer for optimisation.
     */
    public boolean isCamera;

    /**
     * This is the inverse of matrixWorld. MatrixWorld contains the Matrix which has the world transform of the Camera.
     */
    public Matrix4 matrixWorldInverse;

    /**
     * This is the matrix which contains the projection.
     */
    public Matrix4 projectionMatrix;

    /**
     * The inverse of projectionMatrix.
     */
    public Matrix4 projectionMatrixInverse;

    /**
     * Return a new camera with the same properties as this one.
     *
     * @return Camera
     */
    public native Camera clone();

    /**
     * Copy the properties from the source camera into this one.
     *
     * @param camera instance of Camera
     * @return instance of Camera
     */
    public native Camera copy(Camera camera);

    /**
     * Returns a Vector3 representing the world space direction in which the camera is looking. (Note: A camera looks down its local, negative z-axis).
     *
     * @param target — the result will be copied into this Vector3.
     * @return Vector3
     */
    public native Vector3 getWorldDirection(Vector3 target);

}

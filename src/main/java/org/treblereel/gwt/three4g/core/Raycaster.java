package org.treblereel.gwt.three4g.core;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.cameras.Camera;
import org.treblereel.gwt.three4g.math.Ray;
import org.treblereel.gwt.three4g.math.Vector2;
import org.treblereel.gwt.three4g.math.Vector3;

/**
 * This class is designed to assist with raycasting. Raycasting is used for mouse picking (working out what objects in
 * the 3d space the mouse is over) amongst other things.
 *
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 3/1/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class Raycaster {

    /**
     * The far factor of the raycaster. This value indicates which objects can be discarded based on the distance.
     * This value shouldn't be negative and should be larger than the near property.
     */
    public float far;

    /**
     * The precision factor of the raycaster when intersecting Line objects.
     */
    public float linePrecision;

    /**
     * The near factor of the raycaster. This value indicates which objects can be discarded based on the distance.
     * This value shouldn't be negative and should be smaller than the far property.
     */
    public float near;

    /**
     * An object with the following properties:
     * {
     * Mesh: {},
     * Line: {},
     * LOD: {},
     * Points: { threshold: 1 },
     * Sprite: {}
     * }
     */
    public Object params; //TODO

    /**
     * The Ray used for the raycasting.
     */
    public Ray ray;

    /**
     * This creates a new raycaster object.
     *
     * @param origin    — The origin vector where the ray casts from.
     * @param direction — The direction vector that gives direction to the ray. Should be normalized.
     * @param near      — All results returned are further away than near. Near can't be negative. Default value is 0.
     * @param far       — All results returned are closer then far. Far can't be lower then near . Default value is Infinity.
     */
    @JsConstructor
    public Raycaster(Vector3 origin, Vector3 direction, float near, float far) {

    }

    /**
     * origin — The origin vector where the ray casts from.
     * direction — The normalized direction vector that gives direction to the ray.
     * Updates the ray with a new origin and direction.
     */
    public native void set(Vector3 origin, Vector3 direction);


    /**
     * Updates the ray with a new origin and direction.
     *
     * @param coords — 2D coordinates of the mouse, in normalized device coordinates (NDC)---X and Y components should
     *               be between -1 and 1.
     * @param camera — camera from which the ray should originate
     *               Updates the ray with a new origin and direction.
     */
    public native void setFromCamera(Vector2 coords, Camera camera);

    /**
     * Checks all intersection between the ray and the object with or without the descendants. Intersections are returned
     * sorted by distance, closest first. An array of intersections is returned...
     * [ { distance, point, face, faceIndex, indices, object }, ... ]
     * distance – distance between the origin of the ray and the intersection
     * point – point of intersection, in world coordinates
     * face – intersected face
     * faceIndex – index of the intersected face
     * indices – indices of vertices comprising the intersected face
     * object – the intersected object
     * uv - U,V coordinates at point of intersection
     * <p>
     * When intersecting a Mesh with a BufferGeometry, the faceIndex will be undefined, and indices will be set; when
     * intersecting a Mesh with a Geometry, indices will be undefined.
     * <p>
     * Raycaster delegates to the raycast method of the passed object, when evaluating whether the ray intersects the
     * object or not. This allows meshes to respond differently to ray casting than lines and pointclouds.
     * <p>
     * Note that for meshes, faces must be pointed towards the origin of the ray in order to be detected; intersections
     * of the ray passing through the back of a face will not be detected. To raycast against both faces of an object,
     * you'll want to set the material's side property to THREE.DoubleSide.
     *
     * @param object    — The object to check for intersection with the ray.
     */
    public native Object[] intersectObject(Object object);

    /**
     * Checks all intersection between the ray and the object with or without the descendants. Intersections are returned
     * sorted by distance, closest first. An array of intersections is returned...
     * [ { distance, point, face, faceIndex, indices, object }, ... ]
     * distance – distance between the origin of the ray and the intersection
     * point – point of intersection, in world coordinates
     * face – intersected face
     * faceIndex – index of the intersected face
     * indices – indices of vertices comprising the intersected face
     * object – the intersected object
     * uv - U,V coordinates at point of intersection
     * <p>
     * When intersecting a Mesh with a BufferGeometry, the faceIndex will be undefined, and indices will be set; when
     * intersecting a Mesh with a Geometry, indices will be undefined.
     * <p>
     * Raycaster delegates to the raycast method of the passed object, when evaluating whether the ray intersects the
     * object or not. This allows meshes to respond differently to ray casting than lines and pointclouds.
     * <p>
     * Note that for meshes, faces must be pointed towards the origin of the ray in order to be detected; intersections
     * of the ray passing through the back of a face will not be detected. To raycast against both faces of an object,
     * you'll want to set the material's side property to THREE.DoubleSide.
     *
     * @param object    — The object to check for intersection with the ray.
     * @param recursive — If true, it also checks all descendants. Otherwise it only checks intersecton with the object.
     *                  Default is false.
     */
    public native Object[] intersectObject(Object object, boolean recursive);

    /**
     * Checks all intersection between the ray and the object with or without the descendants. Intersections are returned
     * sorted by distance, closest first. An array of intersections is returned...
     * [ { distance, point, face, faceIndex, indices, object }, ... ]
     * distance – distance between the origin of the ray and the intersection
     * point – point of intersection, in world coordinates
     * face – intersected face
     * faceIndex – index of the intersected face
     * indices – indices of vertices comprising the intersected face
     * object – the intersected object
     * uv - U,V coordinates at point of intersection
     * <p>
     * When intersecting a Mesh with a BufferGeometry, the faceIndex will be undefined, and indices will be set; when
     * intersecting a Mesh with a Geometry, indices will be undefined.
     * <p>
     * Raycaster delegates to the raycast method of the passed object, when evaluating whether the ray intersects the
     * object or not. This allows meshes to respond differently to ray casting than lines and pointclouds.
     * <p>
     * Note that for meshes, faces must be pointed towards the origin of the ray in order to be detected; intersections
     * of the ray passing through the back of a face will not be detected. To raycast against both faces of an object,
     * you'll want to set the material's side property to THREE.DoubleSide.
     *
     * @param object         — The object to check for intersection with the ray.
     * @param recursive      — If true, it also checks all descendants. Otherwise it only checks intersecton with the
     *                       object. Default is false.
     * @param optionalTarget — (optional) target to set the result. Otherwise a new Array is instantiated. If set, you
     *                       must clear this array prior to each call (i.e., array.length = 0;).
     */
    public native Object[] intersectObject(Object object, boolean recursive, Object[] optionalTarget);


    /**
     * Checks all intersection between the ray and the objects with or without the descendants. Intersections are returned
     * sorted by distance, closest first. Intersections are of the same form as those returned by .intersectObject.
     *
     * @param objects        — The objects to check for intersection with the ray.
     * @return Object[]
     */
    public native Object[] intersectObjects(Object[] objects);

    /**
     * Checks all intersection between the ray and the objects with or without the descendants. Intersections are returned
     * sorted by distance, closest first. Intersections are of the same form as those returned by .intersectObject.
     *
     * @param objects        — The objects to check for intersection with the ray.
     * @param recursive      — If true, it also checks all descendants of the objects. Otherwise it only checks intersecton
     *                       with the objects. Default is false.
     * @return Object[]
     */
    public native Object[] intersectObjects(Object[] objects, boolean recursive);

    /**
     * Checks all intersection between the ray and the objects with or without the descendants. Intersections are returned
     * sorted by distance, closest first. Intersections are of the same form as those returned by .intersectObject.
     *
     * @param objects        — The objects to check for intersection with the ray.
     * @param recursive      — If true, it also checks all descendants of the objects. Otherwise it only checks intersecton
     *                       with the objects. Default is false.
     * @param optionalTarget — (optional) target to set the result. Otherwise a new Array is instantiated. If set, you must
     *                       clear this array prior to each call (i.e., array.length = 0;).
     * @return Object[]
     */
    public native Object[] intersectObjects(Object[] objects, boolean recursive, Object[] optionalTarget);

}

package org.treblereel.gwt.three4g.animation.tracks;

import elemental2.core.JsArray;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.animation.KeyframeTrack;

/**
 * A Track of numeric keyframe values.
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/2/18.
 */
@JsType(namespace = "THREE", isNative = true)
public class NumberKeyframeTrack extends KeyframeTrack {

    /**
     * String 'number'.
     */
    public boolean ValueTypeName;

    /**
     * @param name          - identifier for the KeyframeTrack.
     * @param times         - array of keyframe times.
     */
    @JsConstructor
    public NumberKeyframeTrack(String name, JsArray times) {

    }

    /**
     * @param name          - identifier for the KeyframeTrack.
     * @param times         - array of keyframe times.
     */
    @JsConstructor
    public NumberKeyframeTrack(String name, float[] times) {

    }

    /**
     * @param name          - identifier for the KeyframeTrack.
     * @param times         - array of keyframe times.
     * @param values        - values for the keyframes at the times specified.
     */
    @JsConstructor
    public NumberKeyframeTrack(String name, JsArray times, JsArray values) {

    }

    /**
     * @param name          - identifier for the KeyframeTrack.
     * @param times         - array of keyframe times.
     * @param values        - values for the keyframes at the times specified.
     */
    @JsConstructor
    public NumberKeyframeTrack(String name, float[] times, float[] values) {

    }

    /**
     * @param name          - identifier for the KeyframeTrack.
     * @param times         - array of keyframe times.
     * @param values        - values for the keyframes at the times specified.
     * @param interpolation - the type of interpolation to use. See Animation Constants for possible values. Default is InterpolateLinear.
     */
    @JsConstructor
    public NumberKeyframeTrack(String name, JsArray times, JsArray values, int interpolation) {

    }

    /**
     * @param name          - identifier for the KeyframeTrack.
     * @param times         - array of keyframe times.
     * @param values        - values for the keyframes at the times specified.
     * @param interpolation - the type of interpolation to use. See Animation Constants for possible values. Default is InterpolateLinear.
     */
    @JsConstructor
    public NumberKeyframeTrack(String name, float[] times, float[] values, int interpolation) {

    }
}

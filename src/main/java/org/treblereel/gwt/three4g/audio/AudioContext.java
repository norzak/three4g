package org.treblereel.gwt.three4g.audio;

import jsinterop.annotations.JsType;

/**
 * This contains methods for setting up an AudioContext.
 * <p>
 * Used internally by the AudioListener and AudioLoader classes.
 * <p>
 * This uses the Web Audio API.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/4/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class AudioContext {

    /**
     * @return the value of the variable context in the outer scope, if defined, otherwise set it to a new AudioContext.
     */
    public native elemental2.media.AudioContext getContext();

    /**
     * Set the variable context in the outer scope to value.
     *
     * @param value original audio context
     */
    public native void setContext(elemental2.media.AudioContext value);

}

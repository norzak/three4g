package org.treblereel.gwt.three4g.loaders;

import jsinterop.annotations.JsFunction;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 3/5/18.
 */
@JsFunction
@FunctionalInterface
public interface OnProgressCallback {
    void onProgress(OnProgressEvent request);
}

package org.treblereel.gwt.three4g.renderers;

import elemental2.core.Uint8Array;
import elemental2.dom.HTMLElement;
import elemental2.webgl.WebGLContextAttributes;
import elemental2.webgl.WebGLRenderingContext;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.treblereel.gwt.three4g.cameras.Camera;
import org.treblereel.gwt.three4g.core.HeightWidth;
import org.treblereel.gwt.three4g.core.Object3D;
import org.treblereel.gwt.three4g.materials.Material;
import org.treblereel.gwt.three4g.math.Color;
import org.treblereel.gwt.three4g.math.Plane;
import org.treblereel.gwt.three4g.math.Vector2;
import org.treblereel.gwt.three4g.renderers.parameters.WebGLRendererParameters;
import org.treblereel.gwt.three4g.renderers.webgl.WebGLProgram;
import org.treblereel.gwt.three4g.renderers.webgl.WebGlShadowMap;
import org.treblereel.gwt.three4g.scenes.Fog;
import org.treblereel.gwt.three4g.scenes.Scene;
import org.treblereel.gwt.three4g.textures.CubeTexture;
import org.treblereel.gwt.three4g.textures.Texture;

/**
 * The WebGL renderer displays your beautifully crafted scenes using WebGL.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 2/27/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class WebGLRenderer {


    /**
     * Defines whether the renderer should automatically clear its output before rendering a frame.
     */
    public boolean autoClear;

    /**
     * If autoClear is true, defines whether the renderer should clear the color buffer. Default is true.
     */
    public boolean autoClearColor;

    /**
     * If autoClear is true, defines whether the renderer should clear the depth buffer. Default is true.
     */
    public boolean autoClearDepth;

    /**
     * If autoClear is true, defines whether the renderer should clear the stencil buffer. Default is true.
     */
    public boolean autoClearStencil;


    public Object capabilities; //TODO


    /**
     * User-defined clipping planes specified as THREE.Plane objects in world space. These planes apply globally.
     * Points in space whose dot product with the plane is negative are cut away. Default is [].
     */
    public Plane[] clippingPlanes; //TODO


    /**
     * The renderer obtains a RenderingContext context from its domElement by default, using HTMLCanvasElement.getContext().
     * You can create this manually, however it must correspond to the domElement in order to render to the screen.
     */
    public WebGLRenderingContext context;

    /**
     * A canvas where the renderer draws its output.
     * This is automatically created by the renderer in the constructor (if not provided already); you just need to
     * add it to your page like so:
     * document.body.appendChild( renderer.domElement );
     */
    public HTMLElement domElement;


    /**
     * A wrapper for the .extensions.get method, used to check whether various WebGL extensions are supported.
     */
    public Object extensions;

    /**
     * Default is 2.
     */
    public Float gammaFactor;


    /**
     * If set, then it expects that all textures and colors are premultiplied gamma. Default is false.
     */
    public boolean gammaInput;

    /**
     * If set, then it expects that all textures and colors need to be outputted in premultiplied gamma. Default is false.
     */
    public boolean gammaOutput;

    /**
     * An object with a series of statistical information about the graphics board memory and the rendering process. Useful for debugging or just for the sake of curiosity. The object contains the following fields:
     * memory:
     * geometries
     * textures
     * render:
     * calls
     * vertices
     * faces
     * points
     * programs
     * By default these data are reset at each render calls, but when using the composer or mirrors it can be preferred to reset them with a custom pattern :
     * renderer.info.autoReset = false;
     * renderer.info.reset();
     */
    public Object info;

    /**
     * Defines whether the renderer respects object-level clipping planes. Default is false.
     */
    public boolean localClippingEnabled;


    /**
     * Default is 8. The maximum number of MorphTargets allowed in a shader. Keep in mind that the standard materials only allow 8 MorphTargets.
     */
    public int maxMorphTargets;

    /**
     * Default is 4. The maximum number of MorphNormals allowed in a shader. Keep in mind that the standard materials only allow 4 MorphNormals.
     */
    public int maxMorphNormals;

    /**
     * Whether to use physically correct lighting mode. Default is false.
     */
    public boolean physicallyCorrectLights;

    /**
     * Used internally by the renderer to keep track of various sub object properties.
     */
    public Object properties;

    /**
     * Used internally to handle ordering of scene object rendering.
     */
    public Object renderLists; //WebGLRenderLists //TODO


    /**
     * This contains the reference to the shadow map, if used.
     */
    public WebGlShadowMap shadowMap;

    /**
     * Defines whether the renderer should sort objects. Default is true.
     * Note: Sorting is used to attempt to properly render objects that have
     * some degree of transparency. By definition, sorting objects may not work
     * in all cases. Depending on the needs of application, it may be neccessary
     * to turn off sorting and use other methods to deal with transparency
     * rendering e.g. manually determining each object's rendering order.
     */
    public boolean sortObjects;


    /**
     * Contains functions for setting various properties of the WebGLRenderer.context state.
     */
    public Object state;

    /**
     * Default is LinearToneMapping. See the Renderer constants for other choices.
     */
    public int toneMapping;

    /**
     * Exposure level of tone mapping. Default is 1.
     */
    public int toneMappingExposure;

    /**
     * Tone mapping white point. Default is 1.
     */
    public int toneMappingWhitePoint;

    @JsConstructor
    public WebGLRenderer() {

    }

    @JsConstructor
    public WebGLRenderer(WebGLRendererParameters params) {

    }

    /**
     * Attempt to allocate a texture unit for use by a shader. Will warn if trying to allocate more texture
     * units than the GPU supports. This is mainly used internally. See capabilities.maxTextures.
     */
    public native void allocTextureUnit();

    /**
     * Tells the renderer to clear its color, depth or stencil drawing buffer(s). This method initializes the color buffer
     * to the current clear color value.
     * Arguments default to true.
     */
    public native void clear();

    /**
     * Tells the renderer to clear its color, depth or stencil drawing buffer(s). This method initializes the color buffer
     * to the current clear color value.
     * Arguments default to true.
     *
     * @param color clear the color buffer
     */
    public native void clear(boolean color);

    /**
     * Tells the renderer to clear its color, depth or stencil drawing buffer(s). This method initializes the color buffer
     * to the current clear color value.
     * Arguments default to true.
     *
     * @param color clear the color buffer
     * @param depth clear the depth buffer
     */
    public native void clear(boolean color, boolean depth);

    /**
     * Tells the renderer to clear its color, depth or stencil drawing buffer(s). This method initializes the color buffer
     * to the current clear color value.
     * Arguments default to true.
     *
     * @param color   clear the color buffer
     * @param depth   clear the depth buffer
     * @param stencil clear the stencil buffer
     */
    public native void clear(boolean color, boolean depth, boolean stencil);


    /**
     * Clear the color buffer. Equivalent to calling .clear( true, false, false ).
     */
    public native void clearColor();

    /**
     * Clear the depth buffer. Equivalent to calling .clear( false, true, false ).
     */
    public native void clearDepth();

    /**
     * Clear the stencil buffers. Equivalent to calling .clear( false, false, true ).
     */
    public native void clearStencil();

    /**
     * This method clears a rendertarget. To do this, it activates the rendertarget.
     *
     * @param renderTargetl target to clear
     */
    public native void clearTarget(WebGLRenderTarget renderTargetl);

    /**
     * This method clears a rendertarget. To do this, it activates the rendertarget.
     *
     * @param renderTarget -- The renderTarget that needs to be cleared.
     * @param color        -- If set, then the color gets cleared.
     *                     This method clears a rendertarget. To do this, it activates the rendertarget.
     */
    public native void clearTarget(WebGLRenderTarget renderTarget, boolean color);

    /**
     * This method clears a rendertarget. To do this, it activates the rendertarget.
     *
     * @param renderTarget -- The renderTarget that needs to be cleared.
     * @param color        -- If set, then the color gets cleared.
     * @param depth        -- If set, then the depth gets cleared.
     *                     This method clears a rendertarget. To do this, it activates the rendertarget.
     */
    public native void clearTarget(WebGLRenderTarget renderTarget, boolean color, boolean depth);

    /**
     * This method clears a rendertarget. To do this, it activates the rendertarget.
     *
     * @param renderTarget -- The renderTarget that needs to be cleared.
     * @param color        -- If set, then the color gets cleared.
     * @param depth        -- If set, then the depth gets cleared.
     * @param stencil      -- If set, then the stencil gets cleared.
     *                     This method clears a rendertarget. To do this, it activates the rendertarget.
     */
    public native void clearTarget(WebGLRenderTarget renderTarget, boolean color, boolean depth, boolean stencil);


    /**
     * Compiles all materials in the scene with the camera. This is useful to precompile shaders before the first rendering.
     *
     * @param scene  instance of Scene
     * @param camera instance of Camera
     */
    public native void compile(Scene scene, Camera camera);


    /**
     * Copies pixels from the current WebGLFramebuffer into a 2D texture. Enables access to WebGLRenderingContext.copyTexImage2D.
     *
     * @param position instance of Vector2
     * @param texture  instance of Texture
     * @param level    the level
     */
    public native void copyFramebufferToTexture(Vector2 position, Texture texture, Number level);

    /**
     * Dispose of the current rendering context.
     */
    public native void dispose();


    /**
     * Simulate loss of the WebGL context. This requires support for the WEBGL_lose_context extensions. According to WebGLStats,
     * as of February 2016 90% of WebGL enabled devices support this.
     */
    public native void forceContextLoss();


    /**
     * Returns a float with the current clear alpha. Ranges from 0 to 1.
     *
     * @return float
     */
    public native float getClearAlpha();

    /**
     * Returns a Color instance with the current clear color.
     *
     * @return Color
     */
    public native Color getClearColor();

    /**
     * Return the current WebGL context.
     *
     * @return WebGLRenderingContext
     */
    public native WebGLRenderingContext getContext();

    /**
     * Returns an object that describes the attributes set on the WebGL context when it was created.
     *
     * @return a WebGLContextAttributes object that contains the actual context parameters
     */
    public native WebGLContextAttributes getContextAttributes();

    /**
     * Returns the current RenderTarget, if any.
     *
     * @return RenderTarget
     */
    public native RenderTarget getRenderTarget();

    /**
     * Returns the current CurrentViewport.
     *
     * @return RenderTarget
     */
    public native RenderTarget getCurrentViewport();


    /**
     * Returns an object containing the width and height of the renderer's drawing buffer, in pixels.
     *
     * @return JsPropertyMap as a holder for width and height
     */
    public native JsPropertyMap getDrawingBufferSize();

    @JsOverlay
    public final Double getDrawingBufferWidthSize() {
        JsPropertyMap holder = Js.uncheckedCast(getDrawingBufferSize());
        return Double.parseDouble(holder.get("width").toString());
    }

    @JsOverlay
    public final Double getDrawingBufferHeightSize() {
        JsPropertyMap holder = Js.uncheckedCast(getDrawingBufferSize());
        return Double.parseDouble(holder.get("height").toString());
    }

    /**
     * Returns current device pixel ratio used.
     *
     * @return in pixel
     */
    public native Number getPixelRatio();

    /**
     * Returns an object containing the width and height of the renderer's output canvas, in pixels.
     *
     * @return see getWidth and getHeight
     */
    public native HeightWidth getSize();

    @JsOverlay
    public final Number getWidth() {
        return getSize().width;
    }

    @JsOverlay
    public final Number getHeight() {
        return getSize().height;
    }

    /**
     * Reset the GL state to default. Called internally if the WebGL context is lost.
     */
    public native void resetGLState();

    /**
     * Reads the pixel data from the renderTarget into the buffer you pass in. Buffer should be a Javascript Uint8Array
     * instantiated with new Uint8Array( renderTargetWidth * renderTargetWidth * 4 ) to account for size and color information.
     * This is a wrapper around gl.readPixels.
     * See the interactive / cubes / gpu example.
     *
     * @param renderTarget instance of WebGLRenderTarget
     * @param x            as float
     * @param y            as float
     * @param width        as float
     * @param height       as float
     * @param buffer       instance of Uint8Array
     */
    public native void readRenderTargetPixels(WebGLRenderTarget renderTarget, float x, float y, float width, float height, Uint8Array buffer);

    /**
     * Render a scene using a camera.
     * The render is done to the renderTarget (if specified) or to the canvas as usual.
     * If forceClear is true, the depth, stencil and color buffers will be cleared before rendering even if the renderer's autoClear property is false.
     * Even with forceClear set to true you can prevent certain buffers being cleared by setting either the autoClearColor, autoClearStencil or autoClearDepth properties to false.
     *
     * @param scene  instance of Scene
     * @param camera instance of Camera
     */
    public native void render(Scene scene, Camera camera);

    /**
     * Render a scene using a camera.
     * The render is done to the renderTarget (if specified) or to the canvas as usual.
     * If forceClear is true, the depth, stencil and color buffers will be cleared before rendering even if the renderer's autoClear property is false.
     * Even with forceClear set to true you can prevent certain buffers being cleared by setting either the autoClearColor, autoClearStencil or autoClearDepth properties to false.
     *
     * @param scene        instance of Scene
     * @param camera       instance of Camera
     * @param renderTarget instance of WebGLRenderTarget
     */
    public native void render(Scene scene, Camera camera, WebGLRenderTarget renderTarget);

    /**
     * Render a scene using a camera.
     * The render is done to the renderTarget (if specified) or to the canvas as usual.
     * If forceClear is true, the depth, stencil and color buffers will be cleared before rendering even if the renderer's autoClear property is false.
     * Even with forceClear set to true you can prevent certain buffers being cleared by setting either the autoClearColor, autoClearStencil or autoClearDepth properties to false.
     *
     * @param scene        instance of Scene
     * @param camera       instance of Camera
     * @param renderTarget instance of WebGLRenderTarget
     * @param forceClear   to force clear
     */
    public native void render(Scene scene, Camera camera, WebGLRenderTarget renderTarget, boolean forceClear);


    /**
     * TODO:
     * Render a buffer geometry group using the camera and with the specified material.
     *
     * @param camera        instance of Camera
     * @param lights        instance of lights //TODO ???
     * @param fog           instance of Fog
     * @param material      instance of Material
     * @param geometryGroup instance of Material //TODO ???
     * @param object        instance of Object3D
     */
    public native void renderBufferDirect(Camera camera, Object lights, Fog fog, Material material, Object geometryGroup, Object3D object); //TODO*/

    /**
     * Render an immediate buffer. Gets called by renderImmediateObject.
     *
     * @param object        - an instance of Object3D
     * @param shaderprogram - an instance of shaderProgram
     * @param shading       - an instance of Material
     */
    public native void renderBufferImmediate(Object3D object, WebGLProgram shaderprogram, Material shading);

    /**
     * Sets the clear alpha. Valid input is a float between 0.0 and 1.0.
     *
     * @param alpha the clear alpha
     */
    public native void setClearAlpha(float alpha);

    /**
     * Sets the clear color and opacity.
     *
     * @param alpha the clear alpha
     * @param color instance of Color
     */
    public native void setClearColor(Color color, float alpha);

    /**
     * Sets device pixel ratio. This is usually used for HiDPI device to prevent bluring output canvas.
     *
     * @param value pixel ratio
     */
    public native void setPixelRatio(Number value);

    /**
     * This method sets the active rendertarget. If the parameter is omitted the canvas is set as the active rendertarget.
     */
    public native void setRenderTarget();

    /**
     * This method sets the active rendertarget. If the parameter is omitted the canvas is set as the active rendertarget.
     *
     * @param renderTarget -- The renderTarget that needs to be activated (optional).
     */
    public native void setRenderTarget(WebGLRenderTarget renderTarget);

    /**
     * Sets the scissor area from (x, y) to (x + width, y + height)
     *
     * @param x      as int
     * @param y      as int
     * @param width  as int
     * @param height as int
     */
    public native void setScissor(int x, int y, int width, int height);

    /**
     * Enable or disable the scissor test. When this is enabled, only the pixels within the defined scissor area will be affected by further renderer actions.
     *
     * @param isTest Enable or disable the scissor test
     */
    public native void setScissorTest(boolean isTest);

    /**
     * Return a Boolean true if the context supports vertex textures. This has been deprecated in favour of capabilities.vertexTexures.
     *
     * @return Return a Boolean true if the context supports vertex textures
     */
    public native boolean supportsVertexTextures();

    /**
     * Resizes the output canvas to (width, height) with device pixel ratio taken into account,
     * and also sets the viewport to fit that size, starting in (0, 0). Setting updateStyle to
     * false prevents any style changes to the output canvas.
     *
     * @param width       as int
     * @param height      as int
     * @param updateStyle force style update
     */
    public native void setSize(int width, int height, boolean updateStyle);

    /**
     * This method sets the correct texture to the correct slot for the WebGL shader. The slot number can be found as a value of the uniform of the sampler.
     * <p>
     * Note: This method replaces the older # .setTexture method.
     *
     * @param texture -- The texture that needs to be set.
     * @param slot    -- The number indicating which slot should be used by the texture.
     */
    public native void setTexture2D(Texture texture, Number slot);

    /**
     * This method sets the correct texture to the correct slot for the WebGL shader. The slot number can be found as a value of the uniform of the sampler.
     *
     * @param texture -- The cubeTexture that needs to be set.
     * @param slot    -- The number indicating which slot should be used by the texture.
     */
    public native void setTextureCube(CubeTexture texture, Number slot);


    /**
     * Sets the viewport to render from (x, y) to (x + width, y + height).
     *
     * @param x      as int value
     * @param y      as int value
     * @param width  as int value
     * @param height as int value
     */
    public native void setViewport(int x, int y, int width, int height);

}

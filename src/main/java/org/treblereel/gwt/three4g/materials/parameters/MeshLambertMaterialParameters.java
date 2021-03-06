package org.treblereel.gwt.three4g.materials.parameters;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.math.Color;
import org.treblereel.gwt.three4g.textures.CubeTexture;
import org.treblereel.gwt.three4g.textures.Texture;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 3/22/18.
 */
@JsType(isNative = true, namespace= JsPackage.GLOBAL, name="Object")
public class MeshLambertMaterialParameters extends MaterialParameters {


    /**
     * The alpha map is a grayscale texture that controls the opacity across the surface (black: fully transparent;
     * white: fully opaque). Default is null.
     * <p>
     * Only the color of the texture is used, ignoring the alpha channel if one exists. For RGB and RGBA textures,
     * the WebGL renderer will use the green channel when sampling this texture due to the extra bit of precision
     * provided for green in DXT-compressed and uncompressed RGB 565 formats. Luminance-only and luminance/alpha
     * textures will also still work as expected.
     */
    public Texture alphaMap;

    /**
     * The red channel of this texture is used as the ambient occlusion map. Default is null. The aoMap requires
     * a second set of UVs, and consequently will ignore the repeat and offset Texture properties.
     */
    public Texture aoMap;

    /**
     * Intensity of the ambient occlusion effect. Default is 1. Zero is no occlusion effect.
     */
    public float aoMapIntensity;

    /**
     * Color of the material, by default set to white (0xffffff).
     */
    public Color color;

    /**
     * How to combine the result of the surface's color with the environment map, if any.
     * <p>
     * Options are Multiply (default), MixOperation, AddOperation. If mix is chosen, the .reflectivity
     * is used to blend between the two colors.
     */
    public int combine;

    /**
     * Emissive (light) color of the material, essentially a solid color unaffected by other lighting. Default is black..
     */
    public Color emissive;

    /**
     * Set emisssive (glow) map. Default is null. The emissive map color is modulated by the emissive color and the emissive
     * intensity. If you have an emissive map, be sure to set the emissive color to something other than black.
     */
    public Texture emissiveMap;

    /**
     * Intensity of the emissive light. Modulates the emissive color. Default is 1.
     */
    public float emissiveIntensity;

    /**
     * The environment map. Default is null.
     */
    public Texture envMap;

    /**
     * The light map. Default is null. The lightMap requires a second set of UVs, and consequently will ignore the repeat
     * and offset Texture properties.
     */
    public Texture lightMap;

    /**
     * Intensity of the baked light. Default is 1.
     */
    public float lightMapIntensity;

    /**
     * Sets the color of the points using data from a Texture.
     */
    public Texture map;

    /**
     * Defines whether the material uses morphNormals. Set as true to pass morphNormal attributes from the Geometry to
     * the shader. Default is false.
     */
    public boolean morphNormals;

    /**
     * Define whether the material uses morphTargets. Default is false.
     */
    public boolean morphTargets;

    /**
     * How much the environment map affects the surface; also see .combine.
     */
    public float reflectivity;

    /**
     * The index of refraction (IOR) of air (approximately 1) divided by the index of refraction of the material.
     * It is used with environment mapping modes CubeRefractionMapping and EquirectangularRefractionMapping.
     * The refraction ratio should not exceed 1. Default is 0.98.
     */
    public float refractionRatio;

    /**
     * Define whether the material uses skinning. Default is false.
     */
    public boolean skinning;

    /**
     * Specular map used by the material. Default is null.
     */
    public Texture specularMap;

    /**
     * Render geometry as wireframe. Default is false (i.e. render as flat polygons).
     */
    public boolean wireframe;

    /**
     * Define appearance of line ends. Possible values are "butt", "round" and "square". Default is 'round'.
     * <p>
     * This corresponds to the 2D Canvas lineCap property and it is ignored by the WebGL renderer.
     */
    public String wireframeLinecap;

    /**
     * Define appearance of line joints. Possible values are "round", "bevel" and "miter". Default is 'round'.
     * <p>
     * This corresponds to the 2D Canvas lineJoin property and it is ignored by the WebGL renderer.
     */
    public String wireframeLinejoin;

    /**
     * Controls wireframe thickness. Default is 1.
     * <p>
     * Due to limitations in the ANGLE layer, on Windows platforms linewidth will always be 1 regardless of the set value.
     */
    public float wireframeLinewidth;
}

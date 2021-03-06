### Three4g

## A Three.js wrapper for GWT

# Maven
Current Version 0.96-beta2, implements 0.96 version of three.js

```xml
<dependency>
    <groupId>org.treblereel.gwt</groupId>
    <artifactId>three4g</artifactId>
    <version>0.96-beta2</version>
</dependency>
```
# Setup
all you need to do is add
```xml
<inherits name="org.treblereel.gwt.Three4G"/>
```
to your gwt project module, or   
```xml
<inherits name="org.treblereel.gwt.Three4GMin"/>
```
for min version.

If you need Objects from examples add the following to your pom
```xml
<dependency>
   <groupId>org.treblereel.gwt</groupId>
   <artifactId>three4g-examples</artifactId>
   <version>0.96-beta2</version>
</dependency>
```
and to your module:

```xml
<inherits name="org.treblereel.gwt.three4g.Examples"/>
```




# Code example

```java
PerspectiveCamera  camera = new PerspectiveCamera( 70, aspect, 1, 1000 );
camera.position.z = 400;

Scene  scene = new Scene();

Texture texture = new TextureLoader().load( "https://threejs.org/examples/textures/crate.gif");

BoxBufferGeometry geometry = new BoxBufferGeometry( 200, 200, 200 );

MeshBasicMaterialParameters meshBasicMaterialParameters = new MeshBasicMaterialParameters();
meshBasicMaterialParameters.map = texture;

MeshBasicMaterial material = new MeshBasicMaterial(meshBasicMaterialParameters);

Mesh  mesh = new Mesh(geometry, material);

scene.add(mesh);

WebGLRenderer  webGLRenderer = new WebGLRenderer();
```
Like we do in Java world and pretty close to javascript original.

# DEMO
[here is a demo page with lots of examples](https://env-7073819.cloud.unispace.io)


# License
GNU General Public License v2.0

# Contributing
Pull Requests are welcome by all.

## feel free to contact me anytime 

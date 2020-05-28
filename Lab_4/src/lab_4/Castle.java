package lab_4;

import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.*;
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

public class Castle  {
 	private TransformGroup TransformGroup;
    private Transform3D TransformGroup3D =  new Transform3D();
    private float angle =  0;

    public BranchGroup createSceneGraph() {
        BranchGroup objRoot =  new BranchGroup();

        TransformGroup =  new TransformGroup();
        TransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
        buildCastle();
        objRoot.addChild(TransformGroup);

        BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0),100.0);
        Color3f light1Color =  new Color3f( 1.0f, 1f, 1f);
        Vector3f light1Direction =  new Vector3f( 4.0f, - 7.0f, - 12.0f);
        DirectionalLight light1 =  new DirectionalLight(light1Color, light1Direction);
        light1.setInfluencingBounds(bounds);
        objRoot.addChild(light1);

        Color3f ambientColor = new Color3f(1.0f, 1.0f, 1.0f);
        AmbientLight ambientLightNode = new AmbientLight(ambientColor);
        ambientLightNode.setInfluencingBounds(bounds);
        objRoot.addChild(ambientLightNode);

        return objRoot;
    }
    private void buildCastle(){
//------Башня----------------------------------------------------------------------------------------------------------------
        Appearance ap = new Appearance();
        Color3f emissive = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f ambient = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f diffuse = new Color3f(0.2f, 0.2f, 0.2f);
        Color3f specular = new Color3f(0.6f, 0.6f, 0.6f);
        ap.setMaterial(new Material(emissive, ambient, diffuse, specular,1.0f));
        int primflags =  Primitive.GENERATE_NORMALS +  Primitive.GENERATE_TEXTURE_COORDS;

        TransformGroup tg = new TransformGroup();
        Transform3D transform = new Transform3D();
        Cylinder cyl = new Cylinder(.38f, .75f, primflags, ap);
        Vector3f vector = new Vector3f(0.0f, -0.2f, .0f);
        transform.setTranslation(vector);
        tg.setTransform(transform);
        tg.addChild(cyl);
        TransformGroup.addChild(tg);
//------Криша----------------------------------------------------------------------------------------------------------------
        Appearance ap2 = new Appearance();
        Color3f emissive2 = new Color3f(0.0f, 0.00f, 0.00f);
        Color3f ambient2 = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f diffuse2 = new Color3f(0.3f, 0.f, .0f);
        Color3f specular2 = new Color3f(0.1f, 0.0f, 0.0f);
        ap2.setMaterial(new Material(ambient2, emissive2, diffuse2, specular2, 1.0f));
        //int primflags2 =  Primitive.GENERATE_NORMALS +  Primitive.GENERATE_TEXTURE_COORDS;

        TransformGroup tg2 = new TransformGroup();
        Transform3D transform2 = new Transform3D();
        Cone con = new Cone(.5f, .5f, primflags, ap2);
        Vector3f vector2 = new Vector3f(0.0f, 0.45f, .0f);
        transform2.setTranslation(vector2);
        tg2.setTransform(transform2);
        tg2.addChild(con);
        TransformGroup.addChild(tg2);
//--------Окно--------------------------------------------------------------------------------------------------------------
        Appearance ap3 = new Appearance();
        Color3f emissive3 = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f ambient3 = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f diffuse3 = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f specular3 = new Color3f(1.0f, 0.95f, 0.9f);
        ap3.setMaterial(new Material(ambient3, emissive3, diffuse3, specular3, 1.0f));
        int primflags3 =  Primitive.GENERATE_NORMALS +  Primitive.GENERATE_TEXTURE_COORDS;

        TransformGroup tg3 = new TransformGroup();
        Transform3D transform3 = new Transform3D();
        Box box =  new Box(0.05f, 0.06f, 0.0f, primflags3, ap3);
        Vector3f vector3 = new Vector3f(0.0f, 0.0f, .38f);
        transform3.setTranslation(vector3);
        tg3.setTransform(transform3);
        tg3.addChild(box);
        TransformGroup.addChild(tg3);
        TransformGroup tg5 = new TransformGroup();
        Transform3D transform5 = new Transform3D();
        Box box2 =  new Box(0.05f, 0.06f, 0.0f, primflags3, ap3);
        Vector3f vector5 = new Vector3f(0.0f, -.3f, -0.38f);
        transform5.setTranslation(vector5);
        tg5.setTransform(transform5);
        tg5.addChild(box2);
        TransformGroup.addChild(tg5);
//--------Двери--------------------------------------------------------------------------------------------------------------
        Appearance ap4 = new Appearance();
        Color3f emissive4 = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f ambient4 = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f diffuse4 = new Color3f(0.0f, 0.0f, 0.0f);
        Color3f specular4 = new Color3f(.1f, 0.1f, 0.1f);
        ap4.setMaterial(new Material(ambient4, emissive4, diffuse4, specular4, 1.0f));
        int primflags4 =  Primitive.GENERATE_NORMALS +  Primitive.GENERATE_TEXTURE_COORDS;

        TransformGroup tg4 = new TransformGroup();
        Transform3D transform4 = new Transform3D();
        Box box1 =  new Box(0.065f, 0.12f, 0.0f, primflags4, ap4);
        Vector3f vector4 = new Vector3f(.0f, -0.45f, .38f);
        transform4.setTranslation(vector4);
        tg4.setTransform(transform4);
        tg4.addChild(box1);
        TransformGroup.addChild(tg4);
    }
    public void rotate() {
        TransformGroup3D.rotY(angle);
        angle += 0.05;
        TransformGroup.setTransform(TransformGroup3D);
    }
}

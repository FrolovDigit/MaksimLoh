public abstract class Ray {
    boolean visible;
    GlowCatalizator type;
    public Ray(boolean _visible,GlowCatalizator _type){
        visible=_visible; type=_type;
    };
}

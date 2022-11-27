public class UVRay extends Ray implements Beamers{
    static int x  = 5;
    @Override
    public void beam(Rock r){
        if (r.glowSource==this.type){
            System.out.println("Ултрафиолетовый свет светит на камень c "+r.origin+" камень, и он светиться");
        }else{
            System.out.println("Ултрафиолетовый свет светит на камень с "+r.origin+", но ему фиолетово");
        }
    }
    public UVRay(boolean _visible,GlowCatalizator _type){
        super(_visible,_type);
        System.out.println("Солнышко проснулось и излучило ультрафиолетовый свет, вызывающий рак");
    };

}

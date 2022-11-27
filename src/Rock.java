public class Rock implements Glowable,Suprasing {
    OriginPlanet origin;
    GlowCatalizator glowSource = null;
    public Rock(OriginPlanet _origin, GlowCatalizator _glowSource){
        origin=_origin;
        glowSource = _glowSource;
        System.out.println("Появляется камень с "+origin);
    }
    public Rock(OriginPlanet _origin){
        this.origin=_origin;
        System.out.println("Появляется камень с "+origin);
    }
    @Override
    public void suprice(){
        System.out.println("Камень с "+origin+" удивляет всех присутствующих");
    };
    @Override
    public String glow() {
        return "камень светиться под влиянием лучей";
    }
}

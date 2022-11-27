
public class Main {
    public static void main(String[] args) {
        ShortMan pers1 = new ShortMan(70,"Знайка", 16);
        Rock roc1 = new Rock(OriginPlanet.Луны, GlowCatalizator.UV);
        pers1.Say("Я круче крестьянина с копьем");
        pers1.ShowsGlowing(roc1);
        UVRay r = new UVRay(false, GlowCatalizator.UV);
        r.beam(roc1);
        if(Math.random() > 0.5){
            pers1.makeOthersWonder(pers1);
        }else{
            pers1.makeOthersWonder(roc1);
        }
    }
}


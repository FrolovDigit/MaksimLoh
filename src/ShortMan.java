public class ShortMan extends HumanType implements Suprasing{
    String theory;
    public ShortMan(int _height, String _name, int _age){
        super(_height,_name,_age);
        theory=null;
        System.out.println("Родился "+_name);
    };
    public ShortMan(int _height, String _name, int _age, String _theory){
        super(_height,_name,_age);
        theory=_theory;
        System.out.println("Родился "+_name);
    };
    public void makeOthersWonder(Suprasing smt){
        smt.suprice();
    }
    public void ShowsGlowing(Glowable k){
        System.out.println(this.getName()+" показывает как "+k.glow());
    }
    @Override
    public void suprice(){
        System.out.println(theory==null? this.getName()+" делает сальто назад и удивляет всех":"Знайка удивляет всех своей теорией о том, что "+theory);
    }

}

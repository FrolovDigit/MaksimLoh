public abstract class HumanType {
    private int height;
    private String name;
    private int age;
    public HumanType(int _height, String _name, int _age){
      this.height=_height;this.name=_name;this.age=_age;
    };
    public String getName(){
        return name;
    };
    public int getHeight(){
        return height;
    };
    public void Grow(int cm){
        height+=cm;
    }
    public int getAge(){
        return age;
    };
    public void HappyBirthday(){
        age+=1;
    };

    public void Say(String speech){
       System.out.println(name+" говорит:'"+speech+"'");
    }

    @Override
    public int hashCode(){
        int hash = name==null?0:name.hashCode();
        hash=hash*31+height;
        return hash;

    }
    @Override
    public boolean equals(Object o){
        HumanType checked = (HumanType) o;
        return o==null?false:checked.hashCode()==this.hashCode();
    }
    @Override
    public String toString(){
        return "Person{"+"name='"+name+"', height='"+height+"', age='"+age+"'}";
    }


}
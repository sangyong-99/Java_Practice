interface Human1{
    int MAN = 1;
    int WOMAN = 2;
}

interface Machine1{
    int TANK = 1;
    int AIRPLANE = 2;
}

public class Constants {
    public static void main(String[] args) {
        creatUnit(Machine1.TANK);
        creatUnit(Human1.MAN);
    }
    public static void creatUnit(int kind){
        switch(kind){
            case Machine1.TANK:
                System.out.println("탱크를 만듭니다.");
                break;
            case Machine1.AIRPLANE:
                System.out.println("비행기를 만듭니다.");
                break;
        }

    }
}

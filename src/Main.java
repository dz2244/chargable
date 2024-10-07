//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        chargable [] devices = new chargable[3];
        devices[0]= new tablet();
        devices[1]= new phone();
        devices[2]= new laptop();

        for(chargable i : devices){
            i.charge();
        }
    }
}
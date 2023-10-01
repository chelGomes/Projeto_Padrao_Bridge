public class Televisao extends DispositivoEletronico{

    public Televisao(int nivelVolume){
        super(nivelVolume);
    }


    public int ajusteDispositivo(){
        return this.nivelVolume;
    }
}

public class Radio extends DispositivoEletronico{
    public Radio(int nivelVolume){
        super(nivelVolume);
    }

    public int ajusteDispositivo(){
       return this.nivelVolume;
    }
}

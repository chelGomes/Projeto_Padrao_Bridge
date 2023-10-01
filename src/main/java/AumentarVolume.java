public abstract class AumentarVolume extends DispositivoEletronico{
    private int volume;

    public AumentarVolume(int nivelVolume){
        super(nivelVolume);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int ajustarVolume(){
        return this.volume;
    }
}

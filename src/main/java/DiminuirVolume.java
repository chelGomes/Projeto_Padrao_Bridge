public abstract class DiminuirVolume extends DispositivoEletronico{
  private int volume;

  public DiminuirVolume(int nivelVolume){
    super(nivelVolume);
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public int ajustarVolume(){
      return this.volume;
  }
}

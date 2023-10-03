public class DiminuirVolume extends DispositivoEletronico{
  private int volume;

  public DiminuirVolume(int nivelVolume){
    super(nivelVolume);
  }

  @Override
  public int ajusteDispositivo() {
    return 0;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public int ajustarVolume(){
      return this.volume;
  }
}

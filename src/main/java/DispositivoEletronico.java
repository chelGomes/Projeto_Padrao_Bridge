public abstract class DispositivoEletronico {

    protected Funcionalidade funcionalidade;

    protected int nivelVolume;

    public void setFuncionalidade(Funcionalidade funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public  DispositivoEletronico(int nivelVolume) {
        this.nivelVolume = nivelVolume;

    }

        public abstract int ajusteDispositivo();

}

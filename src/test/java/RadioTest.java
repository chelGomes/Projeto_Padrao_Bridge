import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    void deveRetornarNivelVolumeInicial() {
        Radio radio = new Radio(30);
        assertEquals(30, radio.ajusteDispositivo());
    }

    @Test
    void deveRetornarNivelVolumeAposAjuste() {
        Radio radio = new Radio(30);
        int novoNivelVolume = radio.ajusteDispositivo();
        assertEquals(30, novoNivelVolume);
    }
}

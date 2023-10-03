import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisaoTest {
    @Test
    void deveRetornarNivelVolumeInicial() {
        Televisao televisao = new Televisao(50);
        assertEquals(50, televisao.ajusteDispositivo());
    }

    @Test
    void deveRetornarNivelVolumeAposAjuste() {
        Televisao televisao = new Televisao(50);
        int novoNivelVolume = televisao.ajusteDispositivo();
        assertEquals(50, novoNivelVolume);
    }
}

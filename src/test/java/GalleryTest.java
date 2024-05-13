import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Saatchi Gallery");
    }

    @Test
    public void canGetName(){
        String result = gallery.getName();
        assertThat(result).isEqualTo("Saatchi Gallery");
    }

    @Test
    public void canSetName(){
        gallery.setName("British Museum");
        String result = gallery.getName();
        assertThat(result).isEqualTo("British Museum");
    }

    @Test
    public void canGetTillBalance(){
        double result = gallery.getTillBalance();
        assertThat(result).isEqualTo(0.00);
    }

    @Test
    public void canDepositToTill(){
        gallery.depositToTill(1000.00);
        double result = gallery.getTillBalance();
        assertThat(result).isEqualTo(1000.00);
    }

    @Test
    public void canGetSizeOfStock(){
        int result = gallery.getSizeOfStock();
        assertThat(result).isEqualTo(0);
    }


    @Test
    public void canGetArtworkFromStock(){
        // given
        Artwork artwork = new Artwork("The Starry Night", 1000000000, "Van Gogh");
        gallery.addArtworkToStock(artwork);
        Artwork result = gallery.getArtworkFromStock(0);
        // when
        int size = gallery.getSizeOfStock();
        // then
        if(size != 0){
            assertThat(result).isEqualTo(artwork);
        }
        else{
            assertThat(gallery.getStock().isEmpty()).isEqualTo(true);
        }
    }

    @Test
    public void canAddArtworkToStock(){
        Artwork artwork = new Artwork("The Starry Night", 1000000000, "Van Gogh");
        gallery.addArtworkToStock(artwork);
        Artwork result = gallery.getArtworkFromStock(0);
        assertThat(result).isEqualTo(artwork);
    }

}

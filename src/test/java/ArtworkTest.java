import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    // given
    Artwork artwork;

    @BeforeEach
    public void setup(){
        artwork = new Artwork("The Starry Night", 100000000.00, "Van Gogh");
    }

    @Test
    public void canGetTitle(){
        // when
        String result = artwork.getTitle();
        // then
        assertThat(result).isEqualTo("The Starry Night");
    }

    @Test
    public void canSetTitle(){
        artwork.setTitle("The Potato Eaters");
        String result = artwork.getTitle();
        assertThat(result).isEqualTo("The Potato Eaters");
    }

    @Test
    public void canGetPrice(){
        double result = artwork.getPrice();
        assertThat(result).isEqualTo(100000000.00);
    }

    @Test
    public void canSetPrice(){
        artwork.setPrice(5000000.00);
        double result = artwork.getPrice();
        assertThat(result).isEqualTo(5000000.00);
    }

    @Test
    public void canGetArtistName(){
        String result = artwork.getArtistName();
        assertThat(result).isEqualTo("Van Gogh");
    }

}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    // given
    public void setUp(){
        artist = new Artist("Van Gogh");
    }

    @Test
    public void canGetName(){
        // when
        String result = artist.getName();
        // then
        assertThat(result).isEqualTo("Van Gogh");
    }

    @Test
    public void canSetName(){
        // when
        artist.setName("Picasso");
        String result = artist.getName();
        // then
        assertThat(result).isEqualTo("Picasso");
    }

}

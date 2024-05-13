import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setup(){
        customer = new Customer("Faith");
    }

    @Test
    public void canGetName(){
        String result = customer.getName();
        assertThat(result).isEqualTo("Faith");
    }

    @Test
    public void canSetName(){
        customer.setName("Rabin");
        String result = customer.getName();
        assertThat(result).isEqualTo("Rabin");
    }

    @Test
    public void canGetWalletAmount(){
        double result = customer.getWalletAmount();
        assertThat(result).isEqualTo(0.00);
    }

    @Test
    public void canAddToWallet(){
        customer.addToWallet(20000.00);
        double result = customer.getWalletAmount();
        assertThat(result).isEqualTo(20000.00);
    }

    @Test
    public void canWithdrawFromWallet(){
        // given
        customer.addToWallet(20000.00);
        customer.withdrawFromWallet(500.00);
        // when
        double result = customer.getWalletAmount();
        // then
        assertThat(result).isEqualTo(19500.00);
    }

    @Test
    public void canBuyArtwork(){
        // given
        Gallery gallery = new Gallery("Saatchi Gallery");
        Artwork artwork = new Artwork("The Starry Night", 100000.00, "Van Gogh");
        gallery.addArtworkToStock(artwork);
        customer.addToWallet(300000.00);
        customer.buyArtwork(gallery, artwork);
        // when
        double firstResult = customer.getWalletAmount();
        double secondResult = gallery.getTillBalance();
        // then
        assertThat(firstResult).isEqualTo(200000.00);
        assertThat(secondResult).isEqualTo(100000.00);
    }

    @Test
    public void canAddArtworkToArtCollection(){
        Artwork artwork = new Artwork("The Starry Night", 1000000000, "Van Gogh");
        customer.addArtworkToArtCollection(artwork);
        Artwork result = customer.getArtworkFromArtCollection(0);
        assertThat(result).isEqualTo(artwork);
    }

    @Test
    public void canGetArtworkFromArtCollection(){
        // given
        Artwork artwork = new Artwork("The Starry Night", 1000000000, "Van Gogh");
        customer.addArtworkToArtCollection(artwork);
        Artwork result = customer.getArtworkFromArtCollection(0);
        assertThat(result).isEqualTo(artwork);
    }

}

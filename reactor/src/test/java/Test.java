import org.hamcrest.core.Is;
import org.junit.Assert;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class Test {
    @org.junit.Test
    public void empty() {
        Mono<String> emptyMono = Mono.empty();
        StepVerifier.create(emptyMono).verifyComplete();

        Flux<String> emptyFlux = Flux.empty();
        StepVerifier.create(emptyFlux).verifyComplete();
        Mono<String> james = Mono.just("James").map(s -> s.toLowerCase());
        Assert.assertThat("james", Is.is(james.block()));

        Flux<String> fluxMapFilter = Flux.just("Joel", "Kyle")
                .filter(s -> s.toUpperCase().startsWith("K"))
                .map(s -> s.toLowerCase());
        Assert.assertThat("kyle", Is.is(fluxMapFilter.blockFirst()));
    }
}

package com.blooster.factory.method;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldReturnFruitsWithFactoryAliments() {

        Aliment a = AlimentFactory.getAliment("fruits", "pomme", "température ambiante");
        assertThat(a).isInstanceOf(Fruits.class);
    }




}
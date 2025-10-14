package com.curso.v0;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class TestOptional {
    @Test
    void asssertTest(){
        double value = 5.0;
        assertEquals(value,5.0);
    }

    @Test
    public void whenCreatesEmptyOptional_thenCorrect() {
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void givenNonNull_whenCreatesNonNullable_thenCorrect() {
        String name = "baeldung";
        Optional<String> opt = Optional.of(name);
        assertTrue(opt.isPresent());
    }

    @Test
    void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
        assertThrows(NullPointerException.class, () -> { //Interface Executable
            String name = null;
            Optional.of(name);
        });
    }

    @Test
    public void givenNonNull_whenCreatesNullable_thenCorrect() {
        String name = "baeldung";
        Optional<String> opt = Optional.ofNullable(name);
        assertTrue(opt.isPresent());
    }

    @Test
    public void givenNull_whenCreatesNullable_thenCorrect() {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertFalse(opt.isPresent());
    }

    @Test
    public void givenOptional_whenIsPresentWorks_thenCorrect() {
        Optional<String> opt = Optional.of("Baeldung");
        assertTrue(opt.isPresent());

        opt = Optional.ofNullable(null);
        assertFalse(opt.isPresent());
    }

    @Test
    public void givenAnEmptyOptional_thenIsEmptyBehavesAsExpected() {
        Optional<String> opt = Optional.of("Baeldung");
        assertFalse(opt.isEmpty());

        opt = Optional.ofNullable(null);
        assertTrue(opt.isEmpty());
    }

    @Test
    public void givenOptional_whenIfPresentWorks_thenCorrect() {
        Optional<String> opt = Optional.of("baeldung");
        //opt = Optional.ofNullable(null);
        opt.ifPresent(name -> System.out.println(name.length()));
    }

    @Test
    public void whenOrElseWorks_thenCorrect() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("john");
        assertEquals("john", name);
    }

    @Test
    public void whenOrElseGetWorks_thenCorrect() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
        assertEquals("john", name);
    }

    public String getMyDefault() {
        System.out.println("***Getting Default Value***");
        return "Default Value";
    }

    @Test
    public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
        String text = null;

        String defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
        assertEquals("Default Value", defaultText);

        defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        assertEquals("Default Value", defaultText);
    }

    @Test
    public void whenOrElseGetAndOrElseDiffer_thenCorrect() {
        String text = "Text present";

        System.out.println("Using orElseGet:");
        //YA NO EJECUTA .orElseGet(this::getMyDefault)
        String defaultText
                = Optional.ofNullable(text).orElseGet(this::getMyDefault);
        assertEquals("Text present", defaultText);

        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        assertEquals("Text present", defaultText);
    }

    @Test
    void whenOrElseThrowWorks_thenCorrect() {
        assertThrows(IllegalArgumentException.class, () -> {
            String nullName = null;
            String name = Optional.ofNullable(nullName)
                    .orElseThrow(IllegalArgumentException::new);
        });
    }

    @Test
    void whenNoArgOrElseThrowWorks_thenCorrect() {
        assertThrows(NoSuchElementException.class, () -> {
            String nullName = null;
            String name = Optional.ofNullable(nullName).orElseThrow();
        });
    }

    @Test
    public void givenOptional_whenGetsValue_thenCorrect() {
        Optional<String> opt = Optional.of("baeldung");
        String name = opt.get();
        assertEquals("baeldung", name);
    }

    @Test
    void givenOptionalWithNull_whenGetThrowsException_thenCorrect() {
        assertThrows(NoSuchElementException.class, () -> {
            Optional<String> opt = Optional.ofNullable(null);
            String name = opt.get();
        });
    }
}

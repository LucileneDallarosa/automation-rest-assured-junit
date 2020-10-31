package com.interzoid.api;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

import static com.interzoid.api.request.specification.dto.HttpCustomResponseEnum.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BaseDataArguments implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                arguments("Round Rock", "TX", STATUS_200),
                arguments("Tampa", "TX", STATUS_404),
                arguments("", "", STATUS_400)
        );
    }
}
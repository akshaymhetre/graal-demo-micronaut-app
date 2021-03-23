## Micronaut 2.4.1 Documentation

- [User Guide](https://docs.micronaut.io/2.4.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.4.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.4.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

## To generate build

    ./gradlew clean build -x test

This will create packged jar under build/libs/

## To generate native image

    native-image -jar build/libs/graal-demo-micronaut-app-0.1-all.jar --initialize-at-build-time=com.fasterxml.jackson.module.kotlin.UnsignedNumbersKt

This will create executable binary which you can run 

    ./graal-demo-micronaut-app-0.1-all

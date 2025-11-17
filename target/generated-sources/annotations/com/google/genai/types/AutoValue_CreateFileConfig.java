package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateFileConfig extends CreateFileConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Boolean> shouldReturnHttpResponse;

  private AutoValue_CreateFileConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Boolean> shouldReturnHttpResponse) {
    this.httpOptions = httpOptions;
    this.shouldReturnHttpResponse = shouldReturnHttpResponse;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("shouldReturnHttpResponse")
  @Override
  public Optional<Boolean> shouldReturnHttpResponse() {
    return shouldReturnHttpResponse;
  }

  @Override
  public String toString() {
    return "CreateFileConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "shouldReturnHttpResponse=" + shouldReturnHttpResponse
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateFileConfig) {
      CreateFileConfig that = (CreateFileConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.shouldReturnHttpResponse.equals(that.shouldReturnHttpResponse());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= shouldReturnHttpResponse.hashCode();
    return h$;
  }

  @Override
  public CreateFileConfig.Builder toBuilder() {
    return new AutoValue_CreateFileConfig.Builder(this);
  }

  static final class Builder extends CreateFileConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Boolean> shouldReturnHttpResponse = Optional.empty();
    Builder() {
    }
    Builder(CreateFileConfig source) {
      this.httpOptions = source.httpOptions();
      this.shouldReturnHttpResponse = source.shouldReturnHttpResponse();
    }
    @Override
    public CreateFileConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    CreateFileConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public CreateFileConfig.Builder shouldReturnHttpResponse(boolean shouldReturnHttpResponse) {
      this.shouldReturnHttpResponse = Optional.of(shouldReturnHttpResponse);
      return this;
    }
    @Override
    CreateFileConfig.Builder shouldReturnHttpResponse(Optional<Boolean> shouldReturnHttpResponse) {
      if (shouldReturnHttpResponse == null) {
        throw new NullPointerException("Null shouldReturnHttpResponse");
      }
      this.shouldReturnHttpResponse = shouldReturnHttpResponse;
      return this;
    }
    @Override
    public CreateFileConfig build() {
      return new AutoValue_CreateFileConfig(
          this.httpOptions,
          this.shouldReturnHttpResponse);
    }
  }

}

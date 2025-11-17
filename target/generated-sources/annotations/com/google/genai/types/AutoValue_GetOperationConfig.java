package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetOperationConfig extends GetOperationConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_GetOperationConfig(
      Optional<HttpOptions> httpOptions) {
    this.httpOptions = httpOptions;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @Override
  public String toString() {
    return "GetOperationConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetOperationConfig) {
      GetOperationConfig that = (GetOperationConfig) o;
      return this.httpOptions.equals(that.httpOptions());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    return h$;
  }

  @Override
  public GetOperationConfig.Builder toBuilder() {
    return new AutoValue_GetOperationConfig.Builder(this);
  }

  static final class Builder extends GetOperationConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(GetOperationConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public GetOperationConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    GetOperationConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public GetOperationConfig build() {
      return new AutoValue_GetOperationConfig(
          this.httpOptions);
    }
  }

}

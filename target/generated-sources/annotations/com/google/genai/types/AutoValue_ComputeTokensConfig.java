package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ComputeTokensConfig extends ComputeTokensConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_ComputeTokensConfig(
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
    return "ComputeTokensConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ComputeTokensConfig) {
      ComputeTokensConfig that = (ComputeTokensConfig) o;
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
  public ComputeTokensConfig.Builder toBuilder() {
    return new AutoValue_ComputeTokensConfig.Builder(this);
  }

  static final class Builder extends ComputeTokensConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(ComputeTokensConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public ComputeTokensConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    ComputeTokensConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public ComputeTokensConfig build() {
      return new AutoValue_ComputeTokensConfig(
          this.httpOptions);
    }
  }

}

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FetchPredictOperationConfig extends FetchPredictOperationConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_FetchPredictOperationConfig(
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
    return "FetchPredictOperationConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FetchPredictOperationConfig) {
      FetchPredictOperationConfig that = (FetchPredictOperationConfig) o;
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
  public FetchPredictOperationConfig.Builder toBuilder() {
    return new AutoValue_FetchPredictOperationConfig.Builder(this);
  }

  static final class Builder extends FetchPredictOperationConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(FetchPredictOperationConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public FetchPredictOperationConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    FetchPredictOperationConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public FetchPredictOperationConfig build() {
      return new AutoValue_FetchPredictOperationConfig(
          this.httpOptions);
    }
  }

}

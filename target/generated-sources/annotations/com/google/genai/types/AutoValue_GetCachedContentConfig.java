package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetCachedContentConfig extends GetCachedContentConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_GetCachedContentConfig(
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
    return "GetCachedContentConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetCachedContentConfig) {
      GetCachedContentConfig that = (GetCachedContentConfig) o;
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
  public GetCachedContentConfig.Builder toBuilder() {
    return new AutoValue_GetCachedContentConfig.Builder(this);
  }

  static final class Builder extends GetCachedContentConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(GetCachedContentConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public GetCachedContentConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    GetCachedContentConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public GetCachedContentConfig build() {
      return new AutoValue_GetCachedContentConfig(
          this.httpOptions);
    }
  }

}

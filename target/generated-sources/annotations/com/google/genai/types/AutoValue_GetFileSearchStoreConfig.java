package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetFileSearchStoreConfig extends GetFileSearchStoreConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_GetFileSearchStoreConfig(
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
    return "GetFileSearchStoreConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetFileSearchStoreConfig) {
      GetFileSearchStoreConfig that = (GetFileSearchStoreConfig) o;
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
  public GetFileSearchStoreConfig.Builder toBuilder() {
    return new AutoValue_GetFileSearchStoreConfig.Builder(this);
  }

  static final class Builder extends GetFileSearchStoreConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(GetFileSearchStoreConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public GetFileSearchStoreConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    GetFileSearchStoreConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public GetFileSearchStoreConfig build() {
      return new AutoValue_GetFileSearchStoreConfig(
          this.httpOptions);
    }
  }

}

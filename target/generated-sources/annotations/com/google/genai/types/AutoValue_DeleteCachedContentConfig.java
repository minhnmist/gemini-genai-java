package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteCachedContentConfig extends DeleteCachedContentConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_DeleteCachedContentConfig(
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
    return "DeleteCachedContentConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteCachedContentConfig) {
      DeleteCachedContentConfig that = (DeleteCachedContentConfig) o;
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
  public DeleteCachedContentConfig.Builder toBuilder() {
    return new AutoValue_DeleteCachedContentConfig.Builder(this);
  }

  static final class Builder extends DeleteCachedContentConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(DeleteCachedContentConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public DeleteCachedContentConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    DeleteCachedContentConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public DeleteCachedContentConfig build() {
      return new AutoValue_DeleteCachedContentConfig(
          this.httpOptions);
    }
  }

}

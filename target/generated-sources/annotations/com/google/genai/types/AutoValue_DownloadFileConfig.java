package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DownloadFileConfig extends DownloadFileConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_DownloadFileConfig(
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
    return "DownloadFileConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DownloadFileConfig) {
      DownloadFileConfig that = (DownloadFileConfig) o;
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
  public DownloadFileConfig.Builder toBuilder() {
    return new AutoValue_DownloadFileConfig.Builder(this);
  }

  static final class Builder extends DownloadFileConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(DownloadFileConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public DownloadFileConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    DownloadFileConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public DownloadFileConfig build() {
      return new AutoValue_DownloadFileConfig(
          this.httpOptions);
    }
  }

}

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GetTuningJobConfig extends GetTuningJobConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_GetTuningJobConfig(
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
    return "GetTuningJobConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GetTuningJobConfig) {
      GetTuningJobConfig that = (GetTuningJobConfig) o;
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
  public GetTuningJobConfig.Builder toBuilder() {
    return new AutoValue_GetTuningJobConfig.Builder(this);
  }

  static final class Builder extends GetTuningJobConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(GetTuningJobConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public GetTuningJobConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    GetTuningJobConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public GetTuningJobConfig build() {
      return new AutoValue_GetTuningJobConfig(
          this.httpOptions);
    }
  }

}

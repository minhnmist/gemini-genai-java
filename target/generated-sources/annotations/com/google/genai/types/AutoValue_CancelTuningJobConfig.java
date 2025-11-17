package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CancelTuningJobConfig extends CancelTuningJobConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_CancelTuningJobConfig(
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
    return "CancelTuningJobConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CancelTuningJobConfig) {
      CancelTuningJobConfig that = (CancelTuningJobConfig) o;
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
  public CancelTuningJobConfig.Builder toBuilder() {
    return new AutoValue_CancelTuningJobConfig.Builder(this);
  }

  static final class Builder extends CancelTuningJobConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(CancelTuningJobConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public CancelTuningJobConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    CancelTuningJobConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public CancelTuningJobConfig build() {
      return new AutoValue_CancelTuningJobConfig(
          this.httpOptions);
    }
  }

}

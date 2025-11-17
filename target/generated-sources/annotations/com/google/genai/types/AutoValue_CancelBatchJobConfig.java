package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CancelBatchJobConfig extends CancelBatchJobConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_CancelBatchJobConfig(
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
    return "CancelBatchJobConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CancelBatchJobConfig) {
      CancelBatchJobConfig that = (CancelBatchJobConfig) o;
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
  public CancelBatchJobConfig.Builder toBuilder() {
    return new AutoValue_CancelBatchJobConfig.Builder(this);
  }

  static final class Builder extends CancelBatchJobConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(CancelBatchJobConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public CancelBatchJobConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    CancelBatchJobConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public CancelBatchJobConfig build() {
      return new AutoValue_CancelBatchJobConfig(
          this.httpOptions);
    }
  }

}

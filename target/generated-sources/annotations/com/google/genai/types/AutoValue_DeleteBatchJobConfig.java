package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteBatchJobConfig extends DeleteBatchJobConfig {

  private final Optional<HttpOptions> httpOptions;

  private AutoValue_DeleteBatchJobConfig(
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
    return "DeleteBatchJobConfig{"
        + "httpOptions=" + httpOptions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteBatchJobConfig) {
      DeleteBatchJobConfig that = (DeleteBatchJobConfig) o;
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
  public DeleteBatchJobConfig.Builder toBuilder() {
    return new AutoValue_DeleteBatchJobConfig.Builder(this);
  }

  static final class Builder extends DeleteBatchJobConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    Builder() {
    }
    Builder(DeleteBatchJobConfig source) {
      this.httpOptions = source.httpOptions();
    }
    @Override
    public DeleteBatchJobConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    DeleteBatchJobConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public DeleteBatchJobConfig build() {
      return new AutoValue_DeleteBatchJobConfig(
          this.httpOptions);
    }
  }

}

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteDocumentConfig extends DeleteDocumentConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Boolean> force;

  private AutoValue_DeleteDocumentConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Boolean> force) {
    this.httpOptions = httpOptions;
    this.force = force;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("force")
  @Override
  public Optional<Boolean> force() {
    return force;
  }

  @Override
  public String toString() {
    return "DeleteDocumentConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "force=" + force
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteDocumentConfig) {
      DeleteDocumentConfig that = (DeleteDocumentConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.force.equals(that.force());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= force.hashCode();
    return h$;
  }

  @Override
  public DeleteDocumentConfig.Builder toBuilder() {
    return new AutoValue_DeleteDocumentConfig.Builder(this);
  }

  static final class Builder extends DeleteDocumentConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Boolean> force = Optional.empty();
    Builder() {
    }
    Builder(DeleteDocumentConfig source) {
      this.httpOptions = source.httpOptions();
      this.force = source.force();
    }
    @Override
    public DeleteDocumentConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    DeleteDocumentConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public DeleteDocumentConfig.Builder force(boolean force) {
      this.force = Optional.of(force);
      return this;
    }
    @Override
    DeleteDocumentConfig.Builder force(Optional<Boolean> force) {
      if (force == null) {
        throw new NullPointerException("Null force");
      }
      this.force = force;
      return this;
    }
    @Override
    public DeleteDocumentConfig build() {
      return new AutoValue_DeleteDocumentConfig(
          this.httpOptions,
          this.force);
    }
  }

}

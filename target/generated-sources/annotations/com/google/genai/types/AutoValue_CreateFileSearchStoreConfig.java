package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateFileSearchStoreConfig extends CreateFileSearchStoreConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<String> displayName;

  private AutoValue_CreateFileSearchStoreConfig(
      Optional<HttpOptions> httpOptions,
      Optional<String> displayName) {
    this.httpOptions = httpOptions;
    this.displayName = displayName;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("displayName")
  @Override
  public Optional<String> displayName() {
    return displayName;
  }

  @Override
  public String toString() {
    return "CreateFileSearchStoreConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "displayName=" + displayName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateFileSearchStoreConfig) {
      CreateFileSearchStoreConfig that = (CreateFileSearchStoreConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.displayName.equals(that.displayName());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    return h$;
  }

  @Override
  public CreateFileSearchStoreConfig.Builder toBuilder() {
    return new AutoValue_CreateFileSearchStoreConfig.Builder(this);
  }

  static final class Builder extends CreateFileSearchStoreConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    Builder() {
    }
    Builder(CreateFileSearchStoreConfig source) {
      this.httpOptions = source.httpOptions();
      this.displayName = source.displayName();
    }
    @Override
    public CreateFileSearchStoreConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    CreateFileSearchStoreConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public CreateFileSearchStoreConfig.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    CreateFileSearchStoreConfig.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public CreateFileSearchStoreConfig build() {
      return new AutoValue_CreateFileSearchStoreConfig(
          this.httpOptions,
          this.displayName);
    }
  }

}

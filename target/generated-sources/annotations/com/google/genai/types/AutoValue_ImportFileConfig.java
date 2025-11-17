package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ImportFileConfig extends ImportFileConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<List<CustomMetadata>> customMetadata;

  private final Optional<ChunkingConfig> chunkingConfig;

  private AutoValue_ImportFileConfig(
      Optional<HttpOptions> httpOptions,
      Optional<List<CustomMetadata>> customMetadata,
      Optional<ChunkingConfig> chunkingConfig) {
    this.httpOptions = httpOptions;
    this.customMetadata = customMetadata;
    this.chunkingConfig = chunkingConfig;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("customMetadata")
  @Override
  public Optional<List<CustomMetadata>> customMetadata() {
    return customMetadata;
  }

  @JsonProperty("chunkingConfig")
  @Override
  public Optional<ChunkingConfig> chunkingConfig() {
    return chunkingConfig;
  }

  @Override
  public String toString() {
    return "ImportFileConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "customMetadata=" + customMetadata + ", "
        + "chunkingConfig=" + chunkingConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ImportFileConfig) {
      ImportFileConfig that = (ImportFileConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.customMetadata.equals(that.customMetadata())
          && this.chunkingConfig.equals(that.chunkingConfig());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= customMetadata.hashCode();
    h$ *= 1000003;
    h$ ^= chunkingConfig.hashCode();
    return h$;
  }

  @Override
  public ImportFileConfig.Builder toBuilder() {
    return new AutoValue_ImportFileConfig.Builder(this);
  }

  static final class Builder extends ImportFileConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<List<CustomMetadata>> customMetadata = Optional.empty();
    private Optional<ChunkingConfig> chunkingConfig = Optional.empty();
    Builder() {
    }
    Builder(ImportFileConfig source) {
      this.httpOptions = source.httpOptions();
      this.customMetadata = source.customMetadata();
      this.chunkingConfig = source.chunkingConfig();
    }
    @Override
    public ImportFileConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    ImportFileConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public ImportFileConfig.Builder customMetadata(List<CustomMetadata> customMetadata) {
      this.customMetadata = Optional.of(customMetadata);
      return this;
    }
    @Override
    ImportFileConfig.Builder customMetadata(Optional<List<CustomMetadata>> customMetadata) {
      if (customMetadata == null) {
        throw new NullPointerException("Null customMetadata");
      }
      this.customMetadata = customMetadata;
      return this;
    }
    @Override
    public ImportFileConfig.Builder chunkingConfig(ChunkingConfig chunkingConfig) {
      this.chunkingConfig = Optional.of(chunkingConfig);
      return this;
    }
    @Override
    ImportFileConfig.Builder chunkingConfig(Optional<ChunkingConfig> chunkingConfig) {
      if (chunkingConfig == null) {
        throw new NullPointerException("Null chunkingConfig");
      }
      this.chunkingConfig = chunkingConfig;
      return this;
    }
    @Override
    public ImportFileConfig build() {
      return new AutoValue_ImportFileConfig(
          this.httpOptions,
          this.customMetadata,
          this.chunkingConfig);
    }
  }

}

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UploadToFileSearchStoreConfig extends UploadToFileSearchStoreConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Boolean> shouldReturnHttpResponse;

  private final Optional<String> mimeType;

  private final Optional<String> displayName;

  private final Optional<List<CustomMetadata>> customMetadata;

  private final Optional<ChunkingConfig> chunkingConfig;

  private AutoValue_UploadToFileSearchStoreConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Boolean> shouldReturnHttpResponse,
      Optional<String> mimeType,
      Optional<String> displayName,
      Optional<List<CustomMetadata>> customMetadata,
      Optional<ChunkingConfig> chunkingConfig) {
    this.httpOptions = httpOptions;
    this.shouldReturnHttpResponse = shouldReturnHttpResponse;
    this.mimeType = mimeType;
    this.displayName = displayName;
    this.customMetadata = customMetadata;
    this.chunkingConfig = chunkingConfig;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("shouldReturnHttpResponse")
  @Override
  public Optional<Boolean> shouldReturnHttpResponse() {
    return shouldReturnHttpResponse;
  }

  @JsonProperty("mimeType")
  @Override
  public Optional<String> mimeType() {
    return mimeType;
  }

  @JsonProperty("displayName")
  @Override
  public Optional<String> displayName() {
    return displayName;
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
    return "UploadToFileSearchStoreConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "shouldReturnHttpResponse=" + shouldReturnHttpResponse + ", "
        + "mimeType=" + mimeType + ", "
        + "displayName=" + displayName + ", "
        + "customMetadata=" + customMetadata + ", "
        + "chunkingConfig=" + chunkingConfig
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UploadToFileSearchStoreConfig) {
      UploadToFileSearchStoreConfig that = (UploadToFileSearchStoreConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.shouldReturnHttpResponse.equals(that.shouldReturnHttpResponse())
          && this.mimeType.equals(that.mimeType())
          && this.displayName.equals(that.displayName())
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
    h$ ^= shouldReturnHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= mimeType.hashCode();
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    h$ *= 1000003;
    h$ ^= customMetadata.hashCode();
    h$ *= 1000003;
    h$ ^= chunkingConfig.hashCode();
    return h$;
  }

  @Override
  public UploadToFileSearchStoreConfig.Builder toBuilder() {
    return new AutoValue_UploadToFileSearchStoreConfig.Builder(this);
  }

  static final class Builder extends UploadToFileSearchStoreConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Boolean> shouldReturnHttpResponse = Optional.empty();
    private Optional<String> mimeType = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<List<CustomMetadata>> customMetadata = Optional.empty();
    private Optional<ChunkingConfig> chunkingConfig = Optional.empty();
    Builder() {
    }
    Builder(UploadToFileSearchStoreConfig source) {
      this.httpOptions = source.httpOptions();
      this.shouldReturnHttpResponse = source.shouldReturnHttpResponse();
      this.mimeType = source.mimeType();
      this.displayName = source.displayName();
      this.customMetadata = source.customMetadata();
      this.chunkingConfig = source.chunkingConfig();
    }
    @Override
    public UploadToFileSearchStoreConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    UploadToFileSearchStoreConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public UploadToFileSearchStoreConfig.Builder shouldReturnHttpResponse(boolean shouldReturnHttpResponse) {
      this.shouldReturnHttpResponse = Optional.of(shouldReturnHttpResponse);
      return this;
    }
    @Override
    UploadToFileSearchStoreConfig.Builder shouldReturnHttpResponse(Optional<Boolean> shouldReturnHttpResponse) {
      if (shouldReturnHttpResponse == null) {
        throw new NullPointerException("Null shouldReturnHttpResponse");
      }
      this.shouldReturnHttpResponse = shouldReturnHttpResponse;
      return this;
    }
    @Override
    public UploadToFileSearchStoreConfig.Builder mimeType(String mimeType) {
      this.mimeType = Optional.of(mimeType);
      return this;
    }
    @Override
    UploadToFileSearchStoreConfig.Builder mimeType(Optional<String> mimeType) {
      if (mimeType == null) {
        throw new NullPointerException("Null mimeType");
      }
      this.mimeType = mimeType;
      return this;
    }
    @Override
    public UploadToFileSearchStoreConfig.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    UploadToFileSearchStoreConfig.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public UploadToFileSearchStoreConfig.Builder customMetadata(List<CustomMetadata> customMetadata) {
      this.customMetadata = Optional.of(customMetadata);
      return this;
    }
    @Override
    UploadToFileSearchStoreConfig.Builder customMetadata(Optional<List<CustomMetadata>> customMetadata) {
      if (customMetadata == null) {
        throw new NullPointerException("Null customMetadata");
      }
      this.customMetadata = customMetadata;
      return this;
    }
    @Override
    public UploadToFileSearchStoreConfig.Builder chunkingConfig(ChunkingConfig chunkingConfig) {
      this.chunkingConfig = Optional.of(chunkingConfig);
      return this;
    }
    @Override
    UploadToFileSearchStoreConfig.Builder chunkingConfig(Optional<ChunkingConfig> chunkingConfig) {
      if (chunkingConfig == null) {
        throw new NullPointerException("Null chunkingConfig");
      }
      this.chunkingConfig = chunkingConfig;
      return this;
    }
    @Override
    public UploadToFileSearchStoreConfig build() {
      return new AutoValue_UploadToFileSearchStoreConfig(
          this.httpOptions,
          this.shouldReturnHttpResponse,
          this.mimeType,
          this.displayName,
          this.customMetadata,
          this.chunkingConfig);
    }
  }

}

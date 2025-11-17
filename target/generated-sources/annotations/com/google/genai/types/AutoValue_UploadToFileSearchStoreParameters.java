package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UploadToFileSearchStoreParameters extends UploadToFileSearchStoreParameters {

  private final Optional<String> fileSearchStoreName;

  private final Optional<UploadToFileSearchStoreConfig> config;

  private AutoValue_UploadToFileSearchStoreParameters(
      Optional<String> fileSearchStoreName,
      Optional<UploadToFileSearchStoreConfig> config) {
    this.fileSearchStoreName = fileSearchStoreName;
    this.config = config;
  }

  @JsonProperty("fileSearchStoreName")
  @Override
  public Optional<String> fileSearchStoreName() {
    return fileSearchStoreName;
  }

  @JsonProperty("config")
  @Override
  public Optional<UploadToFileSearchStoreConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "UploadToFileSearchStoreParameters{"
        + "fileSearchStoreName=" + fileSearchStoreName + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UploadToFileSearchStoreParameters) {
      UploadToFileSearchStoreParameters that = (UploadToFileSearchStoreParameters) o;
      return this.fileSearchStoreName.equals(that.fileSearchStoreName())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= fileSearchStoreName.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public UploadToFileSearchStoreParameters.Builder toBuilder() {
    return new AutoValue_UploadToFileSearchStoreParameters.Builder(this);
  }

  static final class Builder extends UploadToFileSearchStoreParameters.Builder {
    private Optional<String> fileSearchStoreName = Optional.empty();
    private Optional<UploadToFileSearchStoreConfig> config = Optional.empty();
    Builder() {
    }
    Builder(UploadToFileSearchStoreParameters source) {
      this.fileSearchStoreName = source.fileSearchStoreName();
      this.config = source.config();
    }
    @Override
    public UploadToFileSearchStoreParameters.Builder fileSearchStoreName(String fileSearchStoreName) {
      this.fileSearchStoreName = Optional.of(fileSearchStoreName);
      return this;
    }
    @Override
    UploadToFileSearchStoreParameters.Builder fileSearchStoreName(Optional<String> fileSearchStoreName) {
      if (fileSearchStoreName == null) {
        throw new NullPointerException("Null fileSearchStoreName");
      }
      this.fileSearchStoreName = fileSearchStoreName;
      return this;
    }
    @Override
    public UploadToFileSearchStoreParameters.Builder config(UploadToFileSearchStoreConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    UploadToFileSearchStoreParameters.Builder config(Optional<UploadToFileSearchStoreConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public UploadToFileSearchStoreParameters build() {
      return new AutoValue_UploadToFileSearchStoreParameters(
          this.fileSearchStoreName,
          this.config);
    }
  }

}

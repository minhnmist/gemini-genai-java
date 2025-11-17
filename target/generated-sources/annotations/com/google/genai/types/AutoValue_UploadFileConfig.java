package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UploadFileConfig extends UploadFileConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<String> name;

  private final Optional<String> mimeType;

  private final Optional<String> displayName;

  private AutoValue_UploadFileConfig(
      Optional<HttpOptions> httpOptions,
      Optional<String> name,
      Optional<String> mimeType,
      Optional<String> displayName) {
    this.httpOptions = httpOptions;
    this.name = name;
    this.mimeType = mimeType;
    this.displayName = displayName;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
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

  @Override
  public String toString() {
    return "UploadFileConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "name=" + name + ", "
        + "mimeType=" + mimeType + ", "
        + "displayName=" + displayName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UploadFileConfig) {
      UploadFileConfig that = (UploadFileConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.name.equals(that.name())
          && this.mimeType.equals(that.mimeType())
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
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= mimeType.hashCode();
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    return h$;
  }

  @Override
  public UploadFileConfig.Builder toBuilder() {
    return new AutoValue_UploadFileConfig.Builder(this);
  }

  static final class Builder extends UploadFileConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<String> mimeType = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    Builder() {
    }
    Builder(UploadFileConfig source) {
      this.httpOptions = source.httpOptions();
      this.name = source.name();
      this.mimeType = source.mimeType();
      this.displayName = source.displayName();
    }
    @Override
    public UploadFileConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    UploadFileConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public UploadFileConfig.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    UploadFileConfig.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public UploadFileConfig.Builder mimeType(String mimeType) {
      this.mimeType = Optional.of(mimeType);
      return this;
    }
    @Override
    UploadFileConfig.Builder mimeType(Optional<String> mimeType) {
      if (mimeType == null) {
        throw new NullPointerException("Null mimeType");
      }
      this.mimeType = mimeType;
      return this;
    }
    @Override
    public UploadFileConfig.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    UploadFileConfig.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public UploadFileConfig build() {
      return new AutoValue_UploadFileConfig(
          this.httpOptions,
          this.name,
          this.mimeType,
          this.displayName);
    }
  }

}

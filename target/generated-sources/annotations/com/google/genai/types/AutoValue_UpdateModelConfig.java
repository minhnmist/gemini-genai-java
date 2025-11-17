package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UpdateModelConfig extends UpdateModelConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<String> displayName;

  private final Optional<String> description;

  private final Optional<String> defaultCheckpointId;

  private AutoValue_UpdateModelConfig(
      Optional<HttpOptions> httpOptions,
      Optional<String> displayName,
      Optional<String> description,
      Optional<String> defaultCheckpointId) {
    this.httpOptions = httpOptions;
    this.displayName = displayName;
    this.description = description;
    this.defaultCheckpointId = defaultCheckpointId;
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

  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return description;
  }

  @JsonProperty("defaultCheckpointId")
  @Override
  public Optional<String> defaultCheckpointId() {
    return defaultCheckpointId;
  }

  @Override
  public String toString() {
    return "UpdateModelConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "displayName=" + displayName + ", "
        + "description=" + description + ", "
        + "defaultCheckpointId=" + defaultCheckpointId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpdateModelConfig) {
      UpdateModelConfig that = (UpdateModelConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.displayName.equals(that.displayName())
          && this.description.equals(that.description())
          && this.defaultCheckpointId.equals(that.defaultCheckpointId());
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
    h$ *= 1000003;
    h$ ^= description.hashCode();
    h$ *= 1000003;
    h$ ^= defaultCheckpointId.hashCode();
    return h$;
  }

  @Override
  public UpdateModelConfig.Builder toBuilder() {
    return new AutoValue_UpdateModelConfig.Builder(this);
  }

  static final class Builder extends UpdateModelConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<String> description = Optional.empty();
    private Optional<String> defaultCheckpointId = Optional.empty();
    Builder() {
    }
    Builder(UpdateModelConfig source) {
      this.httpOptions = source.httpOptions();
      this.displayName = source.displayName();
      this.description = source.description();
      this.defaultCheckpointId = source.defaultCheckpointId();
    }
    @Override
    public UpdateModelConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    UpdateModelConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public UpdateModelConfig.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    UpdateModelConfig.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public UpdateModelConfig.Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }
    @Override
    UpdateModelConfig.Builder description(Optional<String> description) {
      if (description == null) {
        throw new NullPointerException("Null description");
      }
      this.description = description;
      return this;
    }
    @Override
    public UpdateModelConfig.Builder defaultCheckpointId(String defaultCheckpointId) {
      this.defaultCheckpointId = Optional.of(defaultCheckpointId);
      return this;
    }
    @Override
    UpdateModelConfig.Builder defaultCheckpointId(Optional<String> defaultCheckpointId) {
      if (defaultCheckpointId == null) {
        throw new NullPointerException("Null defaultCheckpointId");
      }
      this.defaultCheckpointId = defaultCheckpointId;
      return this;
    }
    @Override
    public UpdateModelConfig build() {
      return new AutoValue_UpdateModelConfig(
          this.httpOptions,
          this.displayName,
          this.description,
          this.defaultCheckpointId);
    }
  }

}
